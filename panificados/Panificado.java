package panificados;

public abstract class Panificado {
	
	protected int calorias;

	public abstract boolean contieneGluten();
	
	public abstract boolean contieneSal();
	
	public int obtenerCalorias() {
		return this.calorias;
	}
}
