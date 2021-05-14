package br.ucsal.bes20192.poo.atividade07.clinica;

public class Paciente extends Pessoa {

	private String numeroConvenio;

	// BigDecimal
	private Float peso;

	private Float altura;

	private Integer anoNascimento;

	public Paciente(String nome, String telefone, String numeroConvenio, Integer anoNascimento) {
		super(nome, telefone);
		this.numeroConvenio = numeroConvenio;
		this.anoNascimento = anoNascimento;
	}

	public String getNumeroConvenio() {
		return numeroConvenio;
	}

	public void setNumeroConvenio(String numeroConvenio) {
		this.numeroConvenio = numeroConvenio;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

}
