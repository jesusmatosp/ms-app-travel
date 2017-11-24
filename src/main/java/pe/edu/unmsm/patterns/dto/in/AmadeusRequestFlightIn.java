package pe.edu.unmsm.patterns.dto.in;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("AmadeusRequestFlight")
public class AmadeusRequestFlightIn {

	private String apikey;
	private String origin;
	private String destination;
	private String departureDate;
	private boolean oneWay;
	private String duration;
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public boolean isOneWay() {
		return oneWay;
	}
	public void setOneWay(boolean oneWay) {
		this.oneWay = oneWay;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	
	
	
	
}
