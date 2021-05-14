import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 9� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */


public class Questao_9 {

	final double DEZ_PORCENTO = 0.10;
	final double QUINZE_PORCENTO = 0.15;
	final int TAMANHO_DO_ARRAY = 10;

	public static void main(String[] args) {

		Questao_9 questao = new Questao_9();
		questao.executa();
		
	}
	
	
	/**
	 * M�todo que realiza a execucao do programa
	*/
	public void executa() {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		System.out.println("Digite o n�mero para o c�lculo da raiz quadrada!");
		int numero = entrada.nextInt();
		
		int raizQuadrada = calculaRaizQuadrada(numero);
		
		System.out.println(String.format("A raiz quadrada aproximada de %d � %d", numero, raizQuadrada));
		entrada.close();
		
	}

	
	/**
	 * M�todo que calcula a raiz quadrada de um n�mero
	 * @param numero N�mero para calcular a raiz
	 */
	public int calculaRaizQuadrada(int numero) {

		int raizQuadrada = 0;
		int numeroImpar = 1;
		
		while(numero>0) {
			numero -= numeroImpar;
			raizQuadrada++;
			numeroImpar += 2;
		}

		return raizQuadrada;
		
	}
	
}