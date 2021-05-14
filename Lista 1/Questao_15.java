import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 15ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */

public class Questao_15 {

	Random gerador = new Random(Calendar.getInstance().getTimeInMillis());
	final int INICIO = 0;
	final int VALOR_LIMITE = 10;
	
	public static void main(String[] args) {

		Questao_15 questao = new Questao_15();
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

		System.out.println("Qual o índice da linha a ser pesquisada?");
		int indiceLinha = entrada.nextInt();

		System.out.println("Qual o índice da coluna a ser pesquisada?");
		int indiceColuna = entrada.nextInt();

		int[][] numerosSorteados = getValoresSorteados(quantidadeDeLinhas, quantidadeDeColunas);

		imprimeMatriz(numerosSorteados);
		
		int maiorNaLinha = buscaMaiorValorNaLinha(numerosSorteados, indiceLinha);
		int menorNaLinha = buscaMenorValorNaLinha(numerosSorteados, indiceLinha);
		int maiorNaColuna = buscaMaiorValorNaColuna(numerosSorteados, indiceColuna);
		int menorNaColuna = buscaMenorValorNaColuna(numerosSorteados, indiceColuna);
		
		System.out.println(String.format("O maior valor na linha de índice %d é %d", indiceLinha, maiorNaLinha));
		System.out.println(String.format("O menor valor na linha de índice %d é %d", indiceLinha, menorNaLinha));
		System.out.println(String.format("O maior valor na coluna de índice %d é %d", indiceColuna, maiorNaColuna));
		System.out.println(String.format("O menor valor na coluna de índice %d é %d", indiceColuna, menorNaColuna));
		
		entrada.close();
		
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
	 * Método que faz a busca do maior valor em uma dada linha
	 * @valores Matriz
	 * @linha Linha
	 * @return maior Maior valor da linha dada
	 */
	public int buscaMaiorValorNaLinha(int[][] valores, int linha) {
		
		int maior = valores[INICIO][INICIO];
		
    	for(int i=0; i<valores[linha].length; i++) {

			if(valores[linha][i]>maior) {
				maior = valores[linha][i]; 
			}
			
		}	
		
		return maior;
				
	}

	/**
	 * Método que faz a busca do menor valor em uma dada linha
	 * @valores Matriz
	 * @linha Linha
	 * @return maior Maior valor da linha dada
	 */
	public int buscaMenorValorNaLinha(int[][] valores, int linha) {
		
		int menor = valores[INICIO][INICIO];
		
    	for(int i=0; i<valores[linha].length; i++) {

			if(valores[linha][i]<menor) {
				menor = valores[linha][i]; 
			}
			
		}	
		
		return menor;
				
	}

	/**
	 * Método que faz a busca do maior valor em uma dada coluna
	 * @valores Matriz
	 * @linha Linha
	 * @return maior Maior valor da coluna dada
	 */
	public int buscaMaiorValorNaColuna(int[][] valores, int coluna) {
		
		int maior = valores[INICIO][INICIO];
		
    	for(int i=0; i<valores.length; i++) {

			if(valores[i][coluna]>maior) {
				maior = valores[i][coluna]; 
			}
			
		}	
		
		return maior;
				
	}

	/**
	 * Método que faz a busca do menor valor em uma dada coluna
	 * @valores Matriz
	 * @linha Linha
	 * @return menor Menor valor da coluna dada
	 */
	public int buscaMenorValorNaColuna(int[][] valores, int coluna) {
		
		int menor = valores[INICIO][INICIO];
		
    	for(int i=0; i<valores.length; i++) {

			if(valores[i][coluna]<menor) {
				menor = valores[i][coluna]; 
			}
			
		}	
		
		return menor;
				
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
