package br.ucsal.edu.poo.atividade07_jeito01;
/*
 * Os funcionários de uma clínica possuem nome, telefone, emails, número de
matrícula e valor do salário. Como dados complementares para os médicos é
necessário manter o número do CRM (número de inscrição no Conselho de
Medicina), a unidade federativa do CRM e as especialidades que o médico
atende. Sobre os pacientes é necessário saber o nome, telefone, emails,
número do convênio, peso, altura e ano de nascimento.
 */
public class Funcionario extends Pessoa {
	
	Integer numeroDeMatricula;
	
	Double valorDoSalario;

	@Override
	public String toString() {
		return "Funcionario [numeroDeMatricula=" + numeroDeMatricula + ", valorDoSalario=" + valorDoSalario + ", nome="
				+ nome + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco + "]";
	}

	
	

		
	
	
}

