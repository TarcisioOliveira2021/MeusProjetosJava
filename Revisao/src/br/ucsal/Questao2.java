package br.ucsal;

import java.util.Scanner;

public class Questao2 {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		String nome = " ";
		System.out.println(" C A L C U L A D O R A ");
		System.out.println("\n" + "     Bem vindo !");
		nome = NomeDaPessoa(nome);
		System.out.println("");
		System.out.println("========================");
		System.out.println("\n" + "       Olá," + nome);
		imprimir();
	}

	public static String NomeDaPessoa(String nome) {
		System.out.print("\n" + "Digite o seu nome: ");
		nome = tec.next();
		return nome;
	}

	public static double PesoDaPessoa(double peso) {
		System.out.print("\n" + "Digite aqui o seu PESO : ");
		peso = tec.nextDouble();
		return peso;
	}

	public static double AlturaDaPessoa(double altura) {
		double alturaAoQuadrado;
		System.out.print("\n" + "Digite aqui a sua ALTURA : ");
		altura = tec.nextDouble();
		alturaAoQuadrado = altura * altura;
		return alturaAoQuadrado;
	}

	public static double IMC(double IMC) {
		double altura = 0, peso = 0;
		IMC = PesoDaPessoa(peso) / (AlturaDaPessoa(altura));
		return IMC;
	}

	public static void imprimir() {
		double imc = 0;
		imc = IMC(imc);
		System.out.printf("\n" + "Seu IMC é: " + "%.1f", imc);
		if (imc < 18.5) {
			System.out.println("\n" + "você está ABAIXO do peso.");
		} else if ((imc > 18.5) && (imc < 25)) {
			System.out.println("\n" + "você está no peso NORMAL.");
		} else if ((imc > 25) && (imc < 30)) {
			System.out.println("\n" + "você está ACIMA do peso.");
		} else {
			System.out.println("\n" + "você está OBESO.");
		}
	}

}
