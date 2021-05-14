import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 10ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */


public class Questao_10 {

	final int TAMANHO_DO_ARRAY = 10;

	public static void main(String[] args) {

		Questao_10 questao = new Questao_10();
		questao.executa();
		
	}
	
	
	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {

		int[] array = constroiArray(TAMANHO_DO_ARRAY);
		
		int maiorNumero = getMaiorNumero(array);
		int menorNumero = getMenorNumero(array);
		
		System.out.println(String.format("O maior número é %d", maiorNumero));
		System.out.println(String.format("O menor número é %d", menorNumero));
		
	}

	
	/**
	 * Método que identifica o maior número em um array
	 * @param numero Número
	 */
	public int getMaiorNumero(int[] numeros) {

		int maiorNumero = numeros[0];

		for(int i=0; i<numeros.length; i++) {
			if(numeros[i]>maiorNumero) {
				maiorNumero = numeros[i]; 
			}
		}
		
		return maiorNumero;
		
	}

	/**
	 * Método que identifica o menor número em um array
	 * @param numero Número
	 */
	public int getMenorNumero(int[] numeros) {

		int menorNumero = numeros[0];

		for(int i=0; i<numeros.length; i++) {
			if(numeros[i]<menorNumero) {
				menorNumero = numeros[i]; 
			}
		}
		
		return menorNumero;
		
	}
	
	/**
	 * Método que constrói o array
	 * @param tamanho Tamanho do array a ser construído
	 * @return valores Array
	 */
	public int[] constroiArray(int tamanho) {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		int[] valores = new int[tamanho]; 
		
		for(int i=0; i<valores.length;i++) {

			System.out.println(String.format("Qual o %d º valor?", i+1));
			valores[i] = entrada.nextInt();
		
		}

		entrada.close();
		return valores;
		
	}

}