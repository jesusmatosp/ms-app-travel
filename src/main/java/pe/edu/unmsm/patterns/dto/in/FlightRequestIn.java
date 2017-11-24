package pe.edu.unmsm.patterns.dto.in;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("FlightRequestIn")
public class FlightRequestIn {

	private String origin;
	private String departureDate;
	private String returnDate;
	private String destination;
	private boolean oneWay;
	private String codeProvider;
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public boolean isOneWay() {
		return oneWay;
	}
	public void setOneWay(boolean oneWay) {
		this.oneWay = oneWay;
	}
	public String getCodeProvider() {
		return codeProvider;
	}
	public void setCodeProvider(String codeProvider) {
		this.codeProvider = codeProvider;
	}
	
	
	
}
