package br.ucsal.fundamentos.AULA01_Lista01;

import java.util.Scanner;

public class CalculadoraIMC {
	// Estabelecer constantes para os valores de calculos que nunca vao mudar.
	final double ABAIXO_PESO = 18.5;
	final double PESO_NORMAL = 25.0;
	final double ACIMA_PESO = 30.0;

	public static void main(String[] args) {
		CalculadoraIMC calculadora = new CalculadoraIMC();
		calculadora.Executar();
	}

	private void Executar() {
		// Scanner para ler as informacoes.
		Scanner scr = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = scr.nextLine();
		System.out.print("Digite o seu peso: ");
		double peso = scr.nextDouble();
		System.out.print("Digite a sua altura: ");
		double altura = scr.nextDouble();
		scr.close();
		
		double imc = calculadoraIMC(peso, altura);
		imprimirIMC(nome, imc);
	}

	// Metodo que calcula o IMC
	private double calculadoraIMC(double peso, double altura) {
		// Aqui a altura e colocada ao quadrado pela biblioteca Math.
		double alturaQuadrado = Math.pow(altura, 2);
		double imc = peso / alturaQuadrado;
		return imc;
	}

	// Metodo que imprimi o IMC e verifica as condicoes.
	private void imprimirIMC(String nome, double imc) {
		if(imc < ABAIXO_PESO) {
			System.out.println(String.format("%s tem o imc %.2f e está abaixo do peso.", nome, imc));
		}else if(imc <= PESO_NORMAL) {
			System.out.println(String.format("%s tem o imc %.2f e está com o peso normal.", nome, imc));
		}else if(imc <= ACIMA_PESO) {
			System.out.println(String.format("%s tem o imc %.2f e está acima do peso.", nome, imc));
		}else {
			System.out.println(String.format("%s tem o imc %.2f e está obeso.", nome, imc));
		}
		
	}
}
