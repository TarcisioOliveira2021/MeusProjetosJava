package br.ucsal;

import java.util.Scanner;

public class Questao6 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		System.out.println("               Espelho ");
		InversorDeNome();
	}

	public static void InversorDeNome() {
		String nome = "", texto = "";
		System.out.println("\n" + "        Informe uma palavra ");
		nome = tec.next();
		System.out.println("\n" + "               Direito");
		System.out.println("        " + nome);
		int tam = nome.length();
		for (int i = 0; i < tam; i++) {
			texto += nome.substring(tam - (i + 1), tam - i);
		}
		System.out.println("              Invertido");
		System.out.print("        " + texto);
	}

}
