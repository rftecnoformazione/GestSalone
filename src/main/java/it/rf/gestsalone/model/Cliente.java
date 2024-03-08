package it.rf.gestsalone.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@Column(nullable = false)
	private String cfCliente;
	@Column(nullable = false)
	private String nomeCliente;
	@Column
	private String cognomeCliente;
	@Column
    private Boolean abilitazioneCliente;
	@Column
	private String nTelefono;
	@Column
	private String userCliente;
	@Column
	private String pswCliente;
	
	@OneToMany(mappedBy="cliente")
	 private List<Prenotazione> listaprenotazione;
	
	 public String getUserCliente() {
		return userCliente;
	}

	public void setUserCliente(String userCliente) {
		this.userCliente = userCliente;
	}

	public String getPswCliente() {
		return pswCliente;
	}

	public void setPswCliente(String pswCliente) {
		this.pswCliente = pswCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCognomeCliente() {
		return cognomeCliente;
	}

	public void setCognomeCliente(String cognomeCliente) {
		this.cognomeCliente = cognomeCliente;
	}

	public String getCfCliente() {
		return cfCliente;
	}

	public void setCfCliente(String cfCliente) {
		this.cfCliente = cfCliente;
	}

	public Boolean getAbilitazioneCliente() {
		return abilitazioneCliente;
	}

	public void setAbilitazioneCliente(Boolean abilitazioneCliente) {
		this.abilitazioneCliente = abilitazioneCliente;
	}

	public String getnTelefono() {
		return nTelefono;
	}

	public void setnTelefono(String nTelefono) {
		this.nTelefono = nTelefono;
	}

	public List<Prenotazione> getListaprenotazione() {
		return listaprenotazione;
	}

	public void setListaprenotazione(List<Prenotazione> listaprenotazione) {
		this.listaprenotazione = listaprenotazione;
	}

	
    
    
}
