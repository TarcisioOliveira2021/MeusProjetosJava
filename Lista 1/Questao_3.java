import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 3ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */


public class Questao_3 {

	private double memoria = 0.0; // Memória da calculadora
	//Símbolos das operações
	final char SOMA = '+';
	final char SUBTRACAO = '-';
	final char MULTIPLICACAO = '*';
	final char DIVISAO = '/';
	final char IGUAL = '=';
	final char FIM = 'f';
	final char LIMPAR_MEMORIA = 'c';
	
	public static void main(String[] args) {

		Questao_3 questao = new Questao_3();
		questao.executa();

	}

	
	public  void executa() {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		char operador = ' ';
		
		System.out.println("Digite um valor!");
		memoria = entrada.nextDouble();
		
		do {
	
			System.out.println("Digite um operador!" + 
						       "+ soma, - subtração, " +
						       " * multiplicação, " +
						       "/ divisão, = imprimir memória," +
						       "c limpar memória, f finalizar calculadora");
			operador = entrada.next().charAt(0);

			switch(operador) {
			case SOMA:
				soma(entrada.nextDouble());
				break;
			case SUBTRACAO:
				subtrai(entrada.nextDouble());
				break;
			case MULTIPLICACAO:
				multiplica(entrada.nextDouble());
				break;
			case DIVISAO:
				divide(entrada.nextDouble());
				break;
			case IGUAL:
				imprimeMemoria();
				break;
			case LIMPAR_MEMORIA:
				memoria = 0.0;
				System.out.println("Digite um valor!");
				memoria = entrada.nextDouble();
				break;
			}
			
		}while(operador != FIM);
		
		entrada.close(); //Fecha a entrada
	}
	
	/**
	 * Método que calcula a soma de dois números
	 * @param operando Operando
	 */
	public void soma(double operando) {
		
		memoria = memoria + operando;
		
	}

	/**
	 * Método que calcula a subtracao de dois números
	 * @param operando Operando
	 */
	public void subtrai(double operando) {
		
		memoria = memoria - operando;
		
	}

	/**
	 * Método que calcula a multiplicacao de dois números
	 * @param operando Operando
	 */
	public void multiplica(double operando) {
		
		memoria = memoria * operando;
		
	}

	/**
	 * Método que calcula a divisao de dois números
	 * @param operando Operando
	 */
	public void divide(double operando) {
		
		memoria = memoria / operando;
		
	}

	public void imprimeMemoria() {
		
		System.out.println(memoria);
				
	}
}
