import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 10� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */


public class Questao_10 {

	final int TAMANHO_DO_ARRAY = 10;

	public static void main(String[] args) {

		Questao_10 questao = new Questao_10();
		questao.executa();
		
	}
	
	
	/**
	 * M�todo que realiza a execucao do programa
	*/
	public void executa() {

		int[] array = constroiArray(TAMANHO_DO_ARRAY);
		
		int maiorNumero = getMaiorNumero(array);
		int menorNumero = getMenorNumero(array);
		
		System.out.println(String.format("O maior n�mero � %d", maiorNumero));
		System.out.println(String.format("O menor n�mero � %d", menorNumero));
		
	}

	
	/**
	 * M�todo que identifica o maior n�mero em um array
	 * @param numero N�mero
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
	 * M�todo que identifica o menor n�mero em um array
	 * @param numero N�mero
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
	 * M�todo que constr�i o array
	 * @param tamanho Tamanho do array a ser constru�do
	 * @return valores Array
	 */
	public int[] constroiArray(int tamanho) {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		int[] valores = new int[tamanho]; 
		
		for(int i=0; i<valores.length;i++) {

			System.out.println(String.format("Qual o %d � valor?", i+1));
			valores[i] = entrada.nextInt();
		
		}

		entrada.close();
		return valores;
		
	}

}