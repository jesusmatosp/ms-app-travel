package pe.edu.unmsm.patterns.services;

import pe.edu.unmsm.patterns.adapter.AmadeusResponseAdapter;
import pe.edu.unmsm.patterns.dto.in.AmadeusRequestFlightIn;
import pe.edu.unmsm.patterns.dto.in.FlightRequestIn;
import pe.edu.unmsm.patterns.dto.out.AmadeusResultDTO;
import pe.edu.unmsm.patterns.dto.out.ResponseFlightDTO;
import pe.edu.unmsm.patterns.exceptions.FlightsNotFoundException;
import pe.edu.unmsm.patterns.exceptions.OriginNotNullException;
import pe.edu.unmsm.patterns.interpreter.Expression;
import pe.edu.unmsm.patterns.interpreter.TerminalExpression;
import pe.edu.unmsm.patterns.proxy.AmadeusService;
import pe.edu.unmsm.patterns.proxy.AmadeusServiceImpl;
import pe.edu.unmsm.patterns.proxy.SecurityProxy;

public class AmadeusFlightService implements FlightsServices {

	@Override
	public ResponseFlightDTO findFlight(FlightRequestIn input) throws OriginNotNullException, FlightsNotFoundException, Exception {
		// TODO Auto-generated method stub
		if(input.getOrigin() == null || input.getOrigin().isEmpty()) throw new OriginNotNullException();
		// Invoke Proxy Pattern
		AmadeusService amadeusServices = (AmadeusService) SecurityProxy.newInstance(new AmadeusServiceImpl());
		AmadeusResultDTO flights =  amadeusServices.findFlights(prepareParameters(input));
		if(flights == null) throw new FlightsNotFoundException();
		// Invoke Adapter
		AmadeusResponseAdapter adapterAmadeus = new AmadeusResponseAdapter(flights.getResults());
		ResponseFlightDTO response = adapterAmadeus.obtainFlightResponse(null, null, null);
		return response;
	}
	
	public AmadeusRequestFlightIn prepareParameters(FlightRequestIn request){
		AmadeusRequestFlightIn input = new AmadeusRequestFlightIn();
		input.setOrigin(request.getOrigin());
		input.setDestination(request.getDestination());
		input.setOneWay(request.isOneWay());
		if(!request.getReturnDate().isEmpty()){
			input.setDepartureDate(request.getDepartureDate()+"--"+request.getReturnDate());
		}
		input.setDepartureDate(request.getDepartureDate());
		return input;
	}
	
}
