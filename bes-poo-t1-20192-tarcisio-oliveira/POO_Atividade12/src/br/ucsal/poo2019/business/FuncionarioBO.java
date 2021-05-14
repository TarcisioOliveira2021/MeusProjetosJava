package br.ucsal.poo2019.business;

import java.util.List;
import java.util.Map;

import br.ucsal.poo2019.domain.Funcionario;
import br.ucsal.poo2019.persistence.FuncionarioDAO;

public class FuncionarioBO {
	// Constantes
	// Atributos
	// Construtores
	// Métodos públicos
	// Métodos privados
	public static void inserir(Funcionario funcionario) {
		FuncionarioDAO.incluir(funcionario);
	}

	public static List<Funcionario> obterTodos() {
		return FuncionarioDAO.obterTodos();
	}

	public static List<Funcionario> obterTodosPorAnoAdmissao_e_Salario() {
		return FuncionarioDAO.obterTodosPorAnoAdmissao_e_Salario();
	}

	public static Map<Integer, Integer> listaQuantidadeFuncionarios() {
		return FuncionarioDAO.listaQuantidadeFuncionarios();
	}

}
