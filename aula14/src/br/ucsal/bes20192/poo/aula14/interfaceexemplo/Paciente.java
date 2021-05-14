package br.ucsal.bes20192.poo.aula14.interfaceexemplo;

public class Paciente extends Pessoa {

	private String numeroConvenio;

	public String getNumeroConvenio() {
		return numeroConvenio;
	}

	public void setNumeroConvenio(String numeroConvenio) {
		this.numeroConvenio = numeroConvenio;
	}

	@Override
	public String apresentar() {
		return "Sr. " + getNome();
	}

}
