package br.ucsal;

public class Questao02 {

	public static void main(String[] args) {
		int  i = 40,m=0,mul=1,som=0;
		while(i!=0){
				if(i%2==1){
					System.out.print(" "+i);
					
					if(i>29){
						mul *= i;
						som += i;
					}
				}
				i--;

				
		}
		System.out.println();
		System.out.println();
		System.out.println("O resultado da multiplicacao dos 5 primeiros é: "+mul);
		System.out.println("O resultado da soma dos 5 primeiros é: "+som);
		
	}

}
