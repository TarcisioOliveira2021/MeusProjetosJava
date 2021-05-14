package br.ucsal.bes20192.poo.aula05.tui;

import br.ucsal.bes20192.poo.aula05.domain.Aluno;

public class AlunoTUI {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(123, "claudio neiva");
		Aluno aluno2 = new Aluno("maria@ucsal.br");

		System.out.println("Nome do aluno1=" + aluno1.getNome());
		System.out.println("Nome do aluno2=" + aluno2.getNome());
	}

}
