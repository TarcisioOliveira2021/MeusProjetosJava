package br.ucsal.bes20192.poo.atividade01;

import java.util.Scanner;

public class Questao2 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		int valor1, valor2;
		System.out.print("Digite um numero inteiro: ");
		valor1 = tec.nextInt();
		System.out.print("Digite segundo numero inteiro: ");
		valor2 = tec.nextInt();
		System.out.println("== R E S U L T A D O ==");
		System.out.print("A soma é :" + Soma(valor1, valor2));
	}

	public static int Soma(int valor1, int valor2) {
		int resp;
		resp = valor1 + valor2;
		return resp;
	}

}
