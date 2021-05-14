import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 17� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
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
	 * M�todo que realiza a execucao do programa
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
	 * M�todo que soma duas matrizes de dimens�es iguais
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
	 * M�todo que cria a matriz com os valores sorteados
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
	 * M�todo que sorteia um valor
	 * @param limite Limite do valor a ser sorteado
	 * @return valor Valor sorteado
	 */
	public int sorteia(int limite) {

		int valor = gerador.nextInt(limite);
		return valor;
		
	}
	

	/**
	 * M�todo que imprime a matriz
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
