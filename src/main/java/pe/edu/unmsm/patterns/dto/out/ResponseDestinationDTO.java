package pe.edu.unmsm.patterns.dto.out;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("ResponseDestinationDTO")
public class ResponseDestinationDTO {

	private String message;
	private String code;
	private List<DestinationDTO> lista;
	
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
	public List<DestinationDTO> getLista() {
		return lista;
	}
	public void setLista(List<DestinationDTO> lista) {
		this.lista = lista;
	}
	
	
}
