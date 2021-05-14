package br.ucsal.bes20192.poo.aula14.ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoBasicosJava8 {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		nomes.add("claudio");
		nomes.add("antonio");
		nomes.add("clara");
		nomes.add("maria");
		nomes.add("daniel");

		System.out.println("Nomes, na ordem que foram inforamdos:");
		System.out.println(nomes);

		System.out.println("Nomes, em ordem decrescente:");
		// Diferente do reverse do Collection.sort, o reverseOrder ordena em ordem
		// inversa
		nomes.sort(Comparator.reverseOrder());
		System.out.println(nomes);

		System.out.println("Nomes, em ordem crescente:");
		nomes.sort(Comparator.naturalOrder());
		System.out.println(nomes);

	}

}
