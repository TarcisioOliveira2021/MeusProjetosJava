package br.ucsal;

import java.util.Random;

public class Questao15 {
	public static Random rand = new Random();

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		imprimir(ArrayBi());
	}

	public static int[][] ArrayBi() {
		int[][] matriz = new int[10][10];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
			}
		}
		return matriz;
	}

	public static void imprimir(int[][] ArrayBi) {
		int maior = 0, menor = 0, maior1 = 0, menor1 = 1;
		int coluna = 0, coluna1 = 0, coluna2 = 0, coluna3 = 0;
		for (int i = 0; i < ArrayBi.length; i++) {
			for (int j = 0; j < ArrayBi[i].length; j++) {
				System.out.print(" " + ArrayBi[i][j]);
				if (ArrayBi[5][j] > maior) {
					maior = ArrayBi[5][j];
					coluna = j;
				}
				if (ArrayBi[5][j] <= menor) {
					menor = ArrayBi[5][j];
					coluna1 = j;
				}
				if (ArrayBi[7][j] > maior1) {
					maior1 = ArrayBi[7][j];
					coluna2 = j;
				}
				if (ArrayBi[7][j] <= menor1) {
					menor1 = ArrayBi[7][j];
					coluna3 = j;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("O maior numero na linha 5 é " + maior + " na posicao: 5," + coluna);
		System.out.println("O menor numero na linha 5 é " + menor + " na posicao: 5," + coluna1);
		System.out.println("O maior numero na linha 7 é " + maior1 + " na posicao: 7," + coluna2);
		System.out.println("O menor numero na linha 7 é " + menor1 + " na posicao: 7," + coluna3);
	}
}
