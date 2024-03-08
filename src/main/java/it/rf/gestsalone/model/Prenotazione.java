package it.rf.gestsalone.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Prenotazione")
public class Prenotazione {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codPrenotazione;
	
	@Column
	private Date dataPrenotazione;
	
	@Column
	private Boolean statoPrenotazione;
	
	@OneToMany(mappedBy="prenotazione")
	private List<Contiene> listacontiene;
	
	@ManyToOne
	private Cliente cliente;

	public Integer getCodPrenotazione() {
		return codPrenotazione;
	}

	public void setCodPrenotazione(Integer codPrenotazione) {
		this.codPrenotazione = codPrenotazione;
	}

	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	public Boolean getStatoPrenotazione() {
		return statoPrenotazione;
	}

	public void setStatoPrenotazione(Boolean statoPrenotazione) {
		this.statoPrenotazione = statoPrenotazione;
	}

	public List<Contiene> getListacontiene() {
		return listacontiene;
	}

	public void setListacontiene(List<Contiene> listacontiene) {
		this.listacontiene = listacontiene;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	

}
