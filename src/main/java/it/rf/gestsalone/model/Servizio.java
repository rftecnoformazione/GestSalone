package it.rf.gestsalone.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="servizio")
public class Servizio {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codServizio;
	
	@Column
	private String nomeServizio;
	
	
	@Column
	private Float costoServizio;
	
	@Column
	private Integer durataServizio;

	@OneToMany(mappedBy="servizio")
	private List<Contiene> contiene;

	public Integer getCodServizio() {
		return codServizio;
	}

	public void setCodServizio(Integer codServizio) {
		this.codServizio = codServizio;
	}

	public Float getCostoServizio() {
		return costoServizio;
	}

	public void setCostoServizio(Float costoServizio) {
		this.costoServizio = costoServizio;
	}

	public Integer getDurataServizio() {
		return durataServizio;
	}

	public void setDurataServizio(Integer durataServizio) {
		this.durataServizio = durataServizio;
	}

	public List<Contiene> getContiene() {
		return contiene;
	}

	public void setContiene(List<Contiene> contiene) {
		this.contiene = contiene;
	}


	public String getNomeServizio() {
		return nomeServizio;
	}

	public void setNomeServizio(String nomeServizio) {
		this.nomeServizio = nomeServizio;
	}

}
