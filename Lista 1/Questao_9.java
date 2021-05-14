import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 9ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
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
	 * Método que realiza a execucao do programa
	*/
	public void executa() {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		System.out.println("Digite o número para o cálculo da raiz quadrada!");
		int numero = entrada.nextInt();
		
		int raizQuadrada = calculaRaizQuadrada(numero);
		
		System.out.println(String.format("A raiz quadrada aproximada de %d é %d", numero, raizQuadrada));
		entrada.close();
		
	}

	
	/**
	 * Método que calcula a raiz quadrada de um número
	 * @param numero Número para calcular a raiz
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