package br.ucsal.bes20192.poo.atividade01;

public class Questao6 {

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		imprimir(ArrayC(ArrayA(), ArrayB()));
	}

	public static int[] ArrayA() {
		int valor = 10;
		int[] vetor = new int[valor];
		for (int i = 0; i < valor; i++) {
			vetor[i] = i;
		}
		return vetor;
	}

	public static int[] ArrayB() {
		int valor = 10;
		int[] vetor = new int[valor];
		for (int i = 0; i < valor; i++) {
			vetor[i] = i;
		}
		return vetor;
	}

	public static int[] ArrayC(int[] ArrayA, int[] ArrayB) {
		int valor = 10;
		int[] vetor = new int[valor];
		for (int i = 0; i < valor; i++) {
			vetor[i] = ArrayA[i] + ArrayB[i];
		}
		return vetor;
	}

	public static void imprimir(int[] ArrayC) {
		for (int i = 0; i < ArrayC.length; i++) {
			System.out.print(ArrayC[i] + " ");
		}
	}

}
