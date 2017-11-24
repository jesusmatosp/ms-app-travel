package pe.edu.unmsm.patterns.adapter;

import java.util.List;

import pe.edu.unmsm.patterns.dto.out.FlightResultDTO;
import pe.edu.unmsm.patterns.dto.out.ResponseFlightDTO;

public class ResponseFlightGeneral implements PrepareResponseFlight {

	@Override
	public ResponseFlightDTO obtainFlightResponse(List<FlightResultDTO> results,
			String code, String message) {
		// TODO Auto-generated method stub
		ResponseFlightDTO response = new ResponseFlightDTO();
		response.setCode(code);
		response.setMessage(message);
		response.setLista(results);
		return response;
	}

}
