package br.ucsal.bes20192.poo.atividade01;

import java.util.Scanner;

public class Questao3 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		int nota;
		System.out.println("            Bem vindo aluno ");
		System.out.println("          ===================");
		do {
			System.out.print("\n" + "Insira sua nota aqui: ");
			nota = tec.nextInt();
		} while ((nota < 0) && (nota > 100));
		if ((nota >= 0) && (nota <= 49)) {
			System.out.println("\n" + "O seu conceito é: INSUFICIENTE");
		} else if ((nota >= 50) && (nota <= 64)) {
			System.out.println("\n" + "O seu conceito é: REGULAR");
		} else if ((nota >= 65) && (nota <= 84)) {
			System.out.println("\n" + "O seu conceito é: BOM");
		} else {
			System.out.println("\n" + "O seu conceito é: ÓTIMO");
		}
	}
}
