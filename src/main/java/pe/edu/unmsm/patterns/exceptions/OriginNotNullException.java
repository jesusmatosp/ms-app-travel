package pe.edu.unmsm.patterns.exceptions;

@SuppressWarnings("serial")
public class OriginNotNullException extends Exception {
	public OriginNotNullException(){
		super("El Código de Origen no puede estar vacío por favor ingrese al menos un valor");
	}
	
}
