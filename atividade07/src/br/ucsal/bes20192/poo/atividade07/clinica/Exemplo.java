package br.ucsal.bes20192.poo.atividade07.clinica;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		List<Funcionario> funcionarios = new ArrayList<>();
		
		List<String> especialidades = new ArrayList<>();
		especialidades.add("Dermatologia");
		especialidades.add("Clínica Médica");
		especialidades.add("Cardiologia");

		Medico medico1 = new Medico("Maria", "71-12312312", 100, 1234, "BA", especialidades);
		Funcionario funcionario1 = new Funcionario("Pedro", "71-8956897", 102);
		Paciente paciente1 = new Paciente("Maria", "71-12312312", "7533", 2000);

		funcionarios.add(medico1);
		pessoas.add(medico1);
		
		// UPCAST pode ser implícito ou explícito, não faz diferença.
		Pessoa pessoa1 = medico1;
		Pessoa pessoa2 = (Pessoa) medico1;

		System.out.println("Emails do medico1=" + pessoa1.getEmails());

		// DOWNCAST deve ser EXPLÍCITO!
		Medico medico2 = (Medico) pessoa1;

		medico2.getCrm();

		Pessoa pessoaA = medico1;
		Pessoa pessoaB = funcionario1;
		Pessoa pessoaC = paciente1;

		Medico medicoA = (Medico) pessoaA;

		// Aqui vai quebrar em tempo de execução!
		// pessoaB é uma instância de funcionário e não é possível transformá-la em
		// instância de Medico. Se fosse possível, como seria executado o
		// medicoB.getCrm();
		Medico medicoB = (Medico) pessoaB;
		System.out.println("medicoB.crm=" + medicoB.getCrm());

		// Como fazer um downcast seguro:
		if (pessoaB instanceof Medico) {
			Medico medicoC = (Medico) pessoaB;
			System.out.println("medicoC.crm=" + medicoC.getCrm());
		}

		// Não é possível fazer DOWNCAST quando não se está descendo!!!
		// Funcionario funcionarioA = (Funcionario) paciente1;
	}

}
