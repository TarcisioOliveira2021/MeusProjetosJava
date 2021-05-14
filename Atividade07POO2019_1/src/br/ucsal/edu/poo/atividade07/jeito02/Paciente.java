package br.ucsal.edu.poo.atividade07.jeito02;

/*
 * Os funcionários de uma clínica possuem nome, telefone, emails, número de
matrícula e valor do salário. Como dados complementares para os médicos é
necessário manter o número do CRM (número de inscrição no Conselho de
Medicina), a unidade federativa do CRM e as especialidades que o médico
atende. Sobre os pacientes é necessário saber o nome, telefone, emails,
número do convênio, peso, altura e ano de nascimento.
 */
public class Paciente extends Pessoa {
	Integer numeroDoConvenio;

	Float peso;

	Float altura;

	String anodeNascimento;

	public Paciente(String nome, String telefone, String email, String endereco, Integer numeroDoConvenio, Float peso,
			Float altura, String anodeNascimento) {
		super(nome, telefone, email, endereco);
		this.numeroDoConvenio = numeroDoConvenio;
		this.peso = peso;
		this.altura = altura;
		this.anodeNascimento = anodeNascimento;
	}

	


	

}
