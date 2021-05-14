package br.ucsal.edu.br.domain;

public class PontoTuristico extends Localizacao {
	private String nome;

	public PontoTuristico(String logradouro, String bairro, String nome) {
		super(logradouro, bairro);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "PontosTuristicos [nome=" + nome + "]";
	}
	
	
}
