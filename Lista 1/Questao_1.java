import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 1� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */


public class Questao_1 {

	
	final int FATOR_SOMA_CONVERSAO_CELSIUS_FAHRENHEIT = 32; // Constantes para evitar n�meros m�gicos (literais) no c�digo
	final double FATOR_MULTIPLICACAO_CONVERSAO_CELSIUS_FAHRENHEIT = 1.8;
	
	public static void main(String[] args) {

		Questao_1 questao = new Questao_1();
		questao.executa();
		
	}

	/**
	 * M�todo que realiza a execucao do programa
	*/
	public void executa() {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		System.out.println("Digite o valor da temperatura em Celsius!");
		double temperaturaCelsius = entrada.nextDouble();
		
		double temperaturaFahrenheit = convertCelsiusFahrenheit(temperaturaCelsius);
		System.out.println(String.format("O valor da temperatura em Fahrenheit � %.2f", temperaturaFahrenheit));

		entrada.close(); //Fecha a entrada
		
	}
	
	/**
	 * M�todo que converte uma temperatura em Celsius para Fahrenheit
	 * @param temperaturaEmCelsius Par�metro que recebe o valor da temperatura em Celsius
	 * @return temperaturaFahrenheit Valor Fahrenheit calculado pelo m�todo
	 */
	public double convertCelsiusFahrenheit(double temperaturaEmCelsius) {
		
		double temperaturaFahrenheit = temperaturaEmCelsius * FATOR_MULTIPLICACAO_CONVERSAO_CELSIUS_FAHRENHEIT + FATOR_SOMA_CONVERSAO_CELSIUS_FAHRENHEIT;
		
		return temperaturaFahrenheit;	
	}
	
}
