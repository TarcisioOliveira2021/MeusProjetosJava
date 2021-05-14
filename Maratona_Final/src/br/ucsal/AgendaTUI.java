package br.ucsal.poo.atividade04.tui;

import java.util.Scanner;

public class AgendaTUI {

	private static final int INCLUIR = 1;
	private static final int EXCLUIR = 2;
	private static final int LISTAR = 3;
	private static final int PESQUISAR_POR_NOME = 4;
	private static final int SAIR = 9;

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		executarAgenda();
	}

	private static void executarAgenda() {
		Integer opcao;
		do {
			apresentarOpcoes();
			opcao = obterOpcaoSelecionada();
			executarOpcao(opcao);
		} while (opcao != SAIR);
	}

	private static void executarOpcao(int opcao) {
		switch (opcao) {
		case INCLUIR:
			System.out.println("Aqui vamos chamar a inclusão...");
			ContatoTUI.incluir();
			break;
		case EXCLUIR:
			System.out.println("Aqui vamos chamar a exclusão...");
			break;
		case LISTAR:
			System.out.println("Aqui vamos chamar a listagem...");
			break;
		case PESQUISAR_POR_NOME:
			System.out.println("Aqui vamos chamar a pesquisa por nome...");
			break;
		case SAIR:
			System.out.println("Bye...");
			break;
		default:
			break;
		}
	}

	private static void apresentarOpcoes() {
		System.out.println(INCLUIR + " - Incluir");
		System.out.println(EXCLUIR + " - Excluir");
		System.out.println(LISTAR + " - Listar");
		System.out.println(PESQUISAR_POR_NOME + " - Pesquisar por nome");
		System.out.println(SAIR + " - Sair");
	}

	private static Integer obterOpcaoSelecionada() {
		Integer opcao;
		do {
			System.out.println("Informe a opção desejada:");
			opcao = sc.nextInt();
			if (!isOpcaoValida(opcao)) {
				System.out.println("Opção não válida!");
			}
		} while (!isOpcaoValida(opcao));
		return opcao;
	}

	private static boolean isOpcaoValida(Integer opcao) {
		return opcao == INCLUIR || opcao == EXCLUIR || opcao == LISTAR 
				|| opcao == PESQUISAR_POR_NOME || opcao == SAIR;
	}

}
