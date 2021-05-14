import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 5ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */


public class Questao_5 {

	final int TAMANHO_DO_ARRAY = 10;

	public static void main(String[] args) {

		Questao_5 questao = new Questao_5();
		questao.executa();
		
	}
	
	
	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {

		percorreArray(constroiArray(TAMANHO_DO_ARRAY));
		
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
	
	/**
	 * Método que calcula o produto de dois números
	 * @param operando1 Parâmetro que recebe o primeiro valor
	 * @param operando2 Parâmetro que recebe o segundo valor
	 * @return resultado Valor do produto
	 */
	public int multiplica(int operando1, int operando2) {
		
		int produto = operando1 * operando2;
		
		return produto;
		
	}
	
	/**
	 * Método que identifica se um valor é par
	 * @param valor Parâmetro que recebe o valor a ser avaliado
	 */
	public boolean ehPar(int valor) {
		
		boolean ehPar = false;
		
		if(valor % 2 == 0) {
			ehPar = true;
		}
		
		return ehPar;
		
	}

	/**
	 * Método que percorre o array calculando os produtos
	 * @param valores Parâmetro que recebe o array
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
	 * Método que imprime o resultado
	 * @param produto Valor do produto
	 * @param valor1 Primeiro valor
	 * @param valor2 Segundo valor
	 */
	public void imprimeResultado(int produto, int valor1, int valor2) {
		
		System.out.println(String.format("O valor %d, produto de %d por %d é par!", produto, valor1, valor2));
		
	}

}
