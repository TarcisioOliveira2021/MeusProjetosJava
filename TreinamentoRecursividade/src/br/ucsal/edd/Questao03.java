package br.ucsal.edd;

import java.util.Scanner;

public class Questao03 {
	private static int cont = 0;
	private static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int sucessor;
		int antecessor;
		System.out.println("Informe o antecessor: ");
		antecessor = scr.nextInt();
		System.out.println("Informe o sucessor: ");
		sucessor = scr.nextInt();
		antecessor = antecessor - 1;
		sucessor = sucessor + 1;
		somaSemSomar(antecessor, sucessor);
	}

	public static void somaSemSomar(int antecessor, int sucessor) {
		cont++;
		if (cont <= sucessor) {
			somaSemSomar(antecessor + 1, sucessor + 0);
		} else {
			System.out.println(antecessor);
		}

	}

}
