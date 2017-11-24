package pe.edu.unmsm.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

import pe.edu.unmsm.patterns.dto.out.AmadeusResultDTO;
import pe.edu.unmsm.patterns.dto.out.AmadeusResultFlightDTO;
import pe.edu.unmsm.patterns.dto.out.FlightResultDTO;
import pe.edu.unmsm.patterns.dto.out.ResponseFlightDTO;

public class AmadeusResponseAdapter extends AmadeusResultDTO implements PrepareResponseFlight {

    public AmadeusResponseAdapter(List<AmadeusResultFlightDTO> results ) {
		// TODO Auto-generated constructor stub
    	this.setResults(results);
	}
	
	@Override
	public ResponseFlightDTO obtainFlightResponse(List<FlightResultDTO> results, 
			String code, String message) {
		// TODO Auto-generated method stub
		
		ResponseFlightDTO response = new ResponseFlightDTO();
		if(this.getResults().isEmpty()){
			response.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			response.setMessage(HttpStatus.NOT_FOUND.name());
			response.setLista(null);
			return response;
		}
		
		List<AmadeusResultFlightDTO> amadeus = this.getResults();
		List<FlightResultDTO> flightsResults = new ArrayList<>();
		
		for(AmadeusResultFlightDTO amadeusResults : amadeus){
			FlightResultDTO flights = new FlightResultDTO();
			flights.setAirline(amadeusResults.getAirline());
			flights.setDepartureDate(amadeusResults.getDeparture_date());
			flights.setReturnDate(amadeusResults.getReturn_date());
			flights.setPrice(amadeusResults.getPrice());
			flights.setDestination(amadeusResults.getDestination());
			flightsResults.add(flights);
		}
		
		response.setCode(String.valueOf(HttpStatus.OK.value()));
		response.setMessage(HttpStatus.OK.name());
		response.setLista(flightsResults);
	
		return response;
	}

	
	
}
