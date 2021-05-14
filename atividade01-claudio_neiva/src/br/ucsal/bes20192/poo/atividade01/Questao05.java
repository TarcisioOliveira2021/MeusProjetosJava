package br.ucsal.bes20192.poo.atividade01;

import java.util.Scanner;

/*
5. Crie um programa em Java que lê um valor N, inteiro e positivo, calcula e escreve o valor de
E (soma dos inversos dos fatoriais de 0 a N):

E = 1 / 0! + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N!

E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N!
Exemplo 1
Se N = 5, então:
E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / 4! + 1 / 5!
Exemplo 2
Se N = 0, então:
E = 1
Exemplo 3
Se N = 1, então:
E = 1 + 1 / 1!

se n = 3 -> E = 1 + 1 + 0.5 + 0.1666 = 2.66
*/

public class Questao05 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		obterNumeroCalcularE();
	}

	private static void obterNumeroCalcularE() {
		Integer n;
		Double e;

		n = obterNumero();
		e = calcularE(n);
		exibirE(n, e);
	}

	private static void exibirE(Integer n, Double e) {
		System.out.println("E(" + n + ")=" + e);
	}

	private static Double calcularE(Integer n) {
		Double e = 0d;
		// se n = 3 -> e = 1 + 1 + 0.5 + 0.1666 = 2.66
		for (int i = 0; i <= n; i++) {
			e += 1d / calcularFatorial(i);
			// e = e + 1 / calcularFatorial(i);
		}
		return e;
	}

	private static Long calcularFatorial(int n) {
		Long fatorial = 1L;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
			// fatorial = fatorial * i;
		}
		return fatorial;
	}

	private static Integer obterNumero() {
		Integer n;
		System.out.println("Informe um número maior ou igual a zero:");
		n = scanner.nextInt();
		return n;
	}

}
