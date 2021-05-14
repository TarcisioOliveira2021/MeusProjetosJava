package br.ucsal.bes20192.poo.atividade04.tui;

public class AgendaTUI {

	private static final int INCLUIR = 1;
	private static final int EXCLUIR = 2;
	private static final int LISTAR = 3;
	private static final int PESQUISAR_POR_NOME = 4;
	private static final int SAIR = 9;

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
			ContatoTUI.incluir();
			break;
		case EXCLUIR:
			ContatoTUI.excluir();
			break;
		case LISTAR:
			ContatoTUI.listar();
			break;
		case PESQUISAR_POR_NOME:
			ContatoTUI.pesquisarPorNome();
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
			opcao = UtilTUI.obterNumero("Informe a opção desejada:");
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
