package br.ucsal;

import java.util.Scanner;

public class Questao08 {
	public static String aliquota;
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		String nome = "";
		float salario = 0;
		imprimirAliquota(ArrayDeNomes(nome), ArrayDeSalario(salario));
	}

	public static String[] ArrayDeNomes(String nome) {
		String[] vetor = new String[11];
		for (int i = 1; i < vetor.length; i++) {
			System.out.print("Informe o nome da " + i + "ª pessoa: ");
			nome = tec.next();
			vetor[i] = nome;
		}
		return vetor;
	}

	public static float[] ArrayDeSalario(float valor) {
		float[] vetor = new float[11];
		for (int i = 1; i < vetor.length; i++) {
			System.out.print("Informe o salario bruto da " + i + "ª pessoa: ");
			valor = tec.nextFloat();
			vetor[i] = valor;
		}
		return vetor;
	}

	public static void imprimirAliquota(String[] ArrayDeNome, float[] ArrayDeSalario) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("=======================================");
		System.out.println("           R e s u l t a d o ");
		System.out.println("");
		for (int j = 1; j < ArrayDeSalario.length; j++) {
			if (ArrayDeSalario[j] < 600) {
				aliquota = "isento";
			}
			if ((ArrayDeSalario[j] >= 600) && (ArrayDeSalario[j] < 1500)) {
				aliquota = "-10% do salario bruto";
			}
			if (ArrayDeSalario[j] >= 1500) {
				aliquota = "-15% do salario bruto";
			}
			System.out.println(ArrayDeNome[j] + " aliquota do imposto de renda: " + aliquota);
		}
	}

}
