package it.rf.gestsalone.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contiene")
public class Contiene {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idOperazione;
	
	@Column
	private Boolean statoOperazione;
	
	@Column
	private Date dataEsecuzione;
	
	public Date getDataEsecuzione() {
		return dataEsecuzione;
	}

	public void setDataEsecuzione(Date dataEsecuzione) {
		this.dataEsecuzione = dataEsecuzione;
	}

	@ManyToOne
	private Servizio servizio;

	@ManyToOne
	private Prenotazione prenotazione;
	
	@ManyToOne
	private Operatore operatorec;

	public Integer getIdOperazione() {
		return idOperazione;
	}

	public void setIdOperazione(Integer idOperazione) {
		this.idOperazione = idOperazione;
	}


	public Boolean getStatoOperazione() {
		return statoOperazione;
	}

	public void setStatoOperazione(Boolean statoOperazione) {
		this.statoOperazione = statoOperazione;
	}

	public Servizio getServizio() {
		return servizio;
	}

	public void setServizio(Servizio servizio) {
		this.servizio = servizio;
	}

	public Prenotazione getPrenotazione() {
		return prenotazione;
	}

	public void setPrenotazione(Prenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}

	public Operatore getOperatorec() {
		return operatorec;
	}

	public void setOperatorec(Operatore operatorec) {
		this.operatorec = operatorec;
	}

	
	
	
}
