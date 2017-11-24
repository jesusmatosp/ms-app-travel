package pe.edu.unmsm.patterns.dto.out;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("FlightResultDTO")
public class FlightResultDTO {

	private String destination;
	private String departureDate;
	private String returnDate;
	private double price;
	private String airline;
	
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
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}

}
