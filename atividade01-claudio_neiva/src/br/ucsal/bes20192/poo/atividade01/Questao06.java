package br.ucsal.bes20192.poo.atividade01;

import java.util.Scanner;

/*
6. Crie um programa em Java que permita a entrada de 10 valores em cada um dos dois
vetores (vet1 e vet2). A seguir o programa deverá armazenar num terceiro vetor (vet3) a soma
do conteúdo dos dois vetores (vet1 e vet2). Por fim, o programa deverá exibir os valores
armazenados em vet3.
 */
public class Questao06 {

	private static final int QTD_ITENS = 10;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		obterNumerosApresentarSoma();
	}

	private static void obterNumerosApresentarSoma() {
		int[] vet1;
		int[] vet2;
		int[] vet3;
		vet1 = obterNumeros();
		vet2 = obterNumeros();
		vet3 = somarVetores(vet1, vet2);
		exibirVetor("soma dos vetores = ", vet3);
	}

	private static void exibirVetor(String mensagem, int[] vet) {
		System.out.println(mensagem);
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + "\t");
		}
	}

	private static int[] somarVetores(int[] vet1, int[] vet2) {
		int[] vetSoma = new int[QTD_ITENS];
		for (int i = 0; i < vetSoma.length; i++) {
			vetSoma[i] = vet1[i] + vet2[i];
		}
		return vetSoma;
	}

	private static int[] obterNumeros() {
		int[] vet = new int[QTD_ITENS];
		System.out.println("Informe " + QTD_ITENS + " números:");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = scanner.nextInt();
		}
		return vet;
	}

}
