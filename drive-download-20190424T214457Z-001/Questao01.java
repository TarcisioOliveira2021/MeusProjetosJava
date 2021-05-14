package br.ucsal;


public class Questao01 {

	public static void main(String[] args) {
		int c=0 ,a1=1 , a2=2,aux=0,a7=0,an=0,ma=0,soma=0,soma4=0;
		//	System.out.print(" "+a1);
		//	System.out.print(" "+a2);
		while(c<9){
			System.out.print(" "+a1);
			aux = a1 * a2;
			a1 = a2;
			a2 = aux;
			c++;
			soma += a1;
		if(a1%4==0){
			soma4 += a1;
		}
		if(c==6){
			a7 = a1;
		}
		if(c==8)
			an = a1; 
		}
		ma = (a7 + an)/2;
		soma = soma +1;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("A media aritimetica obtida pelo 7 termo e o ultimo é: "+ma);
		System.out.println("A soma de todos os numeros da sequencia é: "+soma);
		System.out.println("A soma de todos os numeros pares da sequencia é: "+soma4);
		
		
	}

}
