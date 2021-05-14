package br.ucsal.fundamentos.AULA01_Lista01;

import java.util.Scanner;

/*
 * Escreva um programa que detecte em um array de 10 valores int se existe um par
   de números no array cujo produto seja par.
 */
public class ArrayPar {
	// Constante que define o tamanho fixo do array.
	final int TAMANHO_ARRAY = 10;
	
	public static void main(String[] args) {
		ArrayPar array = new ArrayPar();
		array.Executar();
	}
	
	//Metodo que executa o programa.
	private void Executar() {
		andarPeloArray(constroiArray(TAMANHO_ARRAY));
	}

	
	//Metodo que constri o array.
	public int[] constroiArray(int tamanho) {
		Scanner scr = new Scanner(System.in);
		// Criando array
		int[] valores = new int[tamanho];
		for (int i = 0; i < valores.length; i++) {
			System.out.println(String.format("Qual o %d º valor?", i + 1));
			// Armazena no array os valores digitados.
			valores[i] = scr.nextInt();
		}
		scr.close();
		return valores;
	}

	// Esse metodo percorre o array valores e calculo o produtos.
	private void andarPeloArray(int[] valores) {
		int produto = 0;
		boolean ePar = false;

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores.length; j++) {
				if (i != j) {
					produto = multiplicaValores(valores[i], valores[j]);
					ePar = ePar(produto);
					if (ePar) {
						imprimeResultado(produto, valores[i], valores[j]);
					}
				}
			}
			System.out.println("**************************");
		}

	}
	
	//imprime o resultado onde o produto = valor do produto(operando1 * operando2)
	//valor1 = primeiro valor.
	//valor2 = segundo valor.
	private void imprimeResultado(int produto, int valor1, int valor2) {
		System.out.println(String.format("O valor %d, produto de %d por %d é par!", produto, valor1, valor2));

	}
	//Multiplica o valor1 pelo valor2.
	private int multiplicaValores(int operando1, int operando2) {
		int produto = operando1 * operando2;
		return produto;
	}
	//Metodo que verifica se o valor é par.
	public boolean ePar(int valor) {
		boolean ePar = false;
		if (valor % 2 == 0) {
			ePar = true;
		}
		return ePar;
	}

}
