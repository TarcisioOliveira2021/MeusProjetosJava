package br.ucsal.bes20192.poo.atividade04.tui;

import java.util.Scanner;

public class UtilTUI {

	private static Scanner sc = new Scanner(System.in);

	public static String obterTexto(String mensagem) {
		System.out.println(mensagem);
		return sc.nextLine();
	}

	public static Integer obterNumero(String mensagem) {
		Integer numero;
		System.out.println(mensagem);
		//anoNascimento = Integer.parseInt(sc.nextLine());
		numero = sc.nextInt();
		sc.nextLine();
		return numero;
	}

}
