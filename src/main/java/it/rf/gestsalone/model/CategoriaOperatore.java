package it.rf.gestsalone.model;

import java.util.List;

import org.hibernate.sql.ast.tree.from.MappedByTableGroup;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="CategoriaOperatore")
public class CategoriaOperatore {

	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer codCategoria;
	
	@Column
	private String nomeCategoria;
	
	@OneToMany(mappedBy="categoriaOperatore")
		private List<Operatore> listaoperatori;

	public Integer getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(Integer codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public List<Operatore> getListaoperatori() {
		return listaoperatori;
	}

	public void setListaoperatori(List<Operatore> listaoperatori) {
		this.listaoperatori = listaoperatori;
	}

	
}
