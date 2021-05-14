package br.validar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ValidadorDeCPF {

public static void main(String[] args) {
imprimir(validadorCPF(11));
}
public static int[] validadorCPF(int x) {
	int[] n = new int[x];
	for (int i = 1; i < 11; i++) {
		System.out.print("Informe o "+ i +"º numero do seu CPF:  ");	
		Scanner tec= new Scanner (System.in);
		n[i] = tec.nextInt();
	}
	return n;
}
public static void imprimir (int[]x) {
	for (int i = 1; i < x.length; i++) {
		System.out.print(x[i]);
		if(i==3) {
			System.out.print(".");
		}else if(i==6) {
			System.out.print(".");
		}else if(i==9) {
			System.out.print("-");
		}
			
	}
}
public static int[] validadorDig(int x) {
	int[] v = new int [x];
	for (int i = 10; i > 0; i--) {
		v[i] = i;
	}
	return v;
}

}

