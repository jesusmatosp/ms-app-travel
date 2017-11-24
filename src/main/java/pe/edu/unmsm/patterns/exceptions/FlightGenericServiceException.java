package pe.edu.unmsm.patterns.exceptions;

@SuppressWarnings("serial")
public class FlightGenericServiceException extends Exception {

	public FlightGenericServiceException(){
		super("Ocurrió un Error General En la aplicación, por favor pongase en contacto con su Administrador"
				+ " de Sistema");
	}
}
