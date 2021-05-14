package br.ucsal.bes20192.poo.aula16.domain;

import br.ucsal.bes20192.poo.aula16.exception.NegocioException;

public class Aluno {

	// Constantes

	// Atributos

	// Construtores

	// Métodos públicos
	// 1-> métodos específicos
	// 2-> getters/setters
	// 3-> equals/hashcode
	// 4-> toString

	// Métodos privados

	private Integer matricula;

	private String nome;

	private Integer anoNascimento;

	public Aluno(Integer matricula, String nome, Integer anoNascimento) throws NegocioException {
		super();
		this.matricula = matricula;
		this.nome = nome;
		setAnoNascimento(anoNascimento);
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
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

	public void setAnoNascimento(Integer anoNascimento) throws NegocioException {
		validarAnoNascimento(anoNascimento);
		this.anoNascimento = anoNascimento;
	}

	// Esta validação está aqui apenas para ilustar a possibilidade de validar
	// dentro do objeto ao invés de utilizar uma classe de negócio (AlunoBO) com
	// este objetivo. Crie uma estratégia (ou valida no domain ou no business) e
	// evite misturar as estratégias.
	private void validarAnoNascimento(Integer anoNascimento) throws NegocioException {
		if (anoNascimento == null || anoNascimento < 2000) {
			throw new NegocioException("O ano de nascimento deve ser maior que 2000.");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoNascimento == null) ? 0 : anoNascimento.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Aluno other = (Aluno) obj;
		if (anoNascimento == null) {
			if (other.anoNascimento != null)
				return false;
		} else if (!anoNascimento.equals(other.anoNascimento))
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
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", anoNascimento=" + anoNascimento + "]";
	}

}
