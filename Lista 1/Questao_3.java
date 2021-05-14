import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 3� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */


public class Questao_3 {

	private double memoria = 0.0; // Mem�ria da calculadora
	//S�mbolos das opera��es
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
						       "+ soma, - subtra��o, " +
						       " * multiplica��o, " +
						       "/ divis�o, = imprimir mem�ria," +
						       "c limpar mem�ria, f finalizar calculadora");
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
	 * M�todo que calcula a soma de dois n�meros
	 * @param operando Operando
	 */
	public void soma(double operando) {
		
		memoria = memoria + operando;
		
	}

	/**
	 * M�todo que calcula a subtracao de dois n�meros
	 * @param operando Operando
	 */
	public void subtrai(double operando) {
		
		memoria = memoria - operando;
		
	}

	/**
	 * M�todo que calcula a multiplicacao de dois n�meros
	 * @param operando Operando
	 */
	public void multiplica(double operando) {
		
		memoria = memoria * operando;
		
	}

	/**
	 * M�todo que calcula a divisao de dois n�meros
	 * @param operando Operando
	 */
	public void divide(double operando) {
		
		memoria = memoria / operando;
		
	}

	public void imprimeMemoria() {
		
		System.out.println(memoria);
				
	}
}
