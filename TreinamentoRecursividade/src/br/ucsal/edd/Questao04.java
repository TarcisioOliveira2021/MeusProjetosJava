package br.ucsal.edd;

import java.util.Scanner;

public class Questao04 {
	private static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		int x;
		int y;
		System.out.println("Informe o valor de X: ");
		x = scr.nextInt();
		System.out.println("Informe o valor de Y: ");
		y = scr.nextInt();
		mdcDeXeY(x,y);
	}
	public static void mdcDeXeY(int x,int y) {
		if(x>y) {
			mdcDeXeY(x-y,y);
		}else if(y>x){
			mdcDeXeY(y-x,x);
		}else {
			System.out.println("Resposta: "+y);
		}
	}
}
