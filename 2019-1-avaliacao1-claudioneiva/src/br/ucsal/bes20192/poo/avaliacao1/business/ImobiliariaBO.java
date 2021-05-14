package br.ucsal.bes20192.poo.avaliacao1.business;

import java.util.List;

import br.ucsal.bes20192.poo.avaliacao1.domain.Apartamento;
import br.ucsal.bes20192.poo.avaliacao1.domain.Casa;
import br.ucsal.bes20192.poo.avaliacao1.domain.Imovel;
import br.ucsal.bes20192.poo.avaliacao1.domain.SituacaoImovelEnum;
import br.ucsal.bes20192.poo.avaliacao1.persistencia.ImovelDAO;

public class ImobiliariaBO {

	public static void cadastrarCasa(String endereco, String bairro, Float valor, SituacaoImovelEnum situacao,
			Float areaTerreno) {
		Casa casa = new Casa(endereco, bairro, valor, situacao, areaTerreno);
		ImovelDAO.inserir(casa);

		// Pode ser feito com um único passo:
		// ImovelDAO.inserir(new Casa(endereco, bairro, valor, situacao, areaTerreno));
	}

	public static void cadastrarApartamento(String endereco, String bairro, Float valor, SituacaoImovelEnum situacao,
			Float areaFracaoIdeal, Float areaPrivativa) {
		Apartamento apartamento = new Apartamento(endereco, bairro, valor, situacao, areaFracaoIdeal, areaPrivativa);
		ImovelDAO.inserir(apartamento);

		// Pode ser feito com um único passo:
		// ImovelDAO.inserir(new Apartamento(endereco, bairro, valor, situacao,
		// areaFracaoIdeal,
		// areaPrivativa));
	}

	public static List<Imovel> obterTodos() {
		return ImovelDAO.obterTodos();
	}

}
