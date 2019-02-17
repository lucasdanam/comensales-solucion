package especialistas;

import panificados.FacturaComun;
import panificados.PanComun;
import panificados.Panificado;

public class PanaderoEstandar extends Panadero {

	public Panificado hacerPan() {
		return new PanComun();
	}
	
	public Panificado hacerFactura() {
		return new FacturaComun();
	}

}
