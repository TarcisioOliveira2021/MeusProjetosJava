package br.ucsal;

import java.util.Scanner;

public class Questao4 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		System.out.println("               Extimativa da Populacao ");
		System.out.println("            ===============================");
		imprimir();
	}

	public static void imprimir() {
		int Ano = 2017, projecao;
		double populacaoAtual = 7530000000.0, crescimentoAnual = 1.2 / 100.0;
		System.out.print("\n" + "        Anos extimados que gostaria de verificar ? :");
		projecao = tec.nextInt();
		System.out.println("");
		for (int i = 0; i < projecao; i++) {
			System.out.printf("Para " + Ano + " haverão %,.0f habitantes no planeta !\n",
					(populacaoAtual * (1.0 + crescimentoAnual)));
			populacaoAtual = populacaoAtual * (1.0 + crescimentoAnual);
			Ano++;
		}

	}

}
