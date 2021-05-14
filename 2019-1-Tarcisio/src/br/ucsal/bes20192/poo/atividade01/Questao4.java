package br.ucsal.bes20192.poo.atividade01;

import java.util.Scanner;

public class Questao4 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		char letra;
		System.out.print("Informe uma letra: ");
		letra = tec.next().charAt(0);
		switch (letra) {
		case 'a':
		case 'i':
		case 'u':
		case 'e':
		case 'o':
			System.out.println("A letra informada é uma VOGAL");
			break;
		default:
			System.out.println("A letra informada é uma CONSOANTE");
		}
	}

}
