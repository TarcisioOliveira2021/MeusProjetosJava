package br.ucsal.edd;

import java.text.SimpleDateFormat;

public class AgendaContatos {
	public static Contato[] contatosAum = new Contato[10];
	public static Contato[] contatos = new Contato[5];
	public static int quantidadeCont = 0;

	public static void inserir(Contato contato) {
		if (quantidadeCont < 5) {
			contatos[quantidadeCont] = contato;
			quantidadeCont++;
			Exmplo.MenuAgenda();
		}
		if (quantidadeCont >= 5) {
			for (int i = 0; i < contatos.length; i++) {
				contatosAum[i] = contatos[i];
			}
			System.out.println(quantidadeCont);
			contatosAum[quantidadeCont] = contato;
			quantidadeCont++;
			Exmplo.MenuAgenda();
		}
	}

	public static void remover(String cpf) {

	}

	Contato consultarPorCpf(String cpf) {
		return null;
	}

	Contato[] consultarPorBairro(String bairro) {
		return null;
	}

	Contato[] consultarPorCidade(String cidade) {
		return null;
	}

	public static void atualizar(Contato contato) {

	}

	public static void imprimirContato(Contato contato) {

	}

	public static void imprimirTodosContatos() {
		if (quantidadeCont < 5) {
			for (int i = 0; i < quantidadeCont;) {
				System.out.println("\n         Contato " + i);
				System.out.println("Nome: " + contatos[i].getNome());
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("Data de nascimento: " + formato.format(contatos[i].getDataDeNascimento()));
				i++;
			}
		}
		if (quantidadeCont >= 5) {
			for (int i = 0; i <= quantidadeCont;) {
				System.out.println("\n         Contato " + i);
				System.out.println("Nome: " + contatosAum[i].getNome());
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("Data de nascimento: " + formato.format(contatos[i].getDataDeNascimento()));
				i++;
			}
		}
	}

	public static void ordenaPorCpf(boolean reverse) {
		// TODO Reverse ordena true = decresente // false = crescenete
	}

	public static void ordenaPorNome(boolean reverse) {
	}

	public static void ordenaPorDataDeNascimento(boolean reverse) {
	}

}
