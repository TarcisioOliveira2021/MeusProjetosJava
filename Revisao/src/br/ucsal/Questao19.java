package br.ucsal;

import java.util.Scanner;

public class Questao19 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		int[] Array = new int[21];
		Array = LeitorDeArray();
		System.out.println("===========================================");
		FatorialDoArray(Array);
		VerificarPrimo(Array);
		VerificarMaiorEmenor(Array);
	}

	public static int[] LeitorDeArray() {
		int[] vetor = new int[21];
		for (int i = 1; i < vetor.length; i++) {
			System.out.print("Informe o " + i + "ª: ");
			vetor[i] = tec.nextInt();
		}
		return vetor;
	}

	public static void FatorialDoArray(int[] LeitorDeArray) {
		int fat = 1;
		for (int i = 1; i < LeitorDeArray.length; i++) {
			fat *= i;
			System.out.println("O fatorial de " + LeitorDeArray[i] + "  é: " + fat);
		}
		System.out.println("===========================================");
	}

	public static void VerificarPrimo(int[] LeitorDeArray) {
		int divisores = 0;
		for (int i = 1; i < LeitorDeArray.length; i++) {
			for (int j = 1; j <= LeitorDeArray[i]; j++) {
				if (LeitorDeArray[i] % j == 0) {
					divisores++;
				}
			}
			if (divisores == 2) {
				System.out.println(LeitorDeArray[i] + " é primo.");
			} else {
				System.out.println(LeitorDeArray[i] + " Nao é primo.");
			}
			divisores = 0;
		}
		System.out.println("===========================================");
	}

	public static void VerificarMaiorEmenor(int[] LeitorDeArray) {
		int maior = 0;
		int menor = 1;
		for (int i = 1; i < LeitorDeArray.length; i++) {
			if (LeitorDeArray[i] > maior) {
				maior = LeitorDeArray[i];
			}
			if (LeitorDeArray[i] < menor) {
				menor = LeitorDeArray[i];
			}
		}
		System.out.println("O maior numero no array é: " + maior);
		System.out.println("O menor numero no array é: " + menor);
	}
}
