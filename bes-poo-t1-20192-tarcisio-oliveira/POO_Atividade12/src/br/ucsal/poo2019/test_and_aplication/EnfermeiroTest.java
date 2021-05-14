package br.ucsal.poo2019.test_and_aplication;

import br.ucsal.poo2019.TUI.EnfermeiroTUI;
import br.ucsal.poo2019.TUI.FuncionarioTUI;
import br.ucsal.poo2019.domain.Enfermeiro;
import br.ucsal.poo2019.domain.TipoAtuacaoEnum;

public class EnfermeiroTest {
	public static void main(String[] args) {
		// Enfermeiro --> (nome,anoAdmissao,salario,coren,TipoAtuacaoEnum,cargaHoraria).
		teste01();
		teste02();
		teste03();
		teste04();
		teste05();
		teste06();
		teste07();
	}

	private static void teste01() {
		System.out.println("******************** TEST 01 ******************");
		// Criando enfermeiros.
		Enfermeiro enfermeiro1 = new Enfermeiro("Joaquim", 1976, 40.000d, 0001, TipoAtuacaoEnum.ADMINISTRACAO, 8);
		Enfermeiro enfermeiro2 = new Enfermeiro("Alberto", 2000, 30.000d, 0002, TipoAtuacaoEnum.ASSISTENCIA, 13);
		Enfermeiro enfermeiro3 = new Enfermeiro("Sulivan", 2018, 35.000d, 0003, TipoAtuacaoEnum.ADMINISTRACAO, 2);
		// Inserindo enfermeiros
		EnfermeiroTUI.inserir(enfermeiro1);
		EnfermeiroTUI.inserir(enfermeiro2);
		EnfermeiroTUI.inserir(enfermeiro3);
		// Listando enfermeiros por ordem crescente de nome.
		FuncionarioTUI.listarTodos();
	}

	private static void teste02() {
		// Situacao dois enfermeiros com corens iguais.
		System.out.println("******************** TEST 02 ******************");
		Enfermeiro enfermeiro1 = new Enfermeiro("Joaquim", 1976, 40.000d, 0001, TipoAtuacaoEnum.ADMINISTRACAO, 8);
		Enfermeiro enfermeiro2 = new Enfermeiro("Alberto", 2000, 30.000d, 0001, TipoAtuacaoEnum.ASSISTENCIA, 13);
		Enfermeiro enfermeiro3 = new Enfermeiro("Sulivan", 2018, 35.000d, 0003, TipoAtuacaoEnum.ADMINISTRACAO, 2);
		EnfermeiroTUI.inserir(enfermeiro1);
		EnfermeiroTUI.inserir(enfermeiro2);
		EnfermeiroTUI.inserir(enfermeiro3);
	}

	private static void teste03() {
		// Situacao enfermeiros na Assistencia devem ter carga horaria minima de
		// 12horas.
		System.out.println("******************** TEST 03 ******************");
		Enfermeiro enfermeiro1 = new Enfermeiro("Alberto", 2000, 30.000d, 0001, TipoAtuacaoEnum.ASSISTENCIA, 3);
		EnfermeiroTUI.inserir(enfermeiro1);
	}

	private static void teste04() {
		// Situacao enfermeiros com numero do coren obrigadotorio.
		System.out.println("******************** TEST 04 ******************");
		Enfermeiro enfermeiro1 = new Enfermeiro("Alberto", 2000, 30.000d, null, TipoAtuacaoEnum.ASSISTENCIA, 13);
		EnfermeiroTUI.inserir(enfermeiro1);
	}

	private static void teste05() {
		// Situacao enfermeiros com nome obrigatorio.
		System.out.println("******************** TEST 05 ******************");
		Enfermeiro enfermeiro1 = new Enfermeiro("", 2000, 30.000d, 001, TipoAtuacaoEnum.ASSISTENCIA, 13);
		Enfermeiro enfermeiro2 = new Enfermeiro(null, 2000, 30.000d, 001, TipoAtuacaoEnum.ASSISTENCIA, 13);
		EnfermeiroTUI.inserir(enfermeiro1);
		EnfermeiroTUI.inserir(enfermeiro2);
	}

	private static void teste06() {
		// Lista em ordem crescente ano de admicao caso igual listar por salario.
		System.out.println("******************** TEST 06 ******************");
		Enfermeiro enfermeiro1 = new Enfermeiro("Alberto", 2019, 30.000d, 001, TipoAtuacaoEnum.ASSISTENCIA, 13);
		Enfermeiro enfermeiro2 = new Enfermeiro("Joaquim", 1998, 10.000d, 002, TipoAtuacaoEnum.ASSISTENCIA, 150);
		Enfermeiro enfermeiro3 = new Enfermeiro("Rafael", 1998, 30.000d, 003, TipoAtuacaoEnum.ASSISTENCIA, 20);
		EnfermeiroTUI.inserir(enfermeiro1);
		EnfermeiroTUI.inserir(enfermeiro2);
		EnfermeiroTUI.inserir(enfermeiro3);
		FuncionarioTUI.listarTodosOrdemAnoAdmissao_e_Salario();
	}

	private static void teste07() {
		// Listar quantidade de funcionarios pelo ano de admissao.
		System.out.println("******************** TEST 07 ******************");
		Enfermeiro enfermeiro1 = new Enfermeiro("Alberto", 2019, 30.000d, 001, TipoAtuacaoEnum.ASSISTENCIA, 13);
		Enfermeiro enfermeiro2 = new Enfermeiro("Joaquim", 1998, 10.000d, 002, TipoAtuacaoEnum.ASSISTENCIA, 150);
		Enfermeiro enfermeiro3 = new Enfermeiro("Rafael", 1998, 30.000d, 003, TipoAtuacaoEnum.ASSISTENCIA, 20);
		EnfermeiroTUI.inserir(enfermeiro1);
		EnfermeiroTUI.inserir(enfermeiro2);
		EnfermeiroTUI.inserir(enfermeiro3);
		FuncionarioTUI.listaQuantidadeFuncionarios();
	}
}
