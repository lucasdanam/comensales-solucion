package comensales;

import excepciones.AlimentoNoApto;
import panificados.Panificado;
import restricciones.NoRestriccion;
import restricciones.Restriccion;

public class Persona {

	private Restriccion condicion;
	private int calorias;
	
	public Persona() {
		this.condicion = new NoRestriccion();
	}
	
	public void indicarRestriccion(Restriccion condicion){
		this.condicion=condicion;
	}
	
	public void incorporarCalorias(Panificado pan){
		this.calorias+=pan.obtenerCalorias();
	}

	public void ingerir(Panificado pan) {
		try {
			this.condicion.decideComer(this,pan);
		}catch(AlimentoNoApto e){
				//NADA
		}
	}
	
	public int obtenerNivelCalorias() {
		return this.calorias;
	}
}
