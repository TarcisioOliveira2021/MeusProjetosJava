package br.ucsal.fundamentos.AULA01_Lista01;

import java.util.Scanner;

/*
 * Escreva um programa que receba uma linha de entrada pelo disposiƟvo de entrada
   padrão, e escreva-a na saída padrão em ordem contrária.
 */
public class EscreveInvertido {
	public static void main(String[] args) {
		EscreveInvertido invertido = new EscreveInvertido();
		invertido.Executar();
	}
	//Metodo responsavel por pegar o texto  
	private void Executar() {
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
		String texto = scr.nextLine();
		String textoInvertido = inverteString(texto);
		System.out.print("Texto invertido: "+textoInvertido);
		//Fechamento do Scanner
		scr.close();
	}
	//Metodo que recebe um String e Inverte ela.
	private String inverteString(String texto) {
		//Pega o texto separa as letras em um array.
		char[] stringNormal =texto.toCharArray();
		char[] stringInvertida = new char[texto.length()];
		
		//Duas variaveis de controle ,i e j que deslocam-se opostamente
		//i vai seguindo para frente ++ e j vai diminuindo --
		//j é responsavel por reverter o array.
		for (int i = 0,j=texto.length()-1;j>=0; i++ ,j--) {
			stringInvertida[i] = stringNormal[j];
		}
		//Recebe o texto ja invertido e o retorna.
		String novaString = new String(stringInvertida);		
		return novaString;
	}
}
