package br.ucsal.fundamentos.AULA01_Lista01;

import java.util.Scanner;

public class Calculadora {
	//Esse atributo guarda o valor digitado.
	private double memoria = 0.0;
	//Constates para definir cada simbolo da calculadora.
	final char SOMA='+';
	final char SUBTRACAO='-';
	final char MULTIPLICACAO='*';
	final char DIVISAO='/';
	final char IGUAL='=';
	final char FIM='f';
	final char LIMPAR_MEMORIA='c';
	
	//Nao faz coisa apenas executa quem faz.
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.Executa();
	}

	private void Executa() {
		Scanner scr = new Scanner(System.in);
		
		char operador = ' ';
		
		System.out.print("Digite um valor: ");
		memoria = scr.nextDouble();
		
		//Estrutura de repeticao do menu;
		do {
			System.out.println("*********************************");
			System.out.println("Soma: +");
			System.out.println("Subtracao: -");
			System.out.println("Multiplicacao: *");
			System.out.println("Divisao: /");
			System.out.println("Igual: =");
			System.out.println("Limpar memoria: c");
			System.out.println("Sair: f");
			System.out.println("-- Limpe antes de realizar uma nova operacao. --");
			System.out.print("Informe a operacao: ");
			operador = scr.next().charAt(0);
			
			//Estrutura do menu:
			switch(operador) {
			case SOMA:
				System.out.print("Informe o operado: ");
				soma(scr.nextDouble());
				break;
			case SUBTRACAO:
				System.out.print("Informe o operado: ");
				subtrai(scr.nextDouble());
				break;
			case MULTIPLICACAO:
				System.out.print("Informe o operado: ");
				multiplica(scr.nextDouble());
				break;
			case DIVISAO:
				System.out.print("Informe o operado: ");
				divide(scr.nextDouble());
				break;
			case IGUAL:
				imprimeMemoria();
				break;
				//limpa a memoria de entrada.
			case LIMPAR_MEMORIA:
				memoria = 0.0;
				System.out.println("Digite um valor!");
				memoria = scr.nextDouble();
				break;
			}
		}while(operador != FIM);
		//Fechando o teclado pois nao vai ser mais usado.
		scr.close();
	}

	private void imprimeMemoria() {
		System.out.println();
		System.out.println("**********************");
		System.out.println("Resultado: "+memoria);
		System.out.println("**********************");
	}

	private void divide(double operando) {
		
		memoria = memoria / operando;
	}

	private void multiplica(double operando) {
		
		memoria = memoria * operando;
	}
	private void subtrai(double operando) {
		memoria = memoria - operando;
		
	}

	private void soma(double operando) {
		memoria = memoria + operando;
		
	}
}
