package pe.edu.unmsm.patterns.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "tbl_destination" )
public class Destination {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column( name = "id" )
	private Integer id;
	
	@Column( name = "name" )
	private String code;
	
	@Column( name = "description" )
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
