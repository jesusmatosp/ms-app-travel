package pe.edu.unmsm.patterns.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unmsm.patterns.dto.in.FlightRequestIn;
import pe.edu.unmsm.patterns.dto.out.DestinationDTO;
import pe.edu.unmsm.patterns.dto.out.ResponseDestinationDTO;
import pe.edu.unmsm.patterns.dto.out.ResponseFlightDTO;
import pe.edu.unmsm.patterns.exceptions.DestinationEmptyException;
import pe.edu.unmsm.patterns.exceptions.FlightsNotFoundException;
import pe.edu.unmsm.patterns.exceptions.OriginNotNullException;
import pe.edu.unmsm.patterns.services.DestinationService;
import pe.edu.unmsm.patterns.services.FlightsServices;
import pe.edu.unmsm.patterns.services.FlightsServicesFactory;

@RestController
public class FindTravelControllers {

	@Autowired
	private FlightsServicesFactory flightFactory;
	
	@Autowired
	private DestinationService destinationService;
	
	@CrossOrigin(origins = {"http://localhost:9000"})
	@PostMapping("/find-flights")
	private ResponseFlightDTO getFlights(@RequestBody FlightRequestIn input){
		FlightsServices service = flightFactory.findProvider(input.getCodeProvider());
		ResponseFlightDTO response = new ResponseFlightDTO();
		try {
			response = service.findFlight(input);	
		}catch (OriginNotNullException e) {
			// TODO: handle exception
			response.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			response.setMessage(e.getLocalizedMessage());
		} catch (FlightsNotFoundException e) {
			// TODO: handle exception
			response.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			response.setMessage(e.getLocalizedMessage());
		} catch (Exception e) {
			response.setCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
			response.setMessage(e.getMessage());
		}
		return response;
	}
	
	@CrossOrigin(origins = {"http://localhost:9000"})
	@GetMapping("/all-destination")
	private ResponseDestinationDTO getAllDestination(){
		ResponseDestinationDTO response = new ResponseDestinationDTO();
		try {
			List<DestinationDTO> destination = destinationService.findAllDestination();
			response.setCode(String.valueOf(HttpStatus.OK.value()));
			response.setMessage(HttpStatus.OK.name());
			response.setLista(destination);
		}catch (DestinationEmptyException e) {
			// TODO: handle exception
			response.setCode(String.valueOf(HttpStatus.NO_CONTENT));
			response.setMessage(e.getMessage());
		} catch (Exception e) {
			response.setCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
			response.setMessage(e.getMessage());
		}
		return response;
	}
	
}
