package br.ucsal;

import java.util.Scanner;

public class Questao11 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		int valor = 0;
		int razao = 0;
		System.out.print("Informe o 1º termo da PA: ");
		valor = tec.nextInt();
		System.out.print("Informe a razao da PA: ");
		razao = tec.nextInt();
		imprimir(ArrayDaPA(valor, razao));
	}

	public static int[] ArrayDaPA(int a1, int razao) {
		int[] vetor = new int[11];
		for (int i = 1, aux = 0; i < vetor.length; i++) {
			vetor[i] = a1;
			aux = a1 + razao;
			a1 = aux;
		}
		return vetor;
	}

	public static void imprimir(int[] ArrayDaPA) {
		System.out.println("=======================================");
		System.out.println("       Progressão Aritmética ");
		for (int i = 1; i < ArrayDaPA.length; i++) {
			System.out.println("A" + i + ": " + ArrayDaPA[i]);
		}
	}
}
