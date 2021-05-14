package br.ucsal.bes20192.poo.atividade04.domain;

public class Contato {

	private String nome;

	private Integer anoNascimento;

	private String telefone;

	public Contato(String nome, Integer anoNascimento, String telefone) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", anoNascimento=" + anoNascimento + ", telefone=" + telefone + "]";
	}

}
