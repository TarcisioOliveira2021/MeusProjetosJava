package br.ucsal.bes20192.poo.aula14.ordenacao;

import java.util.Comparator;

public class ComparadorPessoaAnoNascimento implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getAnoNascimento().compareTo(o2.getAnoNascimento());
	}

}
