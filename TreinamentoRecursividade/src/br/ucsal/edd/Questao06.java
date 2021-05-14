package br.ucsal.edd;

import java.util.Scanner;

public class Questao06 {
	private static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int x;
		int y;
		System.out.println("Informe um valor X:");
		x = scr.nextInt();
		System.out.println("Informe um valor Y:");
		y = scr.nextInt();
		System.out.println("Resposta: " + div(x, y));
	}

	public static int div(int x, int y) {
		if (x > y) {
			return 1 + div(x - y, y);
		}
		if (x < y) {
			return 0;
		}
		if(x==y) {
			return 1;
		}else {
			return -1;
		}
	}
}
