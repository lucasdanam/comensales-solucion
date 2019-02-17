package restricciones;

import comensales.Persona;
import excepciones.AlimentoNoApto;
import panificados.Panificado;

public class NoRestriccion extends Restriccion{

	public void decideComer(Persona persona, Panificado pan) throws AlimentoNoApto {
		persona.incorporarCalorias(pan);
	}
}
