package br.ucsal.edu.poo.atividade07.jeito02;

/*
 * Os funcionários de uma clínica possuem nome, telefone, emails, número de
matrícula e valor do salário. Como dados complementares para os médicos é
necessário manter o número do CRM (número de inscrição no Conselho de
Medicina), a unidade federativa do CRM e as especialidades que o médico
atende. Sobre os pacientes é necessário saber o nome, telefone, emails,
número do convênio, peso, altura e ano de nascimento.
 */
public class Medico extends Funcionario {

	Integer numeroDoCrm;

	String unidadeFederativaCrm;

	String especialidade;

	
	public Medico(String nome, String telefone, String email, String endereco, Integer numeroDeMatricula,
			Double valorDoSalario, Integer numeroDoCrm, String unidadeFederativaCrm, String especialidade) {
		super(nome, telefone, email, endereco, numeroDeMatricula, valorDoSalario);
		this.numeroDoCrm = numeroDoCrm;
		this.unidadeFederativaCrm = unidadeFederativaCrm;
		this.especialidade = especialidade;
	}

	

	

}
