package br.ucsal.bes20192.poo.aula07.classeinstancia;

public class Aluno {

	private static Integer contador = 0;

	private Integer matricula;

	private String nome;

	private String email;

	public Aluno(String nome, String email) {
		// Aqui voc� deve criar um c�digo para definir o n�mero de matr�cula do
		// aluno, que deve ser um n�mero sequencial.

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
