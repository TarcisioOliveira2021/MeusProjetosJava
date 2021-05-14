package br.ucsal.bes20192.poo.atividade07.clinica;

import java.util.List;

public class Medico extends Funcionario {

	private Integer crm;

	private String uf;

	private List<String> especialidades;

	public Medico(String nome, String telefone, Integer numeroMatricula, Integer crm, String uf,
			List<String> especialidades) {
		super(nome, telefone, numeroMatricula);
		this.crm = crm;
		this.uf = uf;
		this.especialidades = especialidades;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public List<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
	}

}
