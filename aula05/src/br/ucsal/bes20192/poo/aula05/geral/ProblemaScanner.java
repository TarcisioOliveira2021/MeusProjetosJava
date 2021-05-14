package br.ucsal.bes20192.poo.aula05.geral;

import java.util.Scanner;

public class ProblemaScanner {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String nome;
		Integer anoNascimento;
		String email = "claudio@ucsal.br";

		System.out.println("Informe o nome:");
		nome = sc.nextLine();

		System.out.println("Informe o ano de nascimento:");
		anoNascimento = sc.nextInt();
		sc.nextLine();
		// anoNascimento = Integer.parseInt(sc.nextLine());

		System.out.println("Informe o email:");
		email = sc.nextLine();

		System.out.println("Nome=" + nome);
		System.out.println("AnoNascimento=" + anoNascimento);
		System.out.println("Email=" + email);

	}

}
