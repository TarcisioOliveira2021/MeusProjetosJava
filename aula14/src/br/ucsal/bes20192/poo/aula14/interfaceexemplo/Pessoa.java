package br.ucsal.bes20192.poo.aula14.interfaceexemplo;

public abstract class Pessoa {

	private String nome;

	private String nomeMae;

	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public abstract String apresentar();
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nomeMae=" + nomeMae + ", telefone=" + telefone + "]";
	}

}
