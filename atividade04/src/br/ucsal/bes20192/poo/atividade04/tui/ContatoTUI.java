package br.ucsal.bes20192.poo.atividade04.tui;

import br.ucsal.bes20192.poo.atividade04.business.ContatoBO;
import br.ucsal.bes20192.poo.atividade04.domain.Contato;

public class ContatoTUI {

	public static void incluir() {
		String nome;
		Integer anoNascimento;
		String telefone;

		nome = UtilTUI.obterTexto("Informe o nome:");
		anoNascimento = UtilTUI.obterNumero("Informe o ano de nascimento:");
		telefone = UtilTUI.obterTexto("Informe o telefone:");

		// Chegamos aqui com os dados que vieram da interface: nome,
		// anoNascimento e o telefone

		Contato contato = new Contato(nome, anoNascimento, telefone);

		try {
			ContatoBO.incluir(contato);
		} catch (Exception e) {
			System.out.println("Erro ao incluir contato:" + e.getMessage());
		}
	}

	public static void excluir() {

	}

	public static void listar() {
		System.out.println("********************* LISTAR *********************");
		for (Contato contato : ContatoBO.obterContatos()) {
			System.out.println(contato);
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Ano de nascimento: " + contato.getAnoNascimento());
			System.out.println("Telefone: " + contato.getTelefone());
		}
	}

	public static void pesquisarPorNome() {

	}

}
