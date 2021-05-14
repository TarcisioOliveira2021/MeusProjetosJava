package br.ucsal;

import java.util.Scanner;

public class Questao20 {
	private static Scanner sc = new Scanner(System.in);	
	private static final int QDEELEMENTOS = 10;
	public static void main(String[] args) {
		ExibirNotas(notasDecrescente(inserirNotas()));
	}
	public static int[]inserirNotas(){
		int[]vetor = new int[QDEELEMENTOS];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Informe a nota do enem: ");
			vetor[i] = sc.nextInt();
		}	
		return vetor;
	}
	public static int[]notasDecrescente(int[]ordemDecrescente){
		int[]vetor = new int[QDEELEMENTOS];
		
			for (int i = 0; i < QDEELEMENTOS; i++) {
			    for (int j = 0; j < vetor.length; j++) {
			        if (ordemDecrescente[i] > vetor[j]) {
			            int temp = ordemDecrescente[i];
			            ordemDecrescente[i] = vetor[j];
			            vetor[j] = temp;
			        }
			    }
			}
		return vetor;
	}
	public static void ExibirNotas(int[]vetorOrdenado) {
		System.out.println();
		System.out.println();
		System.out.println("         Notas do Enem");
		System.out.println("              RANK");
		System.out.println("================================");
		for (int i = 0; i < vetorOrdenado.length; i++) {
			System.out.println("          "+i+"º Nota: "+vetorOrdenado[i]);
		}
	}
	}
	

