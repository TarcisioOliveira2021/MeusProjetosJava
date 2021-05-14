package br.ucsal.edu.TUI;

import java.util.Scanner;

public class UtilTUI {
	public static Scanner sc = new Scanner(System.in);

	public static Integer inteiro(String mensagem) {
		System.out.println(mensagem);
		Integer inteiro = sc.nextInt();
		return inteiro;
	}
	
	public static Double valorDouble(String mensagem) {
		System.out.println(mensagem);
		Double valorDouble = sc.nextDouble();
		return valorDouble;
	}

}
