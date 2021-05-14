package br.ucsal.edu.poo.atividade07_jeito01;

public class Exemplo {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		Medico medico1 = new Medico();
		Paciente paciente1 = new Paciente();
		
		funcionario1.email = "fabricio@gmail.com";
		funcionario1.endereco="Rua limoeiro";
		funcionario1.nome ="Fabiano";
		funcionario1.numeroDeMatricula= 123141516;
		funcionario1.telefone ="(71) 9 8888-8888";
		funcionario1.valorDoSalario = 1.699;
	
		System.out.println(funcionario1);

		
		
	}

}
