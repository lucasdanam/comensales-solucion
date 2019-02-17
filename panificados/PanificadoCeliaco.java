package panificados;

public class PanificadoCeliaco extends Panificado{
	
	public boolean contieneGluten() {
		return false;
	}
	
	public boolean contieneSal() {
		return true;
	}
}
