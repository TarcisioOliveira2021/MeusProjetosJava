import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 2ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */


public class Questao_2 {

	final double LIMITE_ABAIXO_DO_PESO = 18.5;
	final double LIMITE_PESO_NORMAL = 25.0;
	final double LIMITE_ACIMA_DO_PESO = 30.0;
	
	public static void main(String[] args) {

		Questao_2 questao = new Questao_2();
		questao.executa();
		
	}

	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		System.out.println("Digite o seu nome!");
		String nome = entrada.nextLine();

		System.out.println("Digite o seu peso!");
		double peso = entrada.nextDouble();

		System.out.println("Digite a sua altura!");
		double altura = entrada.nextDouble();

		double imc = calculaIMC(peso, altura);
		imprimeIMC(nome, imc);

		entrada.close(); //Fecha a entrada
		
	}
	
	/**
	 * Método que calcula o IMC de uma pessoa
	 * @param nome Nome da pessoa
	 * @param peso Peso da pessoa
	 * @param altura Altura da pessoa	  
	 * @return imc Valor do IMC calculado pelo método
	 */
	public double calculaIMC(double peso, double altura) {
	
		double alturaAoQuadrado = Math.pow(altura, 2); 
		double imc = peso/ alturaAoQuadrado;
		
		return imc;	
	}

	/**
	 * Método que imprime o IMC de uma pessoa
	 * @param imc IMC da pessoa	  
	 */
	public void imprimeIMC(String nome, double imc) {
		
		if (imc < LIMITE_ABAIXO_DO_PESO) {
			
			System.out.println(String.format("%s tem o imc %.2f e está abaixo do peso.", nome, imc));
			
		} else if  (imc <= LIMITE_PESO_NORMAL) {
		
			System.out.println(String.format("%s tem o imc %.2f e está com o peso normal.", nome, imc));
			
		} else if  (imc <= LIMITE_ACIMA_DO_PESO) {
		
			System.out.println(String.format("%s tem o imc %.2f e está acima do peso.", nome, imc));
			
		} else {
			
			System.out.println(String.format("%s tem o imc %.2f e está obeso.", nome, imc));
			
		}	

	}
	
}
