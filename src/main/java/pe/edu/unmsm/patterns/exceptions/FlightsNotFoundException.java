package pe.edu.unmsm.patterns.exceptions;

@SuppressWarnings("serial")
public class FlightsNotFoundException extends Exception{

	public FlightsNotFoundException(){
		super("No se encontraron vuelos en con los parámetros ingresados");
	}
}
