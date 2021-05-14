package br.ucsal.bes20192.poo.aula14.interfaceexemplo;

import java.util.List;

public class Enfermeiro extends Pessoa implements Funcionario, ProfissinonalEspecializado {

	private String coren;

	public String getCoren() {
		return coren;
	}

	public void setCoren(String coren) {
		this.coren = coren;
	}

	@Override
	public Double calcularSalario() {
		return 20000d;
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
