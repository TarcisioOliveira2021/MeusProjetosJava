package br.ucsal.bes20192.poo.aula16.persistence;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.bes20192.poo.aula16.domain.Aluno;
import br.ucsal.bes20192.poo.aula16.exception.InfraestruturaException;
import br.ucsal.bes20192.poo.aula16.exception.NegocioException;

public class AlunoDAO {

	private static final int QTD_MAXIMA_ALUNOS = 3;
	private static List<Aluno> alunos = new ArrayList<>();

	public static void incluir(Aluno aluno) throws InfraestruturaException {
		if (alunos.size() == QTD_MAXIMA_ALUNOS) {
			throw new InfraestruturaException("Você chegou no limite de alunos. Favor pagar atualização de versão.");
		}
		alunos.add(aluno);
	}

	public static Aluno pesquisar(String nome) throws NegocioException {
		for (Aluno aluno : alunos) {
			if (aluno.getNome() != null && aluno.getNome().equalsIgnoreCase(nome)) {
				return aluno;
			}
		}
		throw new NegocioException("Nenhum aluno encontrado com nome " + nome + ".");
	}

	public static List<Aluno> obterTodos() {
		return new ArrayList<>(alunos);
	}

}
