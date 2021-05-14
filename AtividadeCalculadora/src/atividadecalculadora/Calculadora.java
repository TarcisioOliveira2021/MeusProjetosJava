/*
 algoritmo "Calculadora"
var
   x,y,r: real
   operacao:caractere
inicio
      Escreval("C A L C U L A D O R A")
      Escreval("Operacoes disponiveis (Divisao - Multiplicacao - Soma - Subtracao)")
      Escreval("")
      Escreva("Digite o valor de X: ")
      Leia(x)
      Escreval("")
      Escreva("Digite o valor de Y: ")
      Leia(Y)
      Escreval("")
      Escreva("Qual Operacao deseja realizar: ")
      leia(Operacao)
      Se(Operacao = "soma")entao
        r <- x + y
        Escreval("")
        Escreval("=R E S U L T A D O=")
        Escreval("")
        Escreval("A soma é: ",r)
      FimSe
           Se(Operacao = "subtracao")entao
            r <- x - y
            Escreval("")
            Escreval("=R E S U L T A D O=")
            Escreval("")
            Escreval("A Subtracao é: ",r)
           FimSe
                Se(Operacao = "multiplicacao")entao
                 r <- x * y
                 Escreval("")
                 Escreval("=R E S U L T A D O=")
                 Escreval("")
                 Escreval("A Multiplicacao é: ",r)
                FimSe
                     Se(Operacao = "divisao")entao
                      r <- x / y
                      Escreval("")
                      Escreval("=R E S U L T A D O=")
                      Escreval("")
                      Escreval("A Divisao é: ",r)
                     FimSe
fimalgoritmo

*/
package atividadecalculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//Definindo Variaveis
		double x,y,r;
		Scanner teclado=new Scanner(System.in);
		String opera;
		
		//Comeco do programa + Definicao de valores e tipo de operacao
		System.out.println("C A L C U L A D O R A");
		System.out.println("Operacoes disponiveis (Divisao - Multiplicacao - Soma - Subtracao)");
		System.out.print("Digite o valor de X: ");
		x=teclado.nextDouble();
		System.out.print("Digite o valor de Y: ");
		y=teclado.nextDouble();
		System.out.print("Digite o tipo de operacao: ");
		opera = teclado.next();
		
		//Operacao SOMA
		if(opera.equals("soma")) {
			r = x + y;
			System.out.println("O Resultado da "+opera+" é: "+r);
		//Operacao SUBTRACAO
		}else if (opera.equals("subtraçao")) {
			r = x - y;
			System.out.println("O Resultado da "+opera+" é: "+r);
		//Operacao Multiplicacao
		}else if (opera.equals("multiplicacao")) {
			r = x * y;
			System.out.println("O Resultado da "+opera+" é: "+r);
		//Operacao Divisao
		}else if (opera.equals("divisao")) {
			r = x/y;
			System.out.println("O Resultado da "+opera+" é: "+r);
			
		teclado.close();//fechando o metodo Scanner
		}
				
	}
	
}
