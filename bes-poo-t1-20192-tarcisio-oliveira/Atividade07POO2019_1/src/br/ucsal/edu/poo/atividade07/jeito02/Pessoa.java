package br.ucsal.edu.poo.atividade07.jeito02;

/*
 * Os funcion�rios de uma cl�nica possuem nome, telefone, emails, n�mero de
matr�cula e valor do sal�rio. Como dados complementares para os m�dicos �
necess�rio manter o n�mero do CRM (n�mero de inscri��o no Conselho de
Medicina), a unidade federativa do CRM e as especialidades que o m�dico
atende. Sobre os pacientes � necess�rio saber o nome, telefone, emails,
n�mero do conv�nio, peso, altura e ano de nascimento.
 */
public class Pessoa {
	
	String nome;

	String telefone;

	String email;

	String endereco;

	public Pessoa(String nome, String telefone, String email, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}


		
}
