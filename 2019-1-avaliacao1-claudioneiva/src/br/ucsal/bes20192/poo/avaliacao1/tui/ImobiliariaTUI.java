package br.ucsal.bes20192.poo.avaliacao1.tui;

import java.util.List;

import br.ucsal.bes20192.poo.avaliacao1.business.ImobiliariaBO;
import br.ucsal.bes20192.poo.avaliacao1.domain.Imovel;
import br.ucsal.bes20192.poo.avaliacao1.domain.SituacaoImovelEnum;

public class ImobiliariaTUI {

	// Se fizer o main não ganha nada, mas, se estiver errado perde ponto.
	public static void main(String[] args) {

		ImobiliariaBO.cadastrarCasa("Rua X", "Bairro Y", 10000.23f, SituacaoImovelEnum.BLOQUEADA, 500.1f);
		ImobiliariaBO.cadastrarCasa("Rua Y", "Bairro Y", 490844564.23f, SituacaoImovelEnum.DISPONIVEL, 300.1f);
		ImobiliariaBO.cadastrarCasa("Rua Z", "Bairro X", 86586786.23f, SituacaoImovelEnum.DISPONIVEL, 500.1f);
		ImobiliariaBO.cadastrarApartamento("Rua X", "Bairro Y", 10009990.23f, SituacaoImovelEnum.VENDIDA, 1533f, 998f);
		ImobiliariaBO.cadastrarApartamento("Rua Z", "Bairro W", 5000.23f, SituacaoImovelEnum.DISPONIVEL, 13f, 8f);
		
		listar();
		listarDetalhes();
	}

	public static void listar() {
		System.out.println("\n************ LISTAGEM SIMPLES ************");
		List<Imovel> imoveis = ImobiliariaBO.obterTodos();
		for (Imovel imovel : imoveis) {
			System.out.println("Código=" + imovel.getCodigo() + "; Bairro=" + imovel.getBairro() + "; Valor="
					+ imovel.getValor() + "; Situação=" + imovel.getSituacao());
		}
	}

	public static void listarDetalhes() {
		System.out.println("\n************ LISTAGEM DETALHADA ************");
		List<Imovel> imoveis = ImobiliariaBO.obterTodos();
		for (Imovel imovel : imoveis) {
			System.out.println(imovel.obterDetalhes());
		}
	}
}
