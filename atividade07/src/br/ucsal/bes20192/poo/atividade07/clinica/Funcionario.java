package br.ucsal.bes20192.poo.atividade07.clinica;

public class Funcionario extends Pessoa {

	private Integer numeroMatricula;

	private Float salario;

	public Funcionario(String nome, String telefone, Integer numeroMatricula) {
		super(nome, telefone);
		this.numeroMatricula = numeroMatricula;
	}

	public Funcionario(String nome, String telefone, Float salario) {
		super(nome, telefone);
		this.salario = salario;
	}

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(Integer numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

}
