package br.ucsal.fundamentos.AULA01_Lista01;

import java.util.Scanner;

/*
 * Escreva um pequeno programa em Java que possua dois arrays a e b de tamanho
   10 com valores int, e calcule o produto escalar de a por b. Isto é, cria um array c de
   tamanho n em que c[i] = a[i] .b[i], para i = 0 ... n - 1 . Imprima o resultado.
 */
public class ArrayC_ArrayB_ArrayA {
	//Criacao do Scanner.
	Scanner scr = new Scanner(System.in);
	//Constante definida para o tamanho do array.
	final int TAMANHO_ARRAY = 10;
	
	//Metodo que chama o metodo que executa o programa
	public static void main(String[] args) {
		//Criacao do objeto
		ArrayC_ArrayB_ArrayA array = new ArrayC_ArrayB_ArrayA();
		array.Executar();
	}
	//Metodo que executa o programa
	private void Executar() {
		//Criacao dos 3 Array's A,B e C.
		int[] arrayA = constroiArray(TAMANHO_ARRAY);
		int[] arrayB = constroiArray(TAMANHO_ARRAY);
		int[] arrayC = produtoEscalar(arrayA,arrayB);
		//Dividir o programa em modulos onde haja um metodo 
		//para imprimir o resultado.
		imprimeArrayC(arrayC);
		//Fecha o Scanner.
		scr.close();
	}
	//Metodo que gera o array C que é a multiplicacao do array a pelo array b
	private int[] produtoEscalar(int[] arrayA, int[] arrayB) {
		//Criacao do array C.
		int[] produtoEscalar = new int[TAMANHO_ARRAY];
		for (int i = 0; i < produtoEscalar.length; i++) {
		//Na posicao i o array C recebe a multiplicacao dos valores da possicao
		// i do array A e array B.
		produtoEscalar[i] = arrayA[i] * arrayB[i];	
		}
		//Retorna o array C.
		return produtoEscalar;
	}
	//Metodo responsavel por criar o Array.
	private int[] constroiArray(int tamanho) {
		int[]valores = new int[tamanho];
		//Coloca em cada posicao o valor digitado.
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o "+i+"º valor: ");
			valores[i] = scr.nextInt();
		}
		System.out.println("***************************");
		//Retorna o array.
		return valores;
	}
	
	private void imprimeArrayC(int[] valores) {
		System.out.println("*************** ARRAY C**************");
		for (int i = 0; i < valores.length; i++) {
		System.out.println(valores[i]+" ");
		}
	}
}
