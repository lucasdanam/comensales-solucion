package especialistas;

import panificados.Panificado;

public class Masterchef{
	private Panadero estado;
	
	public  Masterchef() {
		this.estado= new PanaderoEstandar();
	}

	public Panificado hacerPan() {
		return estado.hacerPan();
	}
		
	public Panificado hacerFactura() {
		return estado.hacerFactura();
	}
	
	public void panificarComo(Panadero tipoPanadero){
		this.estado=tipoPanadero;
	}
}

