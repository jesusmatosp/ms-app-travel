package pe.edu.unmsm.patterns.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pe.edu.unmsm.patterns.dto.in.AmadeusRequestFlightIn;
import pe.edu.unmsm.patterns.dto.out.AmadeusResultDTO;
import pe.edu.unmsm.patterns.singleton.AmadeusSingletonConn;

public class AmadeusServiceImpl implements AmadeusService {

	private static final String API_KEY = "kH2iX7yAG0i3iY09nc7GYritegeT7c5u";
	private static final String URL_SERVICE_FLIGHT_AMADEUS = "https://api.sandbox.amadeus.com/v1.2/flights/inspiration-search";

	@Override
	public AmadeusResultDTO findFlights(AmadeusRequestFlightIn input) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Servicio AMADEUS: " + URL_SERVICE_FLIGHT_AMADEUS);
		AmadeusResultDTO amadeusResult = null;
		RestTemplate restTemplate = new RestTemplate();
		String url = URL_SERVICE_FLIGHT_AMADEUS + "?apikey="+API_KEY+"&origin="+input.getOrigin();
		url = prepareURL(input, url);
		ResponseEntity<AmadeusResultDTO> responseEntity = restTemplate.getForEntity(url,
				AmadeusResultDTO.class);
		HttpStatus status = responseEntity.getStatusCode();
		System.out.println("Object: " + responseEntity.getBody().toString());
		 if(status.value() == HttpStatus.OK.value()){ 
			return responseEntity.getBody();
			 
		 }
		return amadeusResult;
	}

	@Override
	public void bookingFlight() throws Exception {
		// TODO Auto-generated method stub

	}
	
	public String prepareURL(AmadeusRequestFlightIn request, String url){
		if(request.getDepartureDate() != null)
			url = url + "&departure_date="+request.getDepartureDate();
		if(request.getDestination() != null)
			url = url + "&destination="+request.getDestination();
		if(request.getDuration() != null)
			url = url + "&duration="+request.getDuration();
		return url;
	}

}
