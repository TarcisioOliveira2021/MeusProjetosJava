package br.ucsal;

import java.util.Scanner;

public class Questao9 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		int valor;
		int RaizQ;
		System.out.println("                   Raiz Quadrada");
		System.out.print("\n" + "Informe o numero que gostaria de saber a raiz: ");
		valor = tec.nextInt();
		RaizQ = RaizQuadrada(valor);
		System.out.print("A raiz de " + valor + " é: " + RaizQ);

	}

	public static int RaizQuadrada(int valor) {
		int RaizReal = 0;
		int impares = 0;
		while (impares <= valor) {
			valor -= impares;
			impares += 2;
			RaizReal++;
		}
		return RaizReal;
	}

}
