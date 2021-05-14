package br.ucsal;

import java.util.Scanner;

public class Questao16 {
	public static int numerospares = 0, numerosimpares = 0;
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		imprimir(ArrayBi());
	}

	public static int[][] ArrayBi() {
		int[][] matriz = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite um valor: ");
				matriz[i][j] = tec.nextInt();
				if (matriz[i][j] % 2 == 0) {
					numerospares++;
				} else {
					numerosimpares++;
				}
			}
		}
		return matriz;
	}

	public static void imprimir(int[][] ArrayBi) {
		System.out.println();
		System.out.println("         M A T R I Z ");
		for (int i = 0; i < ArrayBi.length; i++) {
			for (int j = 0; j < ArrayBi[i].length; j++) {
				System.out.print(ArrayBi[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Existem " + numerospares + " pares na matriz ");
		System.out.println("Existem " + numerosimpares + " impares na matriz ");
	}

}
