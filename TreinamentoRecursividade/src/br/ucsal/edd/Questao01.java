package br.ucsal.edd;

import java.util.Scanner;

public class Questao01 {
	private static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
	int valor;
	int base;
	System.out.print("Informe um valor para a base: ");
	base = scr.nextInt();
	System.out.print("Informe um valor para o expoente: ");
	valor = scr.nextInt();
	System.out.println("Resultado: "+exponencialRecu(valor,base));
	}
	public static long exponencialRecu(int valor, int base) {
		if(valor==0) {
			return 1;
		}else {
			return  base * exponencialRecu(valor-1,base);
		} 

}
}
