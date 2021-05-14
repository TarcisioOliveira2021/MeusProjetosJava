package br.ucsal.edd;

import java.util.Scanner;

public class Questao07 {
	private static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 10;
		System.out.println("Resposta: " + fib(n) + " ");
	}

	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		if (n > 2) {
			return fib(n - 1) + fib(n - 2);
		} else {
			return -1;
		}
	}

}
