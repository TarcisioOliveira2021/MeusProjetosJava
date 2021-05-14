import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 17ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */

public class Questao_17 {

	Random gerador = new Random(Calendar.getInstance().getTimeInMillis());
	final int INICIO = 0;
	final int VALOR_LIMITE = 5;
	
	public static void main(String[] args) {

		Questao_17 questao = new Questao_17();
		questao.executa();
		
	}

	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual a quantidade de linhas da matriz?");
		int quantidadeDeLinhas = entrada.nextInt();

		System.out.println("Qual a quantidade de linhas da colunas?");
		int quantidadeDeColunas = entrada.nextInt();

		int[][] matrizA = getValoresSorteados(quantidadeDeLinhas, quantidadeDeColunas);
		int[][] matrizB = getValoresSorteados(quantidadeDeLinhas, quantidadeDeColunas);

		imprimeMatriz(matrizA);	
		imprimeMatriz(matrizB);
		
		int[][] matrizC = somaMatrizes(matrizA, matrizB, quantidadeDeLinhas, quantidadeDeColunas);
		
		imprimeMatriz(matrizC);
		
		entrada.close();
		
	}

	
	/**
	 * Método que soma duas matrizes de dimensões iguais
	 * @param matrizA Primeira matriz
	 * @param matrizB Segunda matriz
	 * @return matrizC Matriz soma
	 */
	public int[][] somaMatrizes(int[][] matrizA, int[][] matrizB, int quantidadeDeLinhas, int quantidadeDeColunas) {

		int[][] matrizC = new int[quantidadeDeLinhas][quantidadeDeColunas];
		
		for(int i=0; i<quantidadeDeLinhas; i++) {

			for(int j=0; j<quantidadeDeColunas; j++) {

				matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
			
			}
			
		}
		
		return matrizC;
		
	}

	/**
	 * Método que cria a matriz com os valores sorteados
	 * @param quantidadeDeLinhas Quantidade de linhas
	 * @param quantidadeDeColunas Quantidade de colunas
	 * @return valores Matriz
	 */
	public int[][] getValoresSorteados(int quantidadeDeLinhas, int quantidadeDeColunas) {

		int[][] valores = new int[quantidadeDeLinhas][quantidadeDeColunas];
		
		for(int i=0; i<quantidadeDeLinhas; i++) {

			for(int j=0; j<quantidadeDeColunas; j++) {

				valores[i][j] = sorteia(VALOR_LIMITE);
			
			}
			
		}
		
		return valores;
		
	}

	
	/**
	 * Método que sorteia um valor
	 * @param limite Limite do valor a ser sorteado
	 * @return valor Valor sorteado
	 */
	public int sorteia(int limite) {

		int valor = gerador.nextInt(limite);
		return valor;
		
	}
	

	/**
	 * Método que imprime a matriz
	 * @param valores Matriz a ser impressa
	 */
	public void imprimeMatriz(int[][] valores) {

		for(int i=0; i<valores.length;i++) {

			for(int j=0; j<valores[i].length;j++) {
		
				System.out.print(String.format("%d ", valores[i][j]));
			
			}
			System.out.println("");
		}
		System.out.println("\n");
	}
	
}
