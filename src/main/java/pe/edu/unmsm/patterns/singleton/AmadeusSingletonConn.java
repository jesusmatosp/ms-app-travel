package pe.edu.unmsm.patterns.singleton;

import org.springframework.beans.factory.annotation.Value;

import pe.edu.unmsm.patterns.dto.in.AmadeusRequestFlightIn;

public class AmadeusSingletonConn {
	
	private static AmadeusSingletonConn instance = null;
	@Value("${module.flight.amadeus.apikey}")
	private String AMADEUS_API_KEY;
	
	private AmadeusSingletonConn(){
		
	}
	
	public AmadeusRequestFlightIn connectAmadeus(AmadeusRequestFlightIn input){
		input.setApikey(AMADEUS_API_KEY);
		return input;
	}
	
	public static synchronized AmadeusSingletonConn getInstance(){
		if(instance == null){
			instance = new AmadeusSingletonConn();
		}
		return instance;
	}
}
