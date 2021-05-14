import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 1ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */


public class Questao_1 {

	
	final int FATOR_SOMA_CONVERSAO_CELSIUS_FAHRENHEIT = 32; // Constantes para evitar números mágicos (literais) no código
	final double FATOR_MULTIPLICACAO_CONVERSAO_CELSIUS_FAHRENHEIT = 1.8;
	
	public static void main(String[] args) {

		Questao_1 questao = new Questao_1();
		questao.executa();
		
	}

	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		System.out.println("Digite o valor da temperatura em Celsius!");
		double temperaturaCelsius = entrada.nextDouble();
		
		double temperaturaFahrenheit = convertCelsiusFahrenheit(temperaturaCelsius);
		System.out.println(String.format("O valor da temperatura em Fahrenheit é %.2f", temperaturaFahrenheit));

		entrada.close(); //Fecha a entrada
		
	}
	
	/**
	 * Método que converte uma temperatura em Celsius para Fahrenheit
	 * @param temperaturaEmCelsius Parâmetro que recebe o valor da temperatura em Celsius
	 * @return temperaturaFahrenheit Valor Fahrenheit calculado pelo método
	 */
	public double convertCelsiusFahrenheit(double temperaturaEmCelsius) {
		
		double temperaturaFahrenheit = temperaturaEmCelsius * FATOR_MULTIPLICACAO_CONVERSAO_CELSIUS_FAHRENHEIT + FATOR_SOMA_CONVERSAO_CELSIUS_FAHRENHEIT;
		
		return temperaturaFahrenheit;	
	}
	
}
