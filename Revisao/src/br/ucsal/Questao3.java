package br.ucsal;

import java.util.Scanner;

public class Questao3 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		System.out.println("              C A L C U L A D O R A");
		System.out.println("                     Regra");
		System.out.println("        Informe valores de 0 a 999999999");
		System.out.println("   Informe as informacoes no seguinte formato:");
		System.out.println("          valor1 / operacao / valor2 / = ");
		System.out.println("===================================================");
		Imprimir();
	}

	public static void Imprimir() {
		double valor1, valor2, resp = 0;
		String operacao = "";
		System.out.print(": ");
		valor1 = tec.nextDouble();
		VerificadorDeNumero(Verificador(valor1));
		System.out.print(": ");
		operacao = tec.next();
		System.out.print(": ");
		valor2 = tec.nextDouble();
		VerificadorDeNumero(Verificador(valor2));
		if (operacao.equals("+")) {
			resp = Soma(valor1, valor2);
			System.out.print(": ");
			ApertaIgualdade(tec.next());
			System.out.println(" " + resp);
		} else if (operacao.equals("-")) {
			resp = Subtracao(valor1, valor2);
			System.out.print(": ");
			ApertaIgualdade(tec.next());
			System.out.println(" " + resp);
		} else if (operacao.equals("X") || (operacao.equals("x"))) {
			resp = Multiplicacao(valor1, valor2);
			System.out.print(": ");
			ApertaIgualdade(tec.next());
			System.out.println(" " + resp);
		} else if (operacao.equals("/")) {
			resp = Divisao(valor1, valor2);
			System.out.print(": ");
			ApertaIgualdade(tec.next());
			System.out.println(" " + resp);
		} else {
			System.exit(0);
		}
	}

	public static double Soma(double v1, double v2) {
		return v1 + v2;
	}

	public static double Subtracao(double v1, double v2) {
		return v1 - v2;
	}

	public static double Multiplicacao(double v1, double v2) {
		return v1 * v2;
	}

	public static double Divisao(double v1, double v2) {
		return v1 / v2;
	}

	public static boolean Verificador(double valor) {
		boolean logico;
		if ((valor >= 0) && (valor <= 999999999)) {
			logico = true;
		} else {
			logico = false;
		}
		return logico;
	}

	public static boolean VerificadorDeNumero(boolean decisao) {
		if (decisao == false) {
			System.out.println("         ERRO");
			System.out.println("    Numero invalido");
			System.exit(0);
		}
		return decisao;
	}

	public static boolean ApertaIgualdade(String I) {
		boolean ok;
		if (I.equals("=")) {
			ok = true;
		} else {
			ok = false;
			System.exit(0);
		}
		return ok;
	}
}
