package br.ucsal;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		int a,b,c,ma=0,peso1=2,peso2=3,peso3=5,mp=0;
		Scanner teclado = new Scanner(System.in);
		do{
		System.out.print("1-Digite o primeiro numero: ");
		a = teclado.nextInt();
		System.out.print("2-Digite o segundo numero: ");
		b = teclado.nextInt();
		System.out.print("3-Digite o terceiro numero: ");
		c = teclado.nextInt();
		if (a<10 ^ a>500){
			System.out.println("O A valor esta incorreto, execute novamente");	
		}
		if (b<10 ^ b>500){
			System.out.println("O B valor esta incorreto, execute novamente");	
		}
		if (c<10 ^ c>500){
			System.out.println("O C valor esta incorreto, execute novamente");	
		}
		ma = (a + b + c)/3;
		mp = (a * peso1  + b* peso2 + c* peso3)/peso1+peso2+peso3;
		
	}while((a>=10 ^ a<=500)&&(b>=10 ^ b<=500)||(c>=10 ^ c<=500));
			System.out.println(" ");
			System.out.println("A media aritimetica dos e valores é " +ma);
			System.out.println("A media ponderada dos e valores é " +mp);
			teclado.close();
		}
}
