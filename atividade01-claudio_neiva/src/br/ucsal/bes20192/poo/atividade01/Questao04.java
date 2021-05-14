package br.ucsal.bes20192.poo.atividade01;

import java.util.Scanner;

/*
4. Crie um programa em Java para ler uma letra do alfabeto e mostrar uma mensagem: se é
vogal ou consoante.
 */
public class Questao04 {

	private static final String VOGAIS = "AEIOU";
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		obterLetraExibirTipoLetra();
	}

	private static void obterLetraExibirTipoLetra() {
		String letra;
		Boolean isVogal;

		letra = obterLetra();
		isVogal = verificarSeLetraVogal(letra);
		exibirTipoLetra(letra, isVogal);
	}

	private static void exibirTipoLetra(String letra, Boolean isVogal) {
		if (isVogal) {
			System.out.println("A letra " + letra + " é uma vogal.");
		} else {
			System.out.println("A letra " + letra + " é uma consoante.");
		}
	}

	private static Boolean verificarSeLetraVogal(String letra) {
		Boolean isVogal;
		isVogal = VOGAIS.indexOf(letra.toUpperCase()) >= 0;

		// "Teste de mesa"
		// letra = "a"
		// isVogal = VOGAIS.indexOf("a".toUpperCase()) >= 0;
		// isVogal = VOGAIS.indexOf("A") >= 0;
		// isVogal = VOGAIS.indexOf("A") >= 0;
		// isVogal = "AEIOU".indexOf("A") >= 0;
		// isVogal = 0 >= 0;
		// isVogal = true;

		return isVogal;
	}

	private static String obterLetra() {
		String letra;
		System.out.println("Informe uma letra:");
		letra = scanner.nextLine();
		return letra;
	}

}
