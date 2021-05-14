package br.ucsal.bes20192.poo.atividade04.persistence;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.bes20192.poo.atividade04.domain.Contato;

public class ContatoDAO {

	private static List<Contato> contatos = new ArrayList<>();

	public static void inserir(Contato contato) throws Exception {
		contatos.add(contato);
	}

	public static List<Contato> obterContatos() {
		return contatos;
	}

}
