package br.ucsal.bes20192.poo.avaliacao1.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.bes20192.poo.avaliacao1.domain.Imovel;

public class ImovelDAO {
	
	private static List<Imovel> imoveis = new ArrayList<>();

	public static void inserir(Imovel imovel) {
		imoveis.add(imovel);
	}

	public static List<Imovel> obterTodos() {
		return imoveis;
	}
	
}
