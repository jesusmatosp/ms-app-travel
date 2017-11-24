package pe.edu.unmsm.patterns.proxy;

import java.util.List;

import pe.edu.unmsm.patterns.dto.in.AmadeusRequestFlightIn;
import pe.edu.unmsm.patterns.dto.out.AmadeusResultDTO;

public class AmadeusServiceStub implements AmadeusService {

	@Override
	public AmadeusResultDTO findFlights(AmadeusRequestFlightIn input) throws Exception {
		// TODO Auto-generated method stub
		System.out.println( "Buscando Vuelos ... ");
		return null;
	}

	@Override
	public void bookingFlight() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
