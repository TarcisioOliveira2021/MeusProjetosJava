package br.ucsal.edu.persistence;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.edu.domain.ContaCorrente;
import br.ucsal.edu.exception.ContaCorrenteNaoEncontradaException;

public class ContaCorrenteDAO {
	private static List<ContaCorrente> contasCorrentes = new ArrayList<>();

	public static void salvar(ContaCorrente contaCorrente) {
		contasCorrentes.add(contaCorrente);
	}

	public static List<ContaCorrente> obterTodasContasCorrentes() {
		return contasCorrentes;
	}

	public static ContaCorrente pesquisar(Integer codigoAgencia, Integer codigoConta) throws ContaCorrenteNaoEncontradaException {
		for (int i = 0; i < contasCorrentes.size(); i++) {
			if (codigoAgencia.equals(contasCorrentes.get(i).getCodigoAgencia())
					&& codigoConta.equals(contasCorrentes.get(i).getCodigoConta())) {
				return contasCorrentes.get(i);
			}
		}
		throw new ContaCorrenteNaoEncontradaException("Erro: Conta corrente nao encontrada.");
	}
}
