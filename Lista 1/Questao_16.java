import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 16� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */

public class Questao_16 {

	Random gerador = new Random(Calendar.getInstance().getTimeInMillis());
	final int INICIO = 0;
	final int VALOR_LIMITE = 10;
	
	public static void main(String[] args) {

		Questao_16 questao = new Questao_16();
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

		int[][] numerosLidos = getMatrizComValoresLidos(entrada, quantidadeDeLinhas, quantidadeDeColunas);

		imprimeMatriz(numerosLidos);
		
		int quantidadeDeNumerosPares = contaNumerosPares(numerosLidos);
		int quantidadeDeNumerosImpares = contaNumerosImpares(numerosLidos);
		
		System.out.println(String.format("A quantidade de n�meros pares na matriz � %d", quantidadeDeNumerosPares));
		System.out.println(String.format("A quantidade de n�meros �mpares na matriz � %d", quantidadeDeNumerosImpares));
		
		entrada.close();
		
	}
	
	/**
	 * M�todo que cria a matriz com os valores lidos
	 * @param quantidadeDeLinhas Quantidade de linhas
	 * @param quantidadeDeColunas Quantidade de colunas
	 * @return valores Matriz
	 */
	public int[][] getMatrizComValoresLidos(Scanner entrada, int quantidadeDeLinhas, int quantidadeDeColunas) {

		int[][] valores = new int[quantidadeDeLinhas][quantidadeDeColunas];
		
		for(int i=0; i<quantidadeDeLinhas; i++) {

			for(int j=0; j<quantidadeDeColunas; j++) {

				System.out.println("Digite o valor a ser preenchido na matriz!");
				valores[i][j] = entrada.nextInt();
			
			}
			
		}
		
		return valores;
		
	}

	
	/**
	 * M�todo que conta a quantidade de valores pares de uma matriz
	 * @valores Matriz
	 * @return quantidadeDePares
	 */
	public int contaNumerosPares(int[][] valores) {
		
		int quantidadeDePares = 0;
		
		for(int i=0; i<valores.length;i++) {

			for(int j=0; j<valores[i].length;j++) {
				
				if(valores[i][j]%2==0)
					quantidadeDePares++;	
			}
			
		}
		
		return quantidadeDePares;
				
	}

	/**
	 * M�todo que conta a quantidade de valores �mpares de uma matriz
	 * @valores Matriz
	 * @return quantidadeDeImpares
	 */
	public int contaNumerosImpares(int[][] valores) {
		
		int quantidadeDeImpares = 0;
		
		for(int i=0; i<valores.length;i++) {

			for(int j=0; j<valores[i].length;j++) {
				
				if(valores[i][j]%2!=0)
					quantidadeDeImpares++;	
			}
			
		}
		
		return quantidadeDeImpares;
				
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

	}
	
}
