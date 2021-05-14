package br.ucsal.bes20192.poo.aula04;

public class Exemplo {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = aluno1;

		System.out.println("aluno1=" + aluno1);
		System.out.println("aluno2=" + aluno2);
		System.out.println("aluno3=" + aluno3);
		System.out.println("aluno4=" + aluno4);

		aluno1.matricula = 1;
		aluno1.nome = "Claudio";

		aluno2.matricula = 2;
		aluno2.nome = "Pedro";

		aluno3.matricula = 1;
		aluno3.nome = "Claudio";

		aluno4.matricula = 456;
		aluno4.nome = "Clara";
		
		System.out.println("aluno1.nome="+aluno1.nome);
		System.out.println("aluno4.nome="+aluno4.nome);

		if (aluno1 == aluno2) {
			System.out.println("aluno1 aponta para a mesma instância apontada por aluno2");
		} else {
			System.out.println("aluno1 NÃO aponta para a mesma instância apontada aluno2");
		}

		if (aluno1 == aluno3) {
			System.out.println("aluno1 aponta para a mesma instância apontada por aluno3");
		} else {
			System.out.println("aluno1 NÃO aponta para a mesma instância apontada aluno3");
		}

		if (aluno1.equals(aluno3)) {
			System.out.println("aluno1 é igual aluno3");
		} else {
			System.out.println("aluno1 NÃO é igual aluno3");
		}

		if (aluno1.equals(aluno2)) {
			System.out.println("aluno1 é igual aluno2");
		} else {
			System.out.println("aluno1 NÃO é igual aluno2");
		}

		if (aluno1.equals(aluno4)) {
			System.out.println("aluno1 é igual aluno4");
		} else {
			System.out.println("aluno1 NÃO é igual aluno4");
		}

	}

}
