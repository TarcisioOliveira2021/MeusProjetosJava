package br.ucsal.bes20192.poo.aula07.classeinstancia;

public class Exemplo {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Claudio Neiva", "claudio.neiva@ucsal.br");
		Aluno aluno2 = new Aluno("Antonio Pedreira", "antonio.pedreira@ucsal.br");
		Aluno aluno3 = new Aluno("Maria da Silva", "maria.silva@ucsal.br");
		
		System.out.println("aluno1 = " + aluno1);
		System.out.println("aluno2 = " + aluno2);
		System.out.println("aluno3 = " + aluno3);
		
	}

}
