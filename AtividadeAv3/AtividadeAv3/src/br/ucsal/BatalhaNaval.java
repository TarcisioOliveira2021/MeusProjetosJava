package br.ucsal;

import java.util.Scanner;

public class BatalhaNaval {
static Scanner tec = new Scanner (System.in);
	public static void main(String[] args) {
		inicio();
	}
	public static void inicio() {
		System.out.println("  == Bem Vindo ao Batalha Naval == ");
		System.out.println("        Jogo em Producao ");
		Continuar();
	}
	public static void Continuar() {
		int resp = 0;
		System.out.println();
		System.out.println("        Deseja continuar ?");
		System.out.println("         1- sim | 2- nao");
		resp = tec.nextInt();
		if(resp==1) {
			inicio();
		}else {
			Projeto.inicio();
		}
	}

}
