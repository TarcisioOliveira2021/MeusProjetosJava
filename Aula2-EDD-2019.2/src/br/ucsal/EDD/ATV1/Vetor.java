package br.ucsal.EDD.ATV1;

import java.util.Scanner;

public class Vetor implements Ivetor {
	Scanner scr = new Scanner(System.in);
	int[]vetor = new int[5];
	int qte;
	@Override
	public int produtoEscalar(int valor) {
		int produtoEscalar=0;
		for (int i = 0; i < qte; i++) {
			produtoEscalar += vetor[i] * valor;
		}
		return produtoEscalar;
	}

	@Override
	public int somaDosElementos() {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}

	@Override
	public int numeroDeElementos() {
		return qte;
	}

	@Override
	public void leitura() {
		boolean continuar=true;
		int cont = 0;
		do {
			System.out.print("Informe um valor: ");
			vetor[cont] = scr.nextInt();
			System.out.print("Deseja continuar ?: ");
			continuar = scr.nextBoolean();
			qte ++;
			cont ++;
		}while(continuar);	
	}

	@Override
	public void imprime() {
		System.out.println();
		for (int i = 0; i < qte; i++) {
			System.out.println("Na posicao: "+ i+" existe o valor: "+vetor[i]);
		}
		
	}

}
