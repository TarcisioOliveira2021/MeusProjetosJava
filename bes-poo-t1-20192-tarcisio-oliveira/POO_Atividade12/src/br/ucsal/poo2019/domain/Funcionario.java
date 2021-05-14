package br.ucsal.poo2019.domain;

public class Funcionario implements Comparable<Funcionario> {
	// Constantes
	// Atributos
	// Construtores
	// Métodos públicos
	// Métodos privados

	private static Integer contador = 0;
	private Integer matricula;
	private String nome;
	private Integer anoAdmissao;
	private Double salario;

	public Funcionario(String nome, Integer anoAdmissao, Double salario) {
		this.matricula = contador;
		contador++;
		this.nome = nome;
		this.anoAdmissao = anoAdmissao;
		this.salario = salario;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnoAdmissao() {
		return anoAdmissao;
	}

	public void setAnoAdmissao(Integer anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoAdmissao == null) ? 0 : anoAdmissao.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (anoAdmissao == null) {
			if (other.anoAdmissao != null)
				return false;
		} else if (!anoAdmissao.equals(other.anoAdmissao))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(Funcionario) Nome = " + nome + " |Matricula = " + matricula + " |Ano de Admissao = " + anoAdmissao + " |Salario = "
				+ salario;
	}

	@Override
	public int compareTo(Funcionario o) {
		return nome.compareTo(o.nome);
	}

}
