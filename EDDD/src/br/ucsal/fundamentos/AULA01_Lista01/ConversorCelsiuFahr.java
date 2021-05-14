package br.ucsal.fundamentos.AULA01_Lista01;

import java.util.Scanner;

public class ConversorCelsiuFahr {
	
		//Uso de constantes para definir o valor sem alteracoes 
		//Ajudando no reuso do codigo.
		//Constante tem o nome todo em MAIUSCULO.
		final int SOMA_CONVERSAO_CELSIUS_FAHRENHEIT = 32;
		final double MULTIPLICACAO_CONVERSAO_CELSIUS_FAHRENHEIT = 1.8;
		
		//O metodo main apenas faz a chamada do metodo que vai executar.
		//Os metodos comecam com letras MAI&USCULAS.
		public static void main(String[] args) {
			ConversorCelsiuFahr convert = new ConversorCelsiuFahr();
			convert.Executar();
		}
		
		//Atentar-se ao Static se 1 tiver todos necessitam ter.
		private void Executar() {
			//O Scanner Aqui esta com a vizibilidade Default.
			Scanner scr = new Scanner(System.in);
			System.out.println("Digite o valor da temperatura em Celsius que deseja converter: ");
			double temperaturaCelsius = scr.nextDouble();
			//Fecha o scanner para desativar o warnnig.
			scr.close();
			double temperaturaFahrenheit = covercaoCelsiusFahrenheit(temperaturaCelsius);
			//Formata o valor para: 43,2 , 23,2 ou 13,2.
			//O: %.(n)f == Formata as casas onde n é o numero de casas.
			System.out.println(String.format("O valor da temperatura em Fahrenheit é %.1f", temperaturaFahrenheit));
			
			
		}
		//Metodo conversor.
		public double covercaoCelsiusFahrenheit(double temperaturaCelsius) {
			double temperaturaFahrenheit;
			temperaturaFahrenheit = temperaturaCelsius * MULTIPLICACAO_CONVERSAO_CELSIUS_FAHRENHEIT + SOMA_CONVERSAO_CELSIUS_FAHRENHEIT; 
			return temperaturaFahrenheit;
		}
}
