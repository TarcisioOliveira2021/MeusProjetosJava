package br.ucsal.bes20192.poo.atividade04.business;

import java.util.List;

import br.ucsal.bes20192.poo.atividade04.domain.Contato;
import br.ucsal.bes20192.poo.atividade04.persistence.ContatoDAO;

public class ContatoBO {

	private static final int TAMANHO_MINIMO_NOME = 3;
	private static final int TAMANHO_MINIMO_TELEFONE = 8;

	public static void incluir(Contato contato) throws Exception {

		// Validar o contato.
		validar(contato);

		// Se estiver tudo ok, vou pedir pra camada de persistência guardar o
		// contato.
		ContatoDAO.inserir(contato);

	}

	private static void validar(Contato contato) throws Exception {
		validarNome(contato);
		validarTelefone(contato);
	}

	private static void validarTelefone(Contato contato) throws Exception {
		if (contato.getTelefone() == null || contato.getTelefone().trim().length() < TAMANHO_MINIMO_TELEFONE) {
			throw new Exception("Telefone inválido.");
		}
	}

	private static void validarNome(Contato contato) throws Exception {
		if (contato.getNome() == null || contato.getNome().trim().length() < TAMANHO_MINIMO_NOME) {
			throw new Exception("Nome inválido.");
		}
	}

	public static List<Contato> obterContatos() {
		return ContatoDAO.obterContatos();
	}

}
