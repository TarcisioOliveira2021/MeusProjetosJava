package br.ucsal;

public class Questao04 {

	public static void main(String[] args) {
		int c=0,a1=0,a2=1,aux=0,soma3=0;
		String seq3 = "";
		do{
			System.out.print(" "+a1);
			
			if(a1%3==0 && a1  != 0){
				seq3 += a1 + " ";
				soma3 +=a1;
			}
			
			aux = a2 + a1;
			a1 = a2;
			a2 = aux;
			c++;

		}while(c<20);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("A soma dos valores divisiveis por 3 é: " +soma3);
		System.out.println("A sequencia dos valores divisiveis por 3 é: "+seq3);
	}

}
