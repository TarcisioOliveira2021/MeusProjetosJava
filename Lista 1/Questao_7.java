import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 7� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */


public class Questao_7 {

	Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado
	final int TAMANHO_DO_ARRAY = 10;

	public static void main(String[] args) {

		Questao_7 questao = new Questao_7();
		questao.executa();
		
	}
	
	
	/**
	 * M�todo que realiza a execucao do programa
	*/
	public void executa() {

		int[] primeiroArray = constroiArray(TAMANHO_DO_ARRAY);
		int[] segundoArray = constroiArray(TAMANHO_DO_ARRAY);
		int[] produtoEscalar = geraProdutoEscalar(primeiroArray, segundoArray);

		imprimeArray(produtoEscalar);

		entrada.close();
		
	}

	/**
	 * M�todo que cria o produto escalar
	 * @param primeiroArray Par�metro que cont�m o primeiro array
	 * @param primeiroArray Par�metro que cont�m o segundo array
	 * @return produtoEscalar Produto escalar
	 */
	public int[] geraProdutoEscalar(int[] primeiroArray, int[] segundoArray) {

		int[] produtoEscalar = new int[10];
		
		for(int i=0;i<produtoEscalar.length;i++) {
			
			produtoEscalar[i] = primeiroArray[i] * segundoArray[i];

		}

		return produtoEscalar;
		
	}

	/**
	 * M�todo que constr�i o array
	 * @param tamanho Tamanho do array a ser constru�do
	 * @return valores Array
	 */
	public int[] constroiArray(int tamanho) {

		int[] valores = new int[tamanho]; 
		
		for(int i=0; i<valores.length;i++) {

			System.out.println(String.format("Qual o %d � valor?", i+1));
			valores[i] = entrada.nextInt();
		
		}

		return valores;
		
	}
	
	/**
	 * M�todo que imprime o array
	 * @param valores Array a ser impresso
	 */
	public void imprimeArray(int[] valores) {

		for(int i=0; i<valores.length;i++) {

			System.out.print(String.format("%d ", valores[i]));
		
		}

	}
	
}
