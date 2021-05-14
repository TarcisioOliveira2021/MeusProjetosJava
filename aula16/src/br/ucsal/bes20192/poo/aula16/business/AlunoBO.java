package br.ucsal.bes20192.poo.aula16.business;

import java.util.List;

import br.ucsal.bes20192.poo.aula16.domain.Aluno;
import br.ucsal.bes20192.poo.aula16.exception.NegocioException;
import br.ucsal.bes20192.poo.aula16.persistence.AlunoDAO;

public class AlunoBO {

	public static void incluir(Aluno aluno) throws NegocioException {
		validar(aluno); // Se ocorrer uma exception, retorna daqui.
		AlunoDAO.incluir(aluno);
	}

	public static Aluno pesquisar(String nome) throws NegocioException {
		return AlunoDAO.pesquisar(nome);
	}

	private static void validar(Aluno aluno) throws NegocioException {
		if (aluno.getAnoNascimento() == null || aluno.getAnoNascimento() < 2000) {
			throw new NegocioException("O ano de nascimento deve ser maior que 2000.");
		}
		if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new NegocioException("O nome do aluno deve ser informado");
		}
	}

	public static List<Aluno> obterTodos(){
		return AlunoDAO.obterTodos();
	}
	
}
