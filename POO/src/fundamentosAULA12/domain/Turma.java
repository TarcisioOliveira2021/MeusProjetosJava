package fundamentosAULA12.domain;

import java.util.Set;
import java.util.TreeSet;

public class Turma {

	private Integer ano;
	private Integer semestre;
	private Dissiplina disciplina;
	private Set<Aluno> alunos = new TreeSet<>();

	public Turma(Integer ano, Integer semestre, Dissiplina disciplina) {
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

	public Dissiplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Dissiplina disciplina) {
		this.disciplina = disciplina;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

}
