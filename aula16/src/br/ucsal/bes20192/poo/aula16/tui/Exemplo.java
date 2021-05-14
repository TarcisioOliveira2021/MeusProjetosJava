package br.ucsal.bes20192.poo.aula16.tui;

import java.util.Scanner;

public class Exemplo {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		obterNotas();
//		try {
//			obterNotas();
//		} catch (Throwable e) {
//			// Escrever no log da aplicação o problema logger.e(e);
//			// Estudar Log4J.
//			System.out.println("Erro 378345478954, favor informar ao suporte técnico.");
//		}
	}

	private static void obterNotas() {
		Integer notas[] = new Integer[3];
		System.out.println("Informe 3 notas:");
		// for (int i = 0; i < 3; i++) {
		for (int i = 1; i <= 3; i++) {
			notas[i] = sc.nextInt();
		}
	}

}
