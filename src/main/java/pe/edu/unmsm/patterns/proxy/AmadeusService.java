package pe.edu.unmsm.patterns.proxy;

import java.util.List;

import pe.edu.unmsm.patterns.dto.in.AmadeusRequestFlightIn;
import pe.edu.unmsm.patterns.dto.out.AmadeusResultDTO;

public interface AmadeusService {

	public AmadeusResultDTO findFlights(AmadeusRequestFlightIn input) throws Exception;
	public void bookingFlight() throws Exception;
	
}
