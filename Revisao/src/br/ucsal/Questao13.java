package br.ucsal;

import java.util.Random;
import java.util.Scanner;

public class Questao13 {
	public static Random rand = new Random();
	public static int NumeroRandom;
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		System.out.println("        Sorteador");
		System.out.println("==========================");
		System.out.println("Dica: Numeros de 0 a 20");
		Sorteador();
	}

	public static void Sorteador() {
		NumeroRandom = rand.nextInt(10);
		imprimir(ArraySorteador(), MeuVetor());
	}

	public static int[] ArraySorteador() {
		int[] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = NumeroRandom;
			NumeroRandom = rand.nextInt(10);
		}
		return vetor;
	}

	public static int[] MeuVetor() {
		int valor;
		int[] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor: ");
			valor = tec.nextInt();
			vetor[i] = valor;
		}
		return vetor;
	}

	public static void imprimir(int[] ArraySorteador, int[] MeuVetor) {
		for (int i = 0; i < ArraySorteador.length; i++) {
			if (MeuVetor[i] == ArraySorteador[i]) {
				System.out.println("O numero tem no array na posicao: " + i);
			} else {
				System.out.println("O numero nao tem no array nesta posicao");
			}
		}
		System.out.print("Array:");
		for (int i = 0; i < MeuVetor.length; i++) {
			System.out.print(" " + ArraySorteador[i]);
		}
	}

}
