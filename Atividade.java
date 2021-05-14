package br.ucsal;

public class Atividade {
	public static void main(String[] args) {
		inicio();
	}
	public static void inicio(){
		double med;
		imprimirUni(ArrayUni(9));
		med = ObterMedia(0);
		System.out.print("\nA media é: "+med);
		System.out.println("\n");
		imprimirBi(ArrayBi(7,6));
	}
	public static void imprimirBi(int[][] ArrayBi){
		double med;
		med = ObterMedia(0);
		for (int l = 0; l < ArrayBi.length; l++) {
			for (int c = 0; c < ArrayBi[l].length; c++) {
				System.out.print(ArrayBi[l][c] + ")" +med);
			}
			System.out.println();
		}
		
		
	}
	public static void imprimirUni(int[] ArrayUni ){
		for (int i = 0; i < ArrayUni.length; i++) {
			System.out.print(ArrayUni[i]+" ");
		}
	}
	public static int[] ArrayUni(int x ){
		int[] vetor = new int[x];
		for (int i = 0, a1=2; i < vetor.length;) {
			if(a1%2==0){ 
				vetor[i] = a1;
				i++;
			}
			a1++;
		}
		return vetor;
	}
	public static double ObterMedia ( double soma){
		int x= 9,a1=2;
		for (int i = 0; i < x;) {
			if(a1%2==0){ 
				i++;
				soma += a1;
			}
			a1++;
		}
		return soma/9.0;
	}
	public static int[][] ArrayBi(int l ,int c){
		double med;
		med = ObterMedia(0);
		int[][] vetor = new int[l][c];
		for (int y = 0; l < vetor.length; l++) {
			for (int x = 0; c < vetor[l].length; c++) {
				 vetor[l][c] = (int)med;
				 med += med; 
			}
		}
		return vetor;
	}
	}
	
