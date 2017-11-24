package pe.edu.unmsm.patterns.dto.out;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("AmadeusResultDTO")
public class AmadeusResultDTO {

	private String origin;
	private String currency;
	private List<AmadeusResultFlightDTO> results;
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<AmadeusResultFlightDTO> getResults() {
		return results;
	}
	public void setResults(List<AmadeusResultFlightDTO> results) {
		this.results = results;
	}
	
}
