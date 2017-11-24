package pe.edu.unmsm.patterns.exceptions;

@SuppressWarnings("serial")
public class DestinationEmptyException extends Exception {

	public DestinationEmptyException(){
		super("No se encontraron Destinos en la Base de Datos");
	}
}
