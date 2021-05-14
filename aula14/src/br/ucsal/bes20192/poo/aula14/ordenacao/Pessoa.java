package br.ucsal.bes20192.poo.aula14.ordenacao;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;

	private Integer anoNascimento;

	private String nomeMae;

	public Pessoa(String nome, Integer anoNascimento, String nomeMae) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.nomeMae = nomeMae;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", anoNascimento=" + anoNascimento + ", nomeMae=" + nomeMae + "]";
	}

	@Override
	public int compareTo(Pessoa o) {
		return nome.compareTo(o.nome);
	}

}
