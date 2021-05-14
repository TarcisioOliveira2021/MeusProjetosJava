package br.ucsal.bes20192.poo.aula16.tui;

import java.util.Scanner;

public class UtilTUI {

	private static Scanner sc = new Scanner(System.in);

	public static Integer obterInteiro(String mensagem) {
		Integer inteiro;
		System.out.println(mensagem);
		inteiro = sc.nextInt();
		sc.nextLine();
		return inteiro;
	}

	public static String obterTexto(String mensagem) {
		System.out.println(mensagem);
		return sc.nextLine();
	}

}
