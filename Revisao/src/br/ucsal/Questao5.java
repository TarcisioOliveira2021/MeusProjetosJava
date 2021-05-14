package br.ucsal;

public class Questao5 {

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		System.out.println(" L E I T O R  D E  A R R A Y ");
		imprimir(Array(10));
	}

	public static int[] Array(int valor) {
		int ContPar = 0;
		int[] vetor = new int[valor];
		for (int i = 0; i < valor; i++) {
			vetor[i] = i;
			if ((i * (i + 1)) % 2 == 0) {
				ContPar++;
			}
		}
		System.out.print("O Array possui " + ContPar + " casal pares");
		System.out.println("");
		return vetor;
	}

	public static void imprimir(int[] Array) {
		for (int i = 1; i < Array.length; i++) {
			System.out.print(" " + Array[i]);
		}
	}
}
