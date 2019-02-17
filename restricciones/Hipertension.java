package restricciones;

import comensales.Persona;
import excepciones.AlimentoNoApto;
import panificados.Panificado;

public class Hipertension extends Restriccion {
	
	public void decideComer(Persona persona, Panificado pan) throws AlimentoNoApto{
		if (pan.contieneSal()){
			throw new AlimentoNoApto();
		}else {
			persona.incorporarCalorias(pan);
		}
	}

}
