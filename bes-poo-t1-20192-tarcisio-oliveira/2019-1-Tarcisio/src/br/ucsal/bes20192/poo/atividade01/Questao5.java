package br.ucsal.bes20192.poo.atividade01;

import java.util.Scanner;

public class Questao5 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		int fat = 1;
		int valor;
		do {
			System.out.print("Informe um valor inteiro e positivo: ");
			valor = tec.nextInt();
		} while (valor < 0);
		for (int i = 2; i <= valor; i++) {
			fat *= i;
		}

		System.out.println("O fatorial de " + valor + " é igual a " + fat);
	}
}
