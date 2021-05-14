package br.ucsal.bes20192.poo.aula02;

public class Exemplo {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();

		aluno1.nome = "Claudio";
		aluno2.nome = "Maria";
		aluno3.nome = "Pedro";

		System.out.println("aluno1=" + aluno1);
		System.out.println("aluno2=" + aluno2);
		System.out.println("aluno3=" + aluno3);

		System.out.println("aluno1.nome=" + aluno1.nome);
		System.out.println("aluno2.nome=" + aluno2.nome);
		System.out.println("aluno3.nome=" + aluno3.nome);

	}

}
