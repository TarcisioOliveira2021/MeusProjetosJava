package br.ucsal.bes20192.poo.aula14.interfaceexemplo;

import java.util.List;

public class Medico extends Pessoa implements Funcionario, ProfissinonalEspecializado {

	private String crm;

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public Double calcularSalario() {
		return 10000d;
	}

	@Override
	public String toString() {
		return super.toString() + "Medico [crm=" + crm + "]";
	}

	@Override
	public List<String> obterEspecialidades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apresentar() {
		return "Dr. " + getNome();
	}

}
