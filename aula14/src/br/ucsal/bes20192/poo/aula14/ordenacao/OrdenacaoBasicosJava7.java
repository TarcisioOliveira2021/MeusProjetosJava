package br.ucsal.bes20192.poo.aula14.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoBasicosJava7 {

	public static void main(String[] args) {

		String nome1 = "ana";
		String nome2 = "claudio";
		System.out.println("nome1.compareTo(nome2)=" + nome1.compareTo(nome2));

		List<String> nomes = new ArrayList<>();
		nomes.add("claudio");
		nomes.add("antonio");
		nomes.add("clara");
		nomes.add("maria");
		nomes.add("daniel");

		System.out.println("Nomes, na ordem que foram inforamdos:");
		System.out.println(nomes);

		System.out.println("Nomes, em ordem crescente:");
		Collections.sort(nomes);
		System.out.println(nomes);

		System.out.println("Nomes, em ordem decrescente:");
		// Atenção, o reverse apenas inverte a listas, para que ela fique em ordem
		// decrescente, é preciso chamar previamente o sort.
		Collections.reverse(nomes);
		System.out.println(nomes);

	}

}
