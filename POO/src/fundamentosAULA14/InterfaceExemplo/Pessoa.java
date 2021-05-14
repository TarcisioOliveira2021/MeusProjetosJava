package fundamentosAULA14.InterfaceExemplo;
//Criacao de um objeto pessoa que nao é instanciavel.
public abstract class Pessoa {
	//Atributos de uma pessoa.
	//Atributos privados so podem ser acessados pela propria classe.
	
	private String nome;
	private String nomeMae;
	private String telefone;
	
	//Criacao dos metodos getters and Setters.
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
	//Criacao do metodo que toString que é responsavel por escrever os atributos do objeto desejado.
	//O Override = sobreescreve o mesmo metodo de acordo com a hierarquia.
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nomeMae=" + nomeMae + ", telefone=" + telefone + "]";
	}
	
	
}
