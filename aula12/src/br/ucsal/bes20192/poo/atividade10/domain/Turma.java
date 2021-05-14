package br.ucsal.bes20192.poo.atividade10.domain;

import java.util.Set;

public class Turma {

	private Integer ano;

	private Integer semestre;

	private Disciplina disciplina;

	private Set<Aluno> alunos = new CajuSet<>();

	public Turma(Integer ano, Integer semestre, Disciplina disciplina) {
		super();
		this.ano = ano;
		this.semestre = semestre;
		this.disciplina = disciplina;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

}
