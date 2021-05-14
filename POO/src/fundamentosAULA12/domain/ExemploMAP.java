package fundamentosAULA12.domain;

import java.util.HashMap;
import java.util.Map;

public class ExemploMAP {

	public static void main(String[] args) {
		executar();
	}

	private static void executar() {
		Aluno aluno1 = new Aluno(123, "Ana", "caju@ucsal.br");
		Aluno aluno2 = new Aluno(234, "Claudio", "manga@ucsal.br");
		Aluno aluno3 = new Aluno(345, "Maria", "jaca@ucsal.br");
		Aluno aluno4 = new Aluno(456, "Pedro", "goiaba@ucsal.br");
		Aluno aluno5 = new Aluno(567, "Joaquim", "melancia@ucsal.br");

		Dissiplina disciplinaPOO = new Dissiplina("BES008", "Programação Orientada à Objetos",
				TipoDissiplinaEnum.ESPECIFICA);
		Dissiplina disciplinaBD = new Dissiplina("BES009", "Banco de Dados", TipoDissiplinaEnum.ESPECIFICA);
		Dissiplina disciplinaIAP = new Dissiplina("ABS123", "Iniciação ao Pensar", TipoDissiplinaEnum.EIXO);

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

		Map<TipoDissiplinaEnum, Integer> map = new HashMap<>();
		calcularQuantidadeAlunoPorTipoDisciplina(turma1, map);
		calcularQuantidadeAlunoPorTipoDisciplina(turma2, map);
		calcularQuantidadeAlunoPorTipoDisciplina(turma4, map);

		System.out.println("Quantidade de alunos por tipo de disciplina:");
		for (TipoDissiplinaEnum tipoDisciplina : map.keySet()) {
			System.out.println(tipoDisciplina + " x " + map.get(tipoDisciplina));
		}
	}

	private static void calcularQuantidadeAlunoPorTipoDisciplina(Turma turma ,Map<TipoDissiplinaEnum,Integer> map) {
		TipoDissiplinaEnum tipoDissiplina = turma.getDisciplina().getTipoDissiplina();
		Integer qtdAlunos = turma.getAlunos().size();
		if(map.containsKey(tipoDissiplina)) {
			qtdAlunos += map.get(tipoDissiplina);
		}
		map.put(tipoDissiplina, qtdAlunos);
	}
}
