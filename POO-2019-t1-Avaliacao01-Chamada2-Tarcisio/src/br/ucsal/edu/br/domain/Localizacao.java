package br.ucsal.edu.br.domain;

public class Localizacao {
	private String logradouro;
	private String bairro;
	
	public Localizacao(String logradouro, String bairro) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String toString() {
		return "Localizacao [logradouro=" + logradouro + ", bairro=" + bairro + "]";
	}
}
