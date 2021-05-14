package br.ucsal;

import java.util.Random;

public class Questao14 {
	public static int coluna = 0;
	public static int linha = 0;
	public static int maiornum = 0;
	public static Random rand = new Random();

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		imprimir(ArrayBi());
	}

	public static int[][] ArrayBi() {
		int[][] matriz = new int[4][4];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
				}
		}
		return matriz;
	}
	public static void imprimir(int[][] ArrayBi) {
		for (int i = 0; i < ArrayBi.length; i++) {
			for (int j = 0; j < ArrayBi[i].length; j++) {
				System.out.print(" " + ArrayBi[i][j]);
				if (ArrayBi[i][j] > maiornum) {
					maiornum = ArrayBi[i][j];
					linha = i;
					coluna = j;
				}
			}
			System.out.println();
		}
		System.out.println(
				"\n" + "O maior numero na maatriz é: " + maiornum + "\n" + "Posicao: ( " + linha + "," + coluna + " )");
	}
}
