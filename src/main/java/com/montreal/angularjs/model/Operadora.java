package com.montreal.angularjs.model;

public class Operadora {

	private String nome;
	private String codigo;
	private String categoria;

	public Operadora() {
		super();
	}

	public Operadora(String nome, String codigo, String categoria) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
