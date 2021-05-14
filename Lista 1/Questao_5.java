import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 5� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */


public class Questao_5 {

	final int TAMANHO_DO_ARRAY = 10;

	public static void main(String[] args) {

		Questao_5 questao = new Questao_5();
		questao.executa();
		
	}
	
	
	/**
	 * M�todo que realiza a execucao do programa
	*/
	public void executa() {

		percorreArray(constroiArray(TAMANHO_DO_ARRAY));
		
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
	
	/**
	 * M�todo que calcula o produto de dois n�meros
	 * @param operando1 Par�metro que recebe o primeiro valor
	 * @param operando2 Par�metro que recebe o segundo valor
	 * @return resultado Valor do produto
	 */
	public int multiplica(int operando1, int operando2) {
		
		int produto = operando1 * operando2;
		
		return produto;
		
	}
	
	/**
	 * M�todo que identifica se um valor � par
	 * @param valor Par�metro que recebe o valor a ser avaliado
	 */
	public boolean ehPar(int valor) {
		
		boolean ehPar = false;
		
		if(valor % 2 == 0) {
			ehPar = true;
		}
		
		return ehPar;
		
	}

	/**
	 * M�todo que percorre o array calculando os produtos
	 * @param valores Par�metro que recebe o array
	 */
	public void percorreArray(int[] valores) {
		
		int produto = 0;
		boolean ehPar = false;
		
		for(int i=0; i<valores.length; i++) {
			
			for(int j=0; j<valores.length; j++) {
				
				if(i!=j) {
					
					produto = multiplica(valores[i], valores[j]);
					ehPar = ehPar(produto);
					
					if(ehPar) {
						
						imprimeResultado(produto, valores[i], valores[j]);
						
					}
					
				}
				
			}
			
		}
		
		
	}

	/**
	 * M�todo que imprime o resultado
	 * @param produto Valor do produto
	 * @param valor1 Primeiro valor
	 * @param valor2 Segundo valor
	 */
	public void imprimeResultado(int produto, int valor1, int valor2) {
		
		System.out.println(String.format("O valor %d, produto de %d por %d � par!", produto, valor1, valor2));
		
	}

}
