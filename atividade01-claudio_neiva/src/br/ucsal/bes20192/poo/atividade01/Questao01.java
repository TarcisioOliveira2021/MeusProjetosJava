package br.ucsal.bes20192.poo.atividade01;

import java.util.Scanner;

/*
  1. Crie um programa em Java que:
    a) Leia o nome;
    b) Leia o sobrenome;
    c) Concatene o nome com o sobrenome;
    d) Apresente o nome completo.
 */
public class Questao01 {

	public static void main(String[] args) {

		// Declarao de variveis
		Scanner scanner = new Scanner(System.in);
		String nome;
		String sobrenome;
		String nomeCompleto;

		// Entrada
		System.out.println("Informe seu nome:");
		nome = scanner.nextLine();
		System.out.println("Informe seu sobrenome:");
		sobrenome = scanner.nextLine();

		// Processamento
		nomeCompleto = nome + " " + sobrenome;

		// Sada
		System.out.println("Nome completo=" + nomeCompleto);
	}

}
