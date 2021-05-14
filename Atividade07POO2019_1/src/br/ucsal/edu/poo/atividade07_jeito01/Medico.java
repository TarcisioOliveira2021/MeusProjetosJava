package br.ucsal.edu.poo.atividade07_jeito01;

/*
 * Os funcion�rios de uma cl�nica possuem nome, telefone, emails, n�mero de
matr�cula e valor do sal�rio. Como dados complementares para os m�dicos �
necess�rio manter o n�mero do CRM (n�mero de inscri��o no Conselho de
Medicina), a unidade federativa do CRM e as especialidades que o m�dico
atende. Sobre os pacientes � necess�rio saber o nome, telefone, emails,
n�mero do conv�nio, peso, altura e ano de nascimento.
 */
public class Medico extends Funcionario {


	Integer numeroDoCrm;

	String unidadeFederativaCrm;

	String especialidade;

	@Override
	public String toString() {
		return "Medico [numeroDoCrm=" + numeroDoCrm + ", unidadeFederativaCrm=" + unidadeFederativaCrm
				+ ", especialidade=" + especialidade + ", numeroDeMatricula=" + numeroDeMatricula + ", valorDoSalario="
				+ valorDoSalario + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", endereco="
				+ endereco + "]";
	}



	

}
