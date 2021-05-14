package br.ucsal.poo2019.persistence;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ucsal.poo2019.domain.Funcionario;

public class FuncionarioDAO {
	// Constantes
	// Atributos
	// Construtores
	// Métodos públicos
	// Métodos privados
	
	private static List<Funcionario> funcionarios = new ArrayList<>();

	public static void incluir(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public static List<Funcionario> obterTodos() {
		funcionarios.sort(Comparator.naturalOrder());
		return new ArrayList<>(funcionarios);
	}

	public static List<Funcionario> obterTodosPorAnoAdmissao_e_Salario() {
		funcionarios.sort(Comparator.comparing(Funcionario::getAnoAdmissao).thenComparing(Funcionario::getSalario));
		return new ArrayList<>(funcionarios);
	}

	public static Map<Integer, Integer> listaQuantidadeFuncionarios() {
		Map<Integer, Integer> anoAdmissaoQuantidade = new HashMap<>();
		for (int i = 0; i < funcionarios.size(); i++) {
			if (anoAdmissaoQuantidade.containsKey(funcionarios.get(i).getAnoAdmissao())) {
				Integer qtdAtual = anoAdmissaoQuantidade.get(funcionarios.get(i).getAnoAdmissao());
				anoAdmissaoQuantidade.put((funcionarios.get(i).getAnoAdmissao()), qtdAtual + 1);
			} else {
				anoAdmissaoQuantidade.put((funcionarios.get(i).getAnoAdmissao()), 1);
			}
		}

		return anoAdmissaoQuantidade;

	}
}
