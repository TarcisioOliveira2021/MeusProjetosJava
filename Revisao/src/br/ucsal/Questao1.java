package br.ucsal;

import java.util.Scanner;

public class Questao1 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		System.out.println("           C O N V E R S O R");
		System.out.print("\n" + "Digite um valor em celsius: ");
		imprimir();
	}

	public static double Conversor(double c) {
		double f;
		f = (c * 1.8) + 32;
		return f;
	}

	public static void imprimir() {
		double c = tec.nextDouble();
		;
		System.out.println("O valor em Fahrenheit é : " + (int) Conversor(c));
	}
}
