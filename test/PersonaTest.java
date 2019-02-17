package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import comensales.Persona;
import especialistas.Panadero;
import especialistas.PanaderoCeliaco;
import especialistas.PanaderoEstandar;
import especialistas.PanaderoParaHipertensos;
import panificados.Panificado;
import restricciones.Celiaquia;
import restricciones.Hipertension;
import restricciones.Restriccion;

public class PersonaTest {
	
	@Test
	public void personaNoCeliacaNoComeNadaNoIncorporaCalorias() {
		
		Persona personaNoCeliaca = new Persona();
		Assert.assertEquals(personaNoCeliaca.obtenerNivelCalorias(),0);
	}
	
	@Test
	public void personaNoCeliacaComePanParaCeliacosIncorpora10Calorias() {
		
		Persona personaNoCeliaca = new Persona();
		Panadero panadero = new PanaderoEstandar();
		Panificado pan = panadero.hacerPan();
		personaNoCeliaca.ingerir(pan);
		Assert.assertEquals(personaNoCeliaca.obtenerNivelCalorias(),10);
	}
	
	@Test
	public void personaCeliacaComePanParaCeliacosIncorpora10Calorias() {
		
		Restriccion celiaquia= new Celiaquia();
		Persona personaCeliaca = new Persona();
		personaCeliaca.indicarRestriccion(celiaquia);
		Panadero panadero = new PanaderoCeliaco();
		Panificado pan = panadero.hacerPan();
		personaCeliaca.ingerir(pan);
		Assert.assertEquals(personaCeliaca.obtenerNivelCalorias(),10);
	}
	
	@Test
	public void personaCeliacaComeFacturaParaCeliacosIncorpora15Calorias() {
		
		Restriccion celiaquia= new Celiaquia();
		Persona personaCeliaca = new Persona();
		personaCeliaca.indicarRestriccion(celiaquia);
		Panadero panadero = new PanaderoCeliaco();
		Panificado fact = panadero.hacerFactura();
		personaCeliaca.ingerir(fact);
		Assert.assertEquals(personaCeliaca.obtenerNivelCalorias(),15);
	}
	
	@Test
	public void personaCeliacaIntentaComerFacturaConGlutenNoIncorporaCalorias() {
		
		Restriccion celiaquia= new Celiaquia();
		Persona personaCeliaca = new Persona();
		personaCeliaca.indicarRestriccion(celiaquia);
		Panadero panadero = new PanaderoEstandar();
		Panificado fact = panadero.hacerFactura();
		personaCeliaca.ingerir(fact);
		Assert.assertEquals(personaCeliaca.obtenerNivelCalorias(),0);
	}
	
	@Test
	public void personaCeliacaIntentaComerPanConGlutenNoIncorporaCalorias() {
		
		Restriccion celiaquia= new Celiaquia();
		Persona personaCeliaca = new Persona();
		personaCeliaca.indicarRestriccion(celiaquia);
		Panadero panadero = new PanaderoEstandar();
		Panificado pan = panadero.hacerPan();
		personaCeliaca.ingerir(pan);
		Assert.assertEquals(personaCeliaca.obtenerNivelCalorias(),0);
	}
	
	@Test
	public void personaCeliacaIntentaComerParaHipertensosNoIncorporaCalorias() {
		
		Restriccion celiaquia= new Celiaquia();
		Persona personaCeliaca = new Persona();
		personaCeliaca.indicarRestriccion(celiaquia);
		Panadero panadero = new PanaderoParaHipertensos();
		Panificado pan = panadero.hacerPan();
		personaCeliaca.ingerir(pan);
		Assert.assertEquals(personaCeliaca.obtenerNivelCalorias(),0);
	}
	
	@Test
	public void personaHipertensaIntentaComerPanComunNoIncorporaCalorias() {
		
		Restriccion hta= new Hipertension();
		Persona personahta= new Persona();
		personahta.indicarRestriccion(hta);
		Panadero panadero = new PanaderoEstandar();
		Panificado pan = panadero.hacerPan();
		personahta.ingerir(pan);
		Assert.assertEquals(personahta.obtenerNivelCalorias(),0);
	}
	
	@Test
	public void personaHipertensaIntentaComerPanComunNoIncorpora10Calorias() {
		
		Restriccion hta= new Hipertension();
		Persona personahta= new Persona();
		personahta.indicarRestriccion(hta);
		Panadero panadero = new PanaderoEstandar();
		Panificado pan = panadero.hacerPan();
		personahta.ingerir(pan);
		Assert.assertNotEquals(personahta.obtenerNivelCalorias(),10);
	}
	
	@Test
	public void personaHipertensaComePanSinSalIncorpora10Calorias() {
		
		Restriccion hta= new Hipertension();
		Persona personahta= new Persona();
		personahta.indicarRestriccion(hta);
		Panadero panadero = new PanaderoParaHipertensos();
		Panificado pan = panadero.hacerPan();
		personahta.ingerir(pan);
		Assert.assertEquals(personahta.obtenerNivelCalorias(),10);
	}

}
