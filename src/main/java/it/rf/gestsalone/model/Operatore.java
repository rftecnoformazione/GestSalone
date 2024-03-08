package it.rf.gestsalone.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Operatore")
public class Operatore {
	

	@Column
	private String nomeOperatore;
	
	
	@Column
	private String cognomeOperatore;
	
	@Id
	@Column
	private String cfOperatore;
	
	@Column
	private Boolean operatoreAbilitato;
	
	@ManyToOne
	private CategoriaOperatore categoriaOperatore;

	@OneToMany(mappedBy="operatorec")
	private List<Contiene> listacontiene;

	public String getNomeOperatore() {
		return nomeOperatore;
	}

	public void setNomeOperatore(String nomeOperatore) {
		this.nomeOperatore = nomeOperatore;
	}

	public String getCognomeOperatore() {
		return cognomeOperatore;
	}

	public void setCognomeOperatore(String cognomeOperatore) {
		this.cognomeOperatore = cognomeOperatore;
	}

	public String getCfOperatore() {
		return cfOperatore;
	}

	public void setCfOperatore(String cfOperatore) {
		this.cfOperatore = cfOperatore;
	}

	public Boolean getOperatoreAbilitato() {
		return operatoreAbilitato;
	}

	public void setOperatoreAbilitato(Boolean operatoreAbilitato) {
		this.operatoreAbilitato = operatoreAbilitato;
	}

	public CategoriaOperatore getCategoriaOperatore() {
		return categoriaOperatore;
	}

	public void setCategoriaOperatore(CategoriaOperatore categoriaOperatore) {
		this.categoriaOperatore = categoriaOperatore;
	}

	public List<Contiene> getListacontiene() {
		return listacontiene;
	}

	public void setListacontiene(List<Contiene> listacontiene) {
		this.listacontiene = listacontiene;
	}

	

	
	

}
