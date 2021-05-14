package fundamentosAULA14.Ordenacao;

//Uma pessoa pode ser comparada com outra pessoa.
public class Pessoa implements Comparable<Pessoa>{
	//Atributos de uma pessoa
	private String nome;
	private Integer anoDeNascimento;
	private String nomeMae;
	//Construtor da classe pessoa.
	public Pessoa(String nome, Integer anoDeNascimento, String nomeMae) {
		super();
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.nomeMae = nomeMae;
	}
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(Integer anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	//toString	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", anoDeNascimento=" + anoDeNascimento + ", nomeMae=" + nomeMae + "]";
	}
	@Override
	//o é a pessoa passada por parametro
	//Esse metodo compara um nome com um passado por parametro.
	public int compareTo(Pessoa o) {
		return nome.compareTo(o.nome);
	}
	
}
