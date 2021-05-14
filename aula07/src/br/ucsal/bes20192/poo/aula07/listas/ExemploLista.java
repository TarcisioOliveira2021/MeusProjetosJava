package br.ucsal.bes20192.poo.aula07.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExemploLista {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<String> nomes = null;
		String tipoImplementacaoList;

		System.out.println("Voc� gostaria de utilizar um ArrayList(A) ou um LinkedList(L):");
		tipoImplementacaoList = sc.nextLine();
		if (tipoImplementacaoList.equalsIgnoreCase("A")) {
			nomes = new ArrayList<String>();
		} else {
			nomes = new LinkedList<String>();
		}

		System.out.println("Datatype de nomes=" + nomes.getClass().getCanonicalName());

		nomes.add("claudio");
		nomes.add("maria");
		nomes.add("pedro");

		// A chamada add passando um double implica em um erro de compila��o
		// pois a lista foi definida para armazenar String.
		// nomes.add(123.0);

		// Exibi��o da objeto lista de nomes
		System.out.println(nomes);

		// Tratamento (exibi��o) de cada item da lista de nomes
		for (String nome : nomes) {
			System.out.println(nome);
		}

		// O la�o abaixo funciona exatamente como o la�o anterior
		for (int i = 0; i < nomes.size(); i++) {
			String nome = nomes.get(i);
			System.out.println(nome);
		}

		// Exibir a quantidade de nomes na lista de nomes
		System.out.println("Quantidade de nomes na lista:" + nomes.size());

	}

}
