package br.ucsal.poo2019.test_and_aplication;

import br.ucsal.poo2019.TUI.FuncionarioTUI;
import br.ucsal.poo2019.domain.Funcionario;

//Funcionario testes.
public class FuncionarioTest {
	public static void main(String[] args) {
		// Funcionario --> (Nome, anoAdmissao , salario );
		// Criacao : 
		Funcionario funcionario1 = new Funcionario("Caju", 2011, 120000d);
		Funcionario funcionario2 = new Funcionario("Manga", 2011, 9000d);
		Funcionario funcionario3 = new Funcionario("Uva", 2019, 2000d);
		Funcionario funcionario4 = new Funcionario("Pera", 2000, 19000d);
		// Inserindo : 
		FuncionarioTUI.inserir(funcionario1);
		FuncionarioTUI.inserir(funcionario2);
		FuncionarioTUI.inserir(funcionario3);
		FuncionarioTUI.inserir(funcionario4);
		System.out.println();
		//Listando :
		FuncionarioTUI.listarTodos();
		System.out.println();
		FuncionarioTUI.listaQuantidadeFuncionarios();
		System.out.println();
		FuncionarioTUI.listarTodosOrdemAnoAdmissao_e_Salario();
	}
}
