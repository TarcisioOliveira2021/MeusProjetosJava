package br.ucsal.fundamentos.AULA01_Lista01;

import java.util.Scanner;

public class CalculoDemografico {
	public static void main(String[] args) {
		//Instanciamento de um objeto.
		CalculoDemografico calculo = new CalculoDemografico();
		calculo.Executar();
	}
	//Metodo principal.
	private void Executar() {
		Scanner scr = new Scanner(System.in); 
		System.out.print("Digite a população inicial?");
		double populacao = scr.nextDouble();
		System.out.print("Qual a taxa de crescimento em percentual ?");
		double taxaDeCrescimentoAnual = scr.nextDouble();
		//Realiza o calculo simulando 5 anos.
		for(int ano=1; ano<=5; ano++) {
			populacao = calculaCrescimentoDemografico(populacao, taxaDeCrescimentoAnual);
			imprimePopulacao(populacao, ano);		
		}
		//Fechamento do Scanner.
		scr.close();		
	}
	//Calculo do crescimento demografico.
	private double calculaCrescimentoDemografico(double populacao, double taxaDeCrescimentoAnual) {
		double fatorDeCrescimento =  1 + (taxaDeCrescimentoAnual/100);
		double populacaoFinal = populacao * fatorDeCrescimento;
		return populacaoFinal;
	}
	//Metodo de impressao da populaao estimada.
	private void imprimePopulacao(double populacao, int ano) {
		System.out.println(String.format("A população estimada no ano %d é %.2f", ano, populacao));
	}
	
}
