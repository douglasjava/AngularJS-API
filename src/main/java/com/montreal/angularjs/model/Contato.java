package com.montreal.angularjs.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String nome;

	@NotEmpty
	private String telefone;

	@NotEmpty
	private Date data;

	@ManyToOne
	@JoinColumn(name = "operadora_id")
	private Operadora operadora;

	public Contato() {
		super();
	}

	public Contato(String nome, String telefone, Date data, Operadora operadora) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.data = data;
		this.operadora = operadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	@Override
	public String toString() {
		return "Contatos [nome=" + nome + ", telefone=" + telefone + "]";
	}

}
