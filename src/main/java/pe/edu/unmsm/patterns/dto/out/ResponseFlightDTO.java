package pe.edu.unmsm.patterns.dto.out;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("ResponseFlightDTO")
public class ResponseFlightDTO {

	private String message;
	private String code;
	private List<FlightResultDTO> lista;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<FlightResultDTO> getLista() {
		return lista;
	}
	public void setLista(List<FlightResultDTO> lista) {
		this.lista = lista;
	}


}
