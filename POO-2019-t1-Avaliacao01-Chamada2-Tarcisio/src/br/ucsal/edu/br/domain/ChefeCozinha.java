package br.ucsal.edu.br.domain;

public class ChefeCozinha {

	private String nome;
	private String especialidade;
	private Integer anoNasc;
	private String nacionalidade;

	public ChefeCozinha(String nome, String especialidade, Integer anoNasc, String nacionalidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.anoNasc = anoNasc;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Integer getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(Integer anoNasc) {
		this.anoNasc = anoNasc;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	@Override
	public String toString() {
		return "ChefeCozinha [nome=" + nome + ", especialidade=" + especialidade + ", anoNasc=" + anoNasc
				+ ", nacionalidade=" + nacionalidade + "]";
	}

}
