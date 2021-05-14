package br.ucsal.bes20192.poo.aula14.ordenacao;

import java.util.Comparator;

public class ComparadorPessoaNomeMaeNome implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		int resultado = o1.getNomeMae().compareTo(o2.getNomeMae());
		if (resultado == 0) {
			resultado = o1.getNome().compareTo(o2.getNome());
		}
		return resultado;
	}

}
