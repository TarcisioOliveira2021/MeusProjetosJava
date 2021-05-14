package br.ucsal.bes20192.poo.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade09ALista {

	private static final int QTD_NOMES = 10;

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<String> nomesDistintos = obterNomesDistintos();
		exibir(nomesDistintos);
	}

	private static List<String> obterNomesDistintos() {
		List<String> nomesDistintos = new ArrayList<>();

		System.out.println("Usando LIST");
		System.out.println("Informe " + QTD_NOMES + " nomes distintos:");
		do {
			String nome = sc.nextLine();
			if (!nomesDistintos.contains(nome)) {
				nomesDistintos.add(nome);
			}
		} while (nomesDistintos.size() < QTD_NOMES);

		return nomesDistintos;
	}

	private static void exibir(List<String> nomesDistintos) {
		System.out.println("Os nomes distintos informados foram:");
		for (String nome : nomesDistintos) {
			System.out.println(nome);
		}

	}

}
