package pe.edu.unmsm.patterns.dto.out;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("AmadeusResultFlightDTO")
public class AmadeusResultFlightDTO {

	private String destination;
	private String departure_date;
	private String return_date;
	private double price;
	private String airline;
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
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
