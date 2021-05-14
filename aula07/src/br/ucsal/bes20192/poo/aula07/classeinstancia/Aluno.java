package br.ucsal.bes20192.poo.aula07.classeinstancia;

public class Aluno {

	private static Integer contador = 0;

	private Integer matricula;

	private String nome;

	private String email;

	public Aluno(String nome, String email) {
		// Aqui você deve criar um código para definir o número de matrícula do
		// aluno, que deve ser um número sequencial.

		contador++;
		this.matricula = contador;

		this.nome = nome;
		this.email = email;
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

	public Integer getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", email=" + email + "]";
	}

}
