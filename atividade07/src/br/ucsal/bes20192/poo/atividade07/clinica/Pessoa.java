package br.ucsal.bes20192.poo.atividade07.clinica;

import java.util.List;

public class Pessoa {

	private String nome;

	private String telefone;

	private List<String> emails;

	public Pessoa(String nome, String telefone) {
		// this -> a instância atual. Tirar a ambiguidade em relação à variáveis
		// locais/parâmetros.
		super();
		this.nome = nome;
		this.telefone = telefone;
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

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

}
