package br.ucsal.edd;

import java.util.Scanner;

public class Questao02 {
	private static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		Integer valor;
		System.out.println("Informe um valor: ");
		valor = scr.nextInt();
		binario(valor);
	}
	public static void binario(Integer valor) {
		if(valor>0) {
			binario(valor/2);
			System.out.print("Resultado: "+ valor % 2);
		}
	}

}
