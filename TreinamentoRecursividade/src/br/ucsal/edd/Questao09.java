package br.ucsal.edd;

public class Questao09 {
	public static void main(String[] args) {
		int x=6;
		int y=4;
		System.out.println(mul(x,y));
	}
	public static int mul(int x, int y) {
		if(y==1) {
			return x;
		}else {
			return x + mul(x,y-1);
		}
	}
}
