/*
algoritmo "TrianguloEscolha"
var
   L1,L2,L3: real
   EQ,ES,IS: logico
   Ang1,Ang2,Ang3: inteiro
inicio
      Escreval("==========================================")
      Escreval(" Triangulo classificacao quanto aos lados ")
      Escreval("==========================================")
      //imputs
      Escreval("Digite o valor do primeiro lado:  ")
      Leia(L1)
      Escreval("Digite o valor do segundo lado:  ")
      Leia(L2)
      Escreval("Digite o valor do terceiro lado: ")
      Leia(L3)
      //estrutura condicional (Se/entao) + outputs
      Se(L1 = L2) e (L2 = L3) entao
            Escreval("")
            Escreval("O triangulo é EQUILATERO")
      FimSe
      Se(L1<>L2) e (L2<>L3) e (L1<>L3)entao
            Escreval("")
            Escreval("O triangulo é ESCALENDO")
      FimSe
      Se(L1 = L2) e (L2 = L1) e (L2 <> L3)entao
            Escreval("")
            Escreval("O triangulo é ISOCELES")
      FimSe
      //Triangulo classificacao angulos
      Escreval("")
      Escreval("=======================================================")
      Escreval("        Triangulo Classificacao quanto aos Angulo       ")
      Escreval("=======================================================")
      Escreval("1.Valor do Primeiro Angulo: ")
      Leia(Ang1)
      Escreval("2.Valor do Segundo Angulo:  ")
      Leia(Ang2)
      Escreval("3.Valor do Terceiro Angulo: ")
      Leia(Ang3)
      Se( Ang1 = 90)xou(Ang2 = 90)xou(Ang3 =90)e(Ang1 <>180)e(Ang2 <>180)e(Ang3 <>180)entao
          Escreval("")
          Escreval("Esse triangulo é: RETANGULO")
      FimSe
      Se(Ang1<90) e (Ang2<90) e (Ang3<90)entao
          Escreval("")
          Escreval("Esse triangulo é: ACUTANGULO")
      FimSe
      Se( Ang1 > 90)xou(Ang2 > 90)xou(Ang3 > 90)e(Ang1 <>90)e(Ang2 <>90)e(Ang3 <>90)entao
          Escreval("")
          Escreval("Esse triangulo é: OBTUSANGULO")
      FimSe
      
fimalgoritmo

*/
package atividadetriangulos;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		/*declaracao de variaveis*/
		double L1,L2,L3;
		int Ang1,Ang2,Ang3;
		Scanner teclado =new Scanner(System.in);
		
		/* imputs para Lados*/
		System.out.println("Classificaçao dos triangulos quanto o Lado");
		System.out.println("1.Qual o valor do primeiro lado: ");
		L1 =teclado.nextDouble();
		System.out.println("2.Qual o valor do segundo lado: ");
		L2 =teclado.nextDouble();
		System.out.println("3.Qual o valor do terceiro lado: ");
		L3 =teclado.nextDouble();
		/*outputs*/
		if((L1==L2)&&(L2==L3)){
			System.out.println("");
			System.out.println("Esse triangulo é: EQUILATERO");
		}else if((L1!=L2)&&(L2!=L3)&&(L1!=L3)) {
			System.out.println("");
			System.out.println("Esse triangulo é: ESCALENDO");
		}if((L1==L2)&&(L2==L1)&&(L1!=L3)) {
			System.out.println("");
			System.out.println("Esse triangulo é: ISOCELES");
		}
		
		
		/*Imputs para Angulos*/
		System.out.println("");
		System.out.println("Classificacao quanto ao angulo");
		System.out.println("Digite o valor do Primeiro Angulo : ");
		Ang1 =teclado.nextInt();
		System.out.println("Digite o valor do Segundo Angulo : ");
		Ang2 =teclado.nextInt();
		System.out.println("Digite o valor do Terceiro Angulo: ");
		Ang3=teclado.nextInt();
		/*Outputs*/
		if((Ang1==90)^(Ang2==90)^(Ang3==90)&&(Ang1!=180)&&(Ang2!=180)&&(Ang3!=180)) { //pode apresentar erro
			System.out.println("Esse triangulo é: RETANGULO");
			
		}else if((Ang1<90)&&(Ang2<90)&&(Ang3<90)) {
			System.out.println("Esse triangulo é: ACUTANGULO");
		}if((Ang1>90)^(Ang2>90)^(Ang3>90)&&(Ang1!=90)&&(Ang2!=90)&&(Ang3!=90)){		//pode apresentar erro
			System.out.println("Esse triangulo é: OBTUSANGULO");
		}
		
		teclado.close();
	}

}
