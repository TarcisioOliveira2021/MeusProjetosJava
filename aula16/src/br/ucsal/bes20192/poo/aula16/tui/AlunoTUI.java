package br.ucsal.bes20192.poo.aula16.tui;

import java.util.List;

import br.ucsal.bes20192.poo.aula16.business.AlunoBO;
import br.ucsal.bes20192.poo.aula16.domain.Aluno;
import br.ucsal.bes20192.poo.aula16.exception.InfraestruturaException;
import br.ucsal.bes20192.poo.aula16.exception.NegocioException;

public class AlunoTUI {

	public static void incluir() {
		System.out.println("********** INCLUIR - ALUNO ********** ");
3
		Integer matricula;
		String nome;
		Integer anoNascimento;

		matricula = UtilTUI.obterInteiro("Informe a matrícula:");
		nome = UtilTUI.obterTexto("Informe a nome:");
		anoNascimento = UtilTUI.obterInteiro("Informe o ano de nascimento:");

		// Pesquisar sobre try-resource.

		try {
			Aluno aluno = new Aluno(matricula, nome, anoNascimento);
			AlunoBO.incluir(aluno); // Se ocorrer um exception aqui, o fluxo pula pra o catch.
			System.out.println("Inclusão realizada com sucesso.");
		} catch (InfraestruturaException e) {
			System.out.println("Erro grave: " + e.getMessage());
			System.exit(-1);
		} catch (NegocioException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println(
					"Fim da inclusão. Esta linha vai executar mesmo que ocorrar um excetion na chamadado AlunoBO.incluir(aluno).");
		}

	}

	public static void pesquisar() {
		System.out.println("********** PESQUISAR - ALUNO ********** ");

		String nome;

		nome = UtilTUI.obterTexto("Informe a nome:");

		try {
			Aluno aluno = AlunoBO.pesquisar(nome);
			System.out.println(aluno);
		} catch (NegocioException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void listarTodos() {
		List<Aluno> alunos = AlunoBO.obterTodos();
		System.out.println("Todos os alunos:");
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}

		// for(Aluno aluno : AlunoBO.obterTodos()) {
		//
		// }
	}

	public static void olhaOQueSeuColegaFaz() {
		Aluno aluno;
		try {
			aluno = new Aluno(123, "", 2005);
			List<Aluno> alunos = AlunoBO.obterTodos();
			alunos.add(aluno);
		} catch (NegocioException e) {
			e.printStackTrace();
		}
	}

	public static void lembrarInstanceOf() {
		InfraestruturaException e1 = new InfraestruturaException("caj");

		if (e1 instanceof NegocioException) {
			System.out.println("É um tipo de NegocioException");
		}
		if (e1 instanceof InfraestruturaException) {
			System.out.println("É um tipo de InfraestruturaException");
		}
	}

}
