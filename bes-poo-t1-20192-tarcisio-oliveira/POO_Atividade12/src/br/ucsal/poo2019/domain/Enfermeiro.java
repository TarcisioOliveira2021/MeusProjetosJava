package br.ucsal.poo2019.domain;

public class Enfermeiro extends Funcionario {

	// Constantes
	// Atributos
	// Construtores
	// Métodos públicos
	// Métodos privados
	
	private Integer coren;
	private TipoAtuacaoEnum atuacao;
	private Integer cargaHoraria;

	public Enfermeiro(String nome, Integer anoAdmissao, Double salario, Integer coren, TipoAtuacaoEnum atuacao,
			Integer cargaHoraria) {
		super(nome, anoAdmissao, salario);
		this.coren = coren;
		this.atuacao = atuacao;
		this.cargaHoraria = cargaHoraria;
	}

	public Integer getCoren() {
		return coren;
	}

	public void setCoren(Integer coren) {
		this.coren = coren;
	}

	public TipoAtuacaoEnum getAtuacao() {
		return atuacao;
	}

	public void setAtuacao(TipoAtuacaoEnum atuacao) {
		this.atuacao = atuacao;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((atuacao == null) ? 0 : atuacao.hashCode());
		result = prime * result + ((cargaHoraria == null) ? 0 : cargaHoraria.hashCode());
		result = prime * result + ((coren == null) ? 0 : coren.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enfermeiro other = (Enfermeiro) obj;
		if (atuacao != other.atuacao)
			return false;
		if (cargaHoraria == null) {
			if (other.cargaHoraria != null)
				return false;
		} else if (!cargaHoraria.equals(other.cargaHoraria))
			return false;
		if (coren == null) {
			if (other.coren != null)
				return false;
		} else if (!coren.equals(other.coren))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "|Enfermeiro: " + super.toString() + " |Coren = " + coren + " |Atuacao = " + atuacao
				+ " |Carga horaria = " + cargaHoraria;
	}

}
