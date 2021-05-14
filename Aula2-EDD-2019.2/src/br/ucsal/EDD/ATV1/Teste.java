package br.ucsal.EDD.ATV1;

import java.util.Scanner;

public class Teste {
	public static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		executar(new Vetor());
	}
	public static void executar(Ivetor vetor) {
		Vetor testador = new Vetor();
		int produtoEscalar;
		int rprodutoEscalar;
		int soma;
		int qte;
		
		System.out.print("Informe o valor para o calculo do produto escalar: ");
		produtoEscalar = scr.nextInt();
		testador.leitura();
		
		rprodutoEscalar = testador.produtoEscalar(produtoEscalar);
		System.out.println("O Resultado do produto escalar é: "+rprodutoEscalar);
		
		soma = testador.somaDosElementos();
		System.out.println("A soma dos elementos é : "+soma);
		
		qte = testador.numeroDeElementos();
		System.out.println("A quantidade de elementos do vetor é : "+qte);
		
		testador.imprime();
	}
	

}
