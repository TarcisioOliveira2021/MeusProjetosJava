import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 2� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
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
	 * M�todo que realiza a execucao do programa
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
	 * M�todo que calcula o IMC de uma pessoa
	 * @param nome Nome da pessoa
	 * @param peso Peso da pessoa
	 * @param altura Altura da pessoa	  
	 * @return imc Valor do IMC calculado pelo m�todo
	 */
	public double calculaIMC(double peso, double altura) {
	
		double alturaAoQuadrado = Math.pow(altura, 2); 
		double imc = peso/ alturaAoQuadrado;
		
		return imc;	
	}

	/**
	 * M�todo que imprime o IMC de uma pessoa
	 * @param imc IMC da pessoa	  
	 */
	public void imprimeIMC(String nome, double imc) {
		
		if (imc < LIMITE_ABAIXO_DO_PESO) {
			
			System.out.println(String.format("%s tem o imc %.2f e est� abaixo do peso.", nome, imc));
			
		} else if  (imc <= LIMITE_PESO_NORMAL) {
		
			System.out.println(String.format("%s tem o imc %.2f e est� com o peso normal.", nome, imc));
			
		} else if  (imc <= LIMITE_ACIMA_DO_PESO) {
		
			System.out.println(String.format("%s tem o imc %.2f e est� acima do peso.", nome, imc));
			
		} else {
			
			System.out.println(String.format("%s tem o imc %.2f e est� obeso.", nome, imc));
			
		}	

	}
	
}
