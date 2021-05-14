package br.ucsal;

import java.util.Scanner;

public class Questao10 {
	public static int maiorNum = 0, menorNum = 0;
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		int valor = 0;
		imprimir(Array(valor));
	}

	public static void imprimir(int[] Array) {
		System.out.println("=======================================");
		System.out.print("Array: ");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(" " + Array[i]);
		}
		System.out.println("");
		System.out.println("\n" + "O maior numero encontrado foi: " + maiorNum);
		System.out.println("O menor numero encontrado foi: " + menorNum);

	}

	public static int[] Array(int valor) {
		int[] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Informe um numero:  ");
			valor = tec.nextInt();
			vetor[i] = valor;
			if (vetor[i] > maiorNum) {
				maiorNum = vetor[i];
			} else {
				menorNum = vetor[i];
			}
		}
		return vetor;
	}

}
