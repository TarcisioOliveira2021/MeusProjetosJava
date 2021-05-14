package br.ucsal;

import java.util.Scanner;

public class Questao18 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetorA = new int[5];
		int[] vetorB = new int[8];
		int[] vetorC = new int[vetorA.length + vetorB.length];

		System.out.println("           Vetor A");
		for (int i = 0; i < 5; i++) {
			System.out.print("vetorA[" + i + "]: ");
			vetorA[i] = tec.nextInt();
		}

		System.out.println("           Vetor B");
		for (int i = 0; i < 8; i++) {
			System.out.print("vetorB[" + i + "]: ");
			vetorB[i] = tec.nextInt();
		}
		int aux = 1;
		for (int i = 0; i < vetorA.length; i++) {
			vetorC[aux] = vetorA[i];
			aux = aux + 2;
		}
		aux = 0;
		for (int i = 0; i < vetorB.length;) {
			if(vetorC[aux]==0) {
				vetorC[aux] = vetorB[i];
				i++;
			}
		aux++;
		}

		System.out.println("            Vetor C");
		for (int i = 1; i < vetorC.length; i++) {
			System.out.println("vetorC[" + i + "]: " + vetorC[i]);
		}

	}
}
