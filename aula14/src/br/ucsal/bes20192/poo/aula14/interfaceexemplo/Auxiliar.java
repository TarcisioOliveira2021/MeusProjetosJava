package br.ucsal.bes20192.poo.aula14.interfaceexemplo;

public class Auxiliar extends Pessoa implements Funcionario {

	@Override
	public Double calcularSalario() {
		return 5000d;
	}

	@Override
	public String apresentar() {
		return "Sr. " + getNome();
	}

}
