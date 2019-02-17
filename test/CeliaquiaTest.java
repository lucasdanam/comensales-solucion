package test;

import org.junit.jupiter.api.Test;

import comensales.Persona;
import especialistas.Panadero;
import especialistas.PanaderoEstandar;
import excepciones.AlimentoNoApto;
import panificados.Panificado;
import restricciones.Celiaquia;
import restricciones.Restriccion;

public class CeliaquiaTest {
	
	@Test
	public void PersonaCeliacaDecideComerPanNoApto() {
		
		Restriccion cel= new Celiaquia();
		Persona persona= new Persona();
		Panadero panadero = new PanaderoEstandar();
		Panificado pan = panadero.hacerPan();
		boolean thrown=false;
		try{
			cel.decideComer(persona, pan);
		}catch(AlimentoNoApto e) {
			thrown=true;
		}
		
		assert(thrown);
	}
}
