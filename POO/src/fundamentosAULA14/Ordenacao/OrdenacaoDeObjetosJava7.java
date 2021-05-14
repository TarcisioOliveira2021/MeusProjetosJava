package fundamentosAULA14.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoDeObjetosJava7 {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("ana", 1979, "maria");
		Pessoa pessoa2 = new Pessoa("claudio", 1973, "maria");
		System.out.println("pessoa1.compareTo(pessoa2)=" + pessoa1.compareTo(pessoa2));

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
		Collections.sort(pessoas);
		exbirListaPessoas(pessoas);

		System.out.println("\nNomes, em ordem decrescente de nome da pessoa:");
		// Atenção, o reverse apenas inverte a listas, para que ela fique em ordem
		// decrescente, é preciso chamar previamente o sort.
		Collections.reverse(pessoas);
		exbirListaPessoas(pessoas);

		System.out.println("\nPessoas, em ordem crescente de ano de nascimento:");
		Comparator<Pessoa> comparadorPessoaAnoNascimento = new ComparadorPessoaPorAnoDeNascimento();
		Collections.sort(pessoas, comparadorPessoaAnoNascimento);
		exbirListaPessoas(pessoas);

		System.out.println("\nPessoas, em ordem crescente de nome da mãe e, para a mesma mãe, por ordem crescente de nome da pessoa:");
		Comparator<Pessoa> comparadorPessoaNomeMaeNome = new ComparadorPessoaNomeDaMaeNome();
		Collections.sort(pessoas, comparadorPessoaNomeMaeNome);
		exbirListaPessoas(pessoas);

	}

	private static void exbirListaPessoas(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
