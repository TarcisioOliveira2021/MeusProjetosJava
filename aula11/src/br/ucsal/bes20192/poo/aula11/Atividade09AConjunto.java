package br.ucsal.bes20192.poo.aula11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade09AConjunto {

	private static final int QTD_NOMES = 5;

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Set<String> nomesDistintos = obterNomesDistintos();
		exibir(nomesDistintos);
	}

	private static Set<String> obterNomesDistintos() {
		Set<String> nomesDistintos = new HashSet<>();
		
		System.out.println("Usando SET");
		System.out.println("Informe " + QTD_NOMES + " nomes distintos:");
		do {
			String nome = sc.nextLine();
			nomesDistintos.add(nome);
		} while (nomesDistintos.size() < QTD_NOMES);

		return nomesDistintos;
	}

	private static void exibir(Set<String> nomesDistintos) {
		System.out.println("Os nomes distintos informados foram:");
		for (String nome : nomesDistintos) {
			System.out.println(nome);
		}

	}

}
