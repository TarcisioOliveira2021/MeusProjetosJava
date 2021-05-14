package br.ucsal.bes20192.poo.atividade01;

import java.util.Scanner;

public class Questao1 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		String nome = "";
		String sobrenome ="";
		System.out.print("Digite seu nome: ");
		nome.substring(0, nome.length());
		System.out.print("Digite o seu sobrenome: ");
		sobrenome.substring(0, sobrenome.length());
		System.out.println(
				"O seu nome é: " + nome.substring(0, nome.length()) + " " + sobrenome.substring(0, sobrenome.length()));
	}

}
