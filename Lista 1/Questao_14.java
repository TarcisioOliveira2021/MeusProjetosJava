import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 14ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */

public class Questao_14 {

	Random gerador = new Random(Calendar.getInstance().getTimeInMillis());
    final int VALOR_LIMITE = 10;
	
	public static void main(String[] args) {

		Questao_14 questao = new Questao_14();
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

		int[][] numerosSorteados = getValoresSorteados(quantidadeDeLinhas, quantidadeDeColunas);

		imprimeMatriz(numerosSorteados);
		

		int[][] posicaoDoValor = buscaMaiorValor(numerosSorteados);
		
		System.out.println(String.format("O valor %d, maior valor, foi encontrado na linha de índice %d e na coluna de índice %d da matriz.", posicaoDoValor[0][0],posicaoDoValor[0][1],posicaoDoValor[0][2]));
		
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
	 * Método que faz a busca do maior valor na matriz
	 * @valores Matriz
	 * @valorProcurado Valor procurado
	 * @return posicao Array com a primeira posição em que o maior valor foi encontrado
	 */
	public int[][] buscaMaiorValor(int[][] valores) {
		
		int maior = valores[0][0];
		int[][] posicao = new int[1][3];
		
		for(int i=0; i<valores.length; i++) {

			for(int j=0; j<valores.length; j++) {

				if(valores[i][j]>maior) {
					maior=valores[i][j];
					posicao[0][0]=maior;
					posicao[0][1]=i;
					posicao[0][2]=j;
				}
			
			}	
		}	
		
		return posicao;
				
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
