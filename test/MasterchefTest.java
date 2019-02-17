package test;

import org.junit.Assert;

import org.junit.Test;

import especialistas.Masterchef;
import especialistas.PanaderoCeliaco;
import especialistas.PanaderoParaHipertensos;
import panificados.Panificado;

public class MasterchefTest {
	
	@Test
	public void MasterchefPorDefectoHacePanificadoComun(){
		Masterchef masterchef=new Masterchef();
		Panificado pan= masterchef.hacerPan();
		Assert.assertEquals(true, pan.contieneGluten());
	}
	
	@Test
	public void masterchefModoPanaderoCeliacoHacePanificadoSinGluten(){
		Masterchef masterchef=new Masterchef();
		masterchef.panificarComo(new PanaderoCeliaco());
		Panificado pan= masterchef.hacerPan();
		Assert.assertEquals(false, pan.contieneGluten());
	}
	
	@Test
	public void masterchefModoPanaderoParaHipertensosHacePanificadoSinSal(){
		Masterchef masterchef=new Masterchef();
		masterchef.panificarComo(new PanaderoParaHipertensos());
		Panificado pan= masterchef.hacerPan();
		Assert.assertEquals(false, pan.contieneSal());
	}
}
