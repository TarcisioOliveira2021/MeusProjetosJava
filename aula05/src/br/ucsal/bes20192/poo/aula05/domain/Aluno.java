package br.ucsal.bes20192.poo.aula05.domain;

public class Aluno {

	private Integer matricula;

	private String nome;

	private String email;

	private String nomeMae;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(Integer matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

}
