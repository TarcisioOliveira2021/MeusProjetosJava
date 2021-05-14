package br.ucsal.edd;

public class Questao08 {
	public static void main(String[] args) {
		int n=10;
		System.out.println("Resp : "+soma(n));
	}

	public static int soma(int n) {
		if(n==0) {
			return 0;
		}else {
			return n + soma(n - 1);
		}
	}
}
