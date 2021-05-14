package br.ucsal.bes20192.poo.atividade10.domain;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno(123, "Ana", "caju@ucsal.br");
		Aluno aluno2 = new Aluno(234, "Claudio", "manga@ucsal.br");
		Aluno aluno3 = new Aluno(345, "Maria", "jaca@ucsal.br");
		Aluno aluno4 = new Aluno(456, "Pedro", "goiaba@ucsal.br");
		Aluno aluno5 = new Aluno(567, "Joaquim", "melancia@ucsal.br");

		Disciplina disciplinaPOO = new Disciplina("BES008", "Programação Orientada à Objetos",
				TipoDisciplinaEnum.ESPECIFICA);
		Disciplina disciplinaBD = new Disciplina("BES009", "Banco de Dados", TipoDisciplinaEnum.ESPECIFICA);
		Disciplina disciplinaIAP = new Disciplina("ABS123", "Iniciação ao Pensar", TipoDisciplinaEnum.EIXO);

		Turma turma1 = new Turma(2018, 1, disciplinaPOO);
		Turma turma2 = new Turma(2018, 1, disciplinaBD);
		Turma turma4 = new Turma(2019, 2, disciplinaIAP);

		turma1.getAlunos().add(aluno1);
		turma1.getAlunos().add(aluno2);
		turma1.getAlunos().add(aluno3);

		turma2.getAlunos().add(aluno2);
		turma2.getAlunos().add(aluno3);

		turma4.getAlunos().add(aluno1);
		turma4.getAlunos().add(aluno3);
		turma4.getAlunos().add(aluno4);
		turma4.getAlunos().add(aluno5);

		// Quantos alunos existem por tipo de disciplina
		// ESPECIFICA -> 5
		// EIXO -> 4

		// Map<tipo da disciplina, quantidade de alunos para este tipo de disciplina>
		// quantidadeAlunosPorTipoDisciplina
		Map<TipoDisciplinaEnum, Integer> map = new HashMap<>();
		calcularQuantidadeAlunoPorTipoDisciplina(turma1, map);
		calcularQuantidadeAlunoPorTipoDisciplina(turma2, map);
		calcularQuantidadeAlunoPorTipoDisciplina(turma4, map);

		System.out.println("Quantidade de alunos por tipo de disciplina:");
		for (TipoDisciplinaEnum tipoDisciplina : map.keySet()) {
			System.out.println(tipoDisciplina + " x " + map.get(tipoDisciplina));
		}
	}

	private static void calcularQuantidadeAlunoPorTipoDisciplina(Turma turma, Map<TipoDisciplinaEnum, Integer> map) {
		TipoDisciplinaEnum tipoDisciplina = turma.getDisciplina().getTipoDisciplina();
		Integer qtdAlunos = turma.getAlunos().size();
		if (map.containsKey(tipoDisciplina)) {
			qtdAlunos += map.get(tipoDisciplina);
		}
		map.put(tipoDisciplina, qtdAlunos);
	}

}
