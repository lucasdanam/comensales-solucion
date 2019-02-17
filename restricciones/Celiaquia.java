package restricciones;

import comensales.Persona;
import excepciones.AlimentoNoApto;
import panificados.Panificado;

public class Celiaquia extends Restriccion{
	
	public void decideComer(Persona persona, Panificado pan) throws AlimentoNoApto{
		if (pan.contieneGluten()){
			throw new AlimentoNoApto();
		}else {
			persona.incorporarCalorias(pan);
		}
	}
	
}
