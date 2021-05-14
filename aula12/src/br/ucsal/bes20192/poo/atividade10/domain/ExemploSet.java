package br.ucsal.bes20192.poo.atividade10.domain;

public class ExemploSet {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno(123, "Ana", "caju@ucsal.br");
		Aluno aluno2 = new Aluno(234, "Claudio", "manga@ucsal.br");
		Aluno aluno3 = new Aluno(345, "Maria", "jaca@ucsal.br");
		Aluno aluno4 = new Aluno(456, "Pedro", "goiaba@ucsal.br");
		Aluno aluno5 = new Aluno(567, "Joaquim", "melancia@ucsal.br");
		Aluno aluno6 = new Aluno(123, "Ana", "caju@ucsal.br");
		Aluno aluno7 = new Aluno(234, "Claudio", "manga@ucsal.br");

		Disciplina disciplinaPOO = new Disciplina("BES008", "Programa��o Orientada � Objetos",
				TipoDisciplinaEnum.ESPECIFICA);
		Disciplina disciplinaBD = new Disciplina("BES009", "Banco de Dados", TipoDisciplinaEnum.ESPECIFICA);
		Disciplina disciplinaIAP = new Disciplina("ABS123", "Inicia��o ao Pensar", TipoDisciplinaEnum.EIXO);

		Turma turma1 = new Turma(2018, 1, disciplinaPOO);
		Turma turma2 = new Turma(2018, 1, disciplinaBD);
		Turma turma3 = new Turma(2019, 1, disciplinaPOO);
		Turma turma4 = new Turma(2019, 2, disciplinaIAP);

		turma1.getAlunos().add(aluno1);
		turma1.getAlunos().add(aluno2);
		turma1.getAlunos().add(aluno3);
		turma1.getAlunos().add(aluno6);
		turma1.getAlunos().add(aluno7);
		turma1.getAlunos().add(aluno1);

		System.out.println("\nAlunos da turma1:");
		turma1.getAlunos().forEach(cajuina -> System.out.println(cajuina));

		System.out.println("\nAlunos da turma1:");
		for (Aluno aluno : turma1.getAlunos()) {
			System.out.println(aluno);
		}

		System.out.println("\nturma1 contem o aluno1? " + turma1.getAlunos().contains(aluno1) + " | hashcode="
				+ aluno1.hashCode());

//		turma1.getAlunos().remove(aluno1);
		
		aluno1.setNome("Caju");

//		turma1.getAlunos().add(aluno1);

		System.out.println("\nturma1 contem o aluno1, depois que o nome do aluno foi modificado? "
				+ turma1.getAlunos().contains(aluno1) + " | hashcode=" + aluno1.hashCode());

		System.out.println("\nAlunos da turma1:");
		turma1.getAlunos().forEach(cajuina -> System.out.println(cajuina));
	}

}
