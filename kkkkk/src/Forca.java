package br.renato.lista02.questao04.forca;

import java.util.Random;
import java.util.Scanner;

public class Forca {

	public static void main(String[] args) {
		String palavra;
		palavra = sortearPalavra();
		String letras[] = new String[palavra.length()];
		for (int i = 0; i < letras.length; i++) {
			letras[i] = "_ ";
		}
		

		int tentativas = 8;
		while (tentativas>0) {
			exibirForca(letras);
			System.out.println("Tentativas restantes:"+tentativas);
			String letra = informarLetra();
			System.out.println();
			verificarCondicaoVitoria(letras);
			if(!verificarLetraInformada(letras, palavra, letra)) {
				tentativas--;
			}
			if(tentativas==0) {
				System.out.println("Perdeu");
				System.out.println("A palavra era '"+palavra.toUpperCase()+"'");
			}
			if(verificarCondicaoVitoria(letras)) {
				exibirForca(letras);
				System.out.println("Ganhou!!!");
				tentativas = 0;
			}
			
		}
		
	}
	
	public static String sortearPalavra() {
		String palavras [] = {"carro", "bicicleta", "moto", "aviao", "barco"};
		Random rd = new Random();
		return palavras[rd.nextInt(palavras.length)];
	}

	public static String[] dividirLetras(String palavra) {
		String letras[] = new String[palavra.length()];
		for (int i = 0; i < letras.length; i++) {
			letras[i] = palavra.substring(i, i+1);
		}
		return letras;
	}

	public static String informarLetra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma letra:");
		return sc.nextLine();
	}
	
	public static void exibirForca(String[] letras) {
		for (int i = 0; i < letras.length; i++) {
			System.out.print(letras[i]);
		}
		System.out.println();
	}

	public static boolean verificarLetraInformada(String[] letras, String palavra, String letra) {
		boolean acerto = false;
		for (int i = 0; i < letras.length; i++) {
			if(palavra.substring(i, i+1).equals(letra)) {
				letras[i] = letra;
				acerto = true;
			}
		}
		
		return acerto;
	}

	public static boolean verificarCondicaoVitoria(String[] letras) {
		for (int i = 0; i < letras.length; i++) {
			if("_ ".equals(letras[i])){
				return false;
			}
		}
		return true;
	}
}
