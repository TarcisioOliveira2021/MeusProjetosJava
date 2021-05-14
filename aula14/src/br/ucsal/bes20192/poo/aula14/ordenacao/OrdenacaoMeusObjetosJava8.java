package br.ucsal.bes20192.poo.aula14.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoMeusObjetosJava8 {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("claudio", 1973, "lais"));
		pessoas.add(new Pessoa("lucas", 2000, "maria"));
		pessoas.add(new Pessoa("michel", 2001, "gilmara"));
		pessoas.add(new Pessoa("clara", 2000, "lara"));
		pessoas.add(new Pessoa("joaquim", 1995, "lara"));
		pessoas.add(new Pessoa("pedro", 2003, "maria"));
		pessoas.add(new Pessoa("dmitri", 1979, "lara"));

		System.out.println("\nPessoas, na ordem que foram inforamdas:");
		exbirListaPessoas(pessoas);

		System.out.println("\nPessoas, em ordem crescente de nome da pessoa:");
		pessoas.sort(Comparator.naturalOrder());
		exbirListaPessoas(pessoas);

		System.out.println("\nPessoas, em ordem crescente de ano de nascimento:");

		// Collections.sort(pessoas, new Comparator<Pessoa>() {
		// @Override
		// public int compare(Pessoa o1, Pessoa o2) {
		// return o1.getAnoNascimento().compareTo(o2.getAnoNascimento());
		// }
		// });

		// pessoas.sort((Pessoa p1, Pessoa p2) ->
		// p1.getAnoNascimento().compareTo(p2.getAnoNascimento()));

		pessoas.sort(Comparator.comparing(Pessoa::getAnoNascimento));

		exbirListaPessoas(pessoas);

		System.out.println(
				"\nPessoas, em ordem crescente de nome da mãe e, para a mesma mãe, por ordem crescente de nome da pessoa:");
		pessoas.sort(Comparator.comparing(Pessoa::getNomeMae).thenComparing(Pessoa::getNome));
		exbirListaPessoas(pessoas);

	}

	private static void exbirListaPessoas(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
