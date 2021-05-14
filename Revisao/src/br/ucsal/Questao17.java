package br.ucsal;

import java.util.Random;

public class Questao17 {

	public static Random rand = new Random();

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		imprimir(ArrayC(ArrayA(), ArrayB()));
	}

	public static int[][] ArrayA() {
		int[][] matriz = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(4);
			}
		}
		return matriz;
	}

	public static int[][] ArrayB() {
		int[][] matriz = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(4);
			}
		}
		return matriz;
	}

	public static int[][] ArrayC(int[][] ArrayA, int[][] ArrayB) {
		int[][] matriz = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ArrayA[i][j] * ArrayB[i][j];
			}
		}
		return matriz;
	}

	public static void imprimir(int[][] ArrayC) {
		for (int i = 0; i < ArrayC.length; i++) {
			for (int j = 0; j < ArrayC[i].length; j++) {
				System.out.print(" " + ArrayC[i][j]);

			}
			System.out.println();
		}
	}

}
