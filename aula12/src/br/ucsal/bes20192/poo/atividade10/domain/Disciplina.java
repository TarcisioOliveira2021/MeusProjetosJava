package br.ucsal.bes20192.poo.atividade10.domain;

public class Disciplina {

	private String codigo;

	private String nome;

	private TipoDisciplinaEnum tipoDisciplina;

	public Disciplina(String codigo, String nome, TipoDisciplinaEnum tipoDisciplina) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipoDisciplina = tipoDisciplina;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoDisciplinaEnum getTipoDisciplina() {
		return tipoDisciplina;
	}

	public void setTipoDisciplina(TipoDisciplinaEnum tipoDisciplina) {
		this.tipoDisciplina = tipoDisciplina;
	}

}
