package pe.edu.unmsm.patterns.adapter;

import java.util.List;

import pe.edu.unmsm.patterns.dto.out.FlightResultDTO;
import pe.edu.unmsm.patterns.dto.out.ResponseFlightDTO;

public interface PrepareResponseFlight {

	public ResponseFlightDTO obtainFlightResponse(List<FlightResultDTO> results, 
			String code, String message);
	
}
