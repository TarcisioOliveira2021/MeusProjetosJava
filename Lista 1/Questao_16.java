import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 16ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
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
	 * Método que realiza a execucao do programa
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
		
		System.out.println(String.format("A quantidade de números pares na matriz é %d", quantidadeDeNumerosPares));
		System.out.println(String.format("A quantidade de números ímpares na matriz é %d", quantidadeDeNumerosImpares));
		
		entrada.close();
		
	}
	
	/**
	 * Método que cria a matriz com os valores lidos
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
	 * Método que conta a quantidade de valores pares de uma matriz
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
	 * Método que conta a quantidade de valores ímpares de uma matriz
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

	}
	
}
