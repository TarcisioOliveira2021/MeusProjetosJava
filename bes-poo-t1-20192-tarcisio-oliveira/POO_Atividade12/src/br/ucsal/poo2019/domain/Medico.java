package br.ucsal.poo2019.domain;

import java.util.List;

public class Medico extends Funcionario {
	// Constantes
	// Atributos
	// Construtores
	// Métodos públicos
	// Métodos privados
	
	private Integer crm;
	private List<String> especialidades;

	public Medico(String nome, Integer anoAdmissao, Double salario, Integer crm, List<String> especialidades) {
		super(nome, anoAdmissao, salario);
		this.crm = crm;
		this.especialidades = especialidades;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public List<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((crm == null) ? 0 : crm.hashCode());
		result = prime * result + ((especialidades == null) ? 0 : especialidades.hashCode());
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
		Medico other = (Medico) obj;
		if (crm == null) {
			if (other.crm != null)
				return false;
		} else if (!crm.equals(other.crm))
			return false;
		if (especialidades == null) {
			if (other.especialidades != null)
				return false;
		} else if (!especialidades.equals(other.especialidades))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "|Medico: " + super.toString() + " |Crm = " + crm + " |Especialidades = " + especialidades;
	}

}
