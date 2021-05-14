package br.ucsal.poo2019.test_and_aplication;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.poo2019.TUI.FuncionarioTUI;
import br.ucsal.poo2019.TUI.MedicoTUI;
import br.ucsal.poo2019.domain.Medico;

public class MedicoTest {

	public static List<String> especialidadesMedico1 = new ArrayList<>();
	public static List<String> especialidadesMedico2 = new ArrayList<>();
	public static List<String> especialidadesMedico3 = new ArrayList<>();

	public static void main(String[] args) {
		// Medico --> (nome, anoAdmissao, salario, crm, especialidades);

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
		// Definicao das especialidades
		especialidadesMedico1.add("Cardiologista");
		especialidadesMedico2.add("Urologia");
		especialidadesMedico3.add("Laringologista");
		// Criacao dos medicos.
		Medico medico1 = new Medico("Joaquim", 2000, 20.000d, 24679190, especialidadesMedico1);
		Medico medico2 = new Medico("Alberto", 2010, 30.000d, 12119201, especialidadesMedico2);
		Medico medico3 = new Medico("Xuxa", 2019, 50.000d, 12391023, especialidadesMedico3);
		// Inserindo
		MedicoTUI.inserir(medico1);
		MedicoTUI.inserir(medico2);
		MedicoTUI.inserir(medico3);
		// Listando por ordem de nome crescente
		FuncionarioTUI.listarTodos();
	}

	private static void teste02() {
		// Situacao dois medicos com o mesmo CRM:
		System.out.println("******************** TEST 02 ******************");
		Medico medico1 = new Medico("Joaquim", 2000, 20.000d, 12119201, null);
		Medico medico2 = new Medico("Alberto", 2010, 30.000d, 12119201, null);
		MedicoTUI.inserir(medico1);
		MedicoTUI.inserir(medico2);
	}

	private static void teste03() {
		// Situacao Medico sem nome.
		System.out.println("******************** TEST 03 ******************");
		Medico medico1 = new Medico("", 2000, 20.000d, 12119201, null);
		Medico medico2 = new Medico(null, 2010, 30.000d, 12119201, null);
		MedicoTUI.inserir(medico1);
		MedicoTUI.inserir(medico2);
	}

	private static void teste04() {
		// Situacao Medico sem CRM.
		System.out.println("******************** TEST 04 ******************");
		Medico medico1 = new Medico("Joaquim", 2000, 20.000d, null, null);
		Medico medico2 = new Medico("Alberto", 2010, 30.000d, null, null);
		MedicoTUI.inserir(medico1);
		MedicoTUI.inserir(medico2);
	}

	private static void teste05() {
		// Lista em ordem crescente ano de admicao caso igual listar por salario.
		System.out.println("******************** TEST 05 ******************");
		Medico medico1 = new Medico("Joaquim", 1987, 20.000d, 12119201, null);
		Medico medico2 = new Medico("Alberto", 2013, 30.000d, 414214142, null);
		Medico medico3 = new Medico("Joan", 2013, 20.000d, 131231231, null);
		MedicoTUI.inserir(medico1);
		MedicoTUI.inserir(medico2);
		MedicoTUI.inserir(medico3);
		FuncionarioTUI.listarTodosOrdemAnoAdmissao_e_Salario();
		System.out.println();
	}

	private static void teste06() {
		// Lista o nome das especialidades medicas sem repetir.
		System.out.println("******************** TEST 06 ******************");
		especialidadesMedico1.add("Cardiologista");
		especialidadesMedico2.add("Cardiologista");
		especialidadesMedico3.add("Laringologista");

		Medico medico1 = new Medico("Joaquim", 1987, 20.000d, 12119201, especialidadesMedico1);
		Medico medico2 = new Medico("Alberto", 2013, 30.000d, 414214142, especialidadesMedico2);
		Medico medico3 = new Medico("Joan", 2013, 20.000d, 131231231, especialidadesMedico3);
		MedicoTUI.inserir(medico1);
		MedicoTUI.inserir(medico2);
		MedicoTUI.inserir(medico3);
		MedicoTUI.listarEspecialidades();

	}

	private static void teste07() {
		// Listar quantidade de funcionarios pelo ano de admissao.
		System.out.println("******************** TEST 07 ******************");
		especialidadesMedico1.add("Cardiologista");
		especialidadesMedico2.add("Cardiologista");
		especialidadesMedico3.add("Laringologista");

		Medico medico1 = new Medico("Joaquim", 1987, 20.000d, 12119201, especialidadesMedico1);
		Medico medico2 = new Medico("Alberto", 2013, 30.000d, 414214142, especialidadesMedico2);
		Medico medico3 = new Medico("Joan", 2013, 20.000d, 131231231, especialidadesMedico3);
		MedicoTUI.inserir(medico1);
		MedicoTUI.inserir(medico2);
		MedicoTUI.inserir(medico3);
		FuncionarioTUI.listaQuantidadeFuncionarios();
	}
}
