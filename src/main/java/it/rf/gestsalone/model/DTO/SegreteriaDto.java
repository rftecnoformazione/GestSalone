package it.rf.gestsalone.model.DTO;

public class SegreteriaDto {
	
	private String nomeCliente;
	private String cognomeCliente;
	private Integer codPrenotazione;
	private Integer idOperazione;
	private String nomeServizio;
	private String nomeOperatore;
	private String cfOperatore;


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
	public Integer getCodPrenotazione() {
		return codPrenotazione;
	}
	public void setCodPrenotazione(Integer codPrenotazione) {
		this.codPrenotazione = codPrenotazione;
	}
	public Integer getIdOperazione() {
		return idOperazione;
	}
	public void setIdOperazione(Integer idOperazione) {
		this.idOperazione = idOperazione;
	}
	public String getNomeServizio() {
		return nomeServizio;
	}
	public void setNomeServizio(String nomeServizio) {
		this.nomeServizio = nomeServizio;
	}
	public String getNomeOperatore() {
		return nomeOperatore;
	}
	public void setNomeOperatore(String nomeOperatore) {
		this.nomeOperatore = nomeOperatore;
	}
	public String getCfOperatore() {
		return cfOperatore;
	}
	public void setCfOperatore(String cfOperatore) {
		this.cfOperatore = cfOperatore;
	}
	public SegreteriaDto(String nomeCliente, String cognomeCliente, Integer codPrenotazione, Integer idOperazione,
			String nomeServizio, String nomeOperatore, String cfOperatore) {
		super();
		this.nomeCliente = nomeCliente;
		this.cognomeCliente = cognomeCliente;
		this.codPrenotazione = codPrenotazione;
		this.idOperazione = idOperazione;
		this.nomeServizio = nomeServizio;
		this.nomeOperatore = nomeOperatore;
		this.cfOperatore = cfOperatore;
	}
	
	
	

	

}
