package pe.edu.unmsm.patterns.services;

import pe.edu.unmsm.patterns.dto.in.FlightRequestIn;
import pe.edu.unmsm.patterns.dto.out.ResponseFlightDTO;
import pe.edu.unmsm.patterns.exceptions.FlightsNotFoundException;
import pe.edu.unmsm.patterns.exceptions.OriginNotNullException;

public interface FlightsServices {
	
	public ResponseFlightDTO findFlight(FlightRequestIn input) throws OriginNotNullException, FlightsNotFoundException, Exception;
}
