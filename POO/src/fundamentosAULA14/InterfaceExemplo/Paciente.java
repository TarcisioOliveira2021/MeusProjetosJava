package fundamentosAULA14.InterfaceExemplo;
//Um paciente é uma pessoa mais NAO é um funcionario.
public class Paciente extends Pessoa{
	//Atributos de um paciente
	private String numeroConvenio;
	//Metodo getter and setter

	public String getNumeroConvenio() {
		return numeroConvenio;
	}

	public void setNumeroConvenio(String numeroConvenio) {
		this.numeroConvenio = numeroConvenio;
	}
	//Metodo de apresentacao de um paciente.
	public String apresentar() {
		return "Sr. "+ getNome();
	}
}
