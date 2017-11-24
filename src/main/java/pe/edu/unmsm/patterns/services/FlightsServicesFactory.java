package pe.edu.unmsm.patterns.services;

import org.springframework.stereotype.Service;

@Service
public class FlightsServicesFactory {

	
	
	// Factory Method
	public FlightsServices findProvider(String codeProvider){
		if(codeProvider.equals("AM")){
			return new AmadeusFlightService();
		}else if(codeProvider.equals("SA")){
			return new SabreFlightService();
		}else if(codeProvider.equals("TRA")){
			return new TravelocityFlightService();
		}
		return new AllProvidersTravelService();
	}
	
}
