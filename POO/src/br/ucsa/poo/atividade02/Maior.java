package br.ucsa.poo.atividade02;

import java.util.Scanner;

public class Maior implements IMaior {

	public void obterNumeros(int[] vet) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Informe 5 numeros: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = scr.nextInt();
		}
		scr.close();
	}

	public int encontrarMaiorNumero(int[] vet) {
		int maior = 0;
		for (int i = 0, j = 1; i < vet.length && j < vet.length - 1; i++, j++) {
			if (vet[j] > vet[i]) {
				maior = vet[j];
			}
		}
		return maior;
	}

	public void exibirMaiorNumero(int maior) {
		System.out.println("O maior numero é: " + maior);
	}

}
