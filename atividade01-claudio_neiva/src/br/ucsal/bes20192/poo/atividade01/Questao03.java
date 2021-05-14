package br.ucsal.bes20192.poo.atividade01;

import java.util.Scanner;

/*
Suponha que o conceito de um aluno seja determinado em função da sua nota. Suponha,
também, que esta nota seja um valor inteiro na faixa de 0 a 100, conforme a seguinte faixa:

Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 a 100 Ótimo

Crie um programa em Java que leia a nota de um aluno e apresente o conceito do mesmo. 
*/

public class Questao03 {

	private static Scanner scanner = new Scanner(System.in);
	
	private static final String CONCEITO_OTIMO = "Ótimo";
	private static final String CONCEITO_BOM = "Bom";
	private static final String CONCEITO_REGULAR = "Regular";
	private static final String CONCEITO_INSUFICIENTE = "Insuficiente";

	public static void main(String[] args) {
		obterNotaExibirConceito();
	}

	private static void obterNotaExibirConceito() {
		Integer n;
		String conceito;

		n = obterNumero();
		conceito = calcularConceito(n);
		exibirConceito(conceito);
	}

	private static void exibirConceito(String conceito) {
		if (conceito != null) {
			System.out.println("Seu conceito é " + conceito);
		} else {
			System.out.println("Valor inválido, não foi possível definir o conceito do aluno.");
		}
	}

	private static String calcularConceito(Integer n) {
		String conceito = null;
		if (n >= 0 && n <= 49) {
			conceito = CONCEITO_INSUFICIENTE;
		} else if (n >= 50 && n <= 64) {
			conceito = CONCEITO_REGULAR;
		} else if (n >= 65 && n <= 84) {
			conceito = CONCEITO_BOM;
		} else if (n >= 85 && n <= 100) {
			conceito = CONCEITO_OTIMO;
		}
		return conceito;
	}

	private static Integer obterNumero() {
		Integer n;
		System.out.println("Informe um número (0 a 100, intervalo fechado):");
		n = scanner.nextInt();
		return n;
	}

}
