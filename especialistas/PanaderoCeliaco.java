package especialistas;

import panificados.FacturaCeliaca;
import panificados.PanCeliaco;
import panificados.Panificado;

public class PanaderoCeliaco extends Panadero {

	public Panificado hacerPan() {
		return new PanCeliaco();
	}
	
	public Panificado hacerFactura() {
		return new FacturaCeliaca();
	}

}