package especialistas;

import panificados.FacturaSinSal;
import panificados.PanSinSal;
import panificados.Panificado;

public class PanaderoParaHipertensos extends Panadero{

	public Panificado hacerPan() {
		return new PanSinSal();
	}
	
	public Panificado hacerFactura() {
		return new FacturaSinSal();
	}

}
