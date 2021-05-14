package br.ucsal.poo2019.TUI;

import java.util.List;
import java.util.Map;
import br.ucsal.poo2019.business.FuncionarioBO;
import br.ucsal.poo2019.domain.Funcionario;

public class FuncionarioTUI {
	// Constantes
	// Atributos
	// Construtores
	// Métodos públicos
	// Métodos privados
	
	public static void inserir(Funcionario funcionario) {
		FuncionarioBO.inserir(funcionario);
		System.out.println("Fim da inclusao.");
	}

	public static void listarTodos() {
		List<Funcionario> funcionarios = FuncionarioBO.obterTodos();
		System.out.println("***************** Lista ***************");
		System.out.println("         Todos os funcionarios\n");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}

	public static void listarTodosOrdemAnoAdmissao_e_Salario() {
		List<Funcionario> funcionarios = FuncionarioBO.obterTodosPorAnoAdmissao_e_Salario();
		System.out.println("***************** Lista ***************");
		System.out.println("    Por ordem de ano de Admissao e Salario\n");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}

	public static void listaQuantidadeFuncionarios() {
		Map<Integer, Integer> quantidadeFuncionarios = FuncionarioBO.listaQuantidadeFuncionarios();
		System.out.println("***************** Lista ***************");
		System.out.println("Ano de Admissao  x  quantidade de funcionarios");
		for (Integer anoAdmissao : quantidadeFuncionarios.keySet()) {
			System.out.println(anoAdmissao + " x " + quantidadeFuncionarios.get(anoAdmissao));
		}
	}

}
