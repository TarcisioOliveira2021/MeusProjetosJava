import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 7ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */


public class Questao_7 {

	Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado
	final int TAMANHO_DO_ARRAY = 10;

	public static void main(String[] args) {

		Questao_7 questao = new Questao_7();
		questao.executa();
		
	}
	
	
	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {

		int[] primeiroArray = constroiArray(TAMANHO_DO_ARRAY);
		int[] segundoArray = constroiArray(TAMANHO_DO_ARRAY);
		int[] produtoEscalar = geraProdutoEscalar(primeiroArray, segundoArray);

		imprimeArray(produtoEscalar);

		entrada.close();
		
	}

	/**
	 * Método que cria o produto escalar
	 * @param primeiroArray Parâmetro que contém o primeiro array
	 * @param primeiroArray Parâmetro que contém o segundo array
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
	 * Método que constrói o array
	 * @param tamanho Tamanho do array a ser construído
	 * @return valores Array
	 */
	public int[] constroiArray(int tamanho) {

		int[] valores = new int[tamanho]; 
		
		for(int i=0; i<valores.length;i++) {

			System.out.println(String.format("Qual o %d º valor?", i+1));
			valores[i] = entrada.nextInt();
		
		}

		return valores;
		
	}
	
	/**
	 * Método que imprime o array
	 * @param valores Array a ser impresso
	 */
	public void imprimeArray(int[] valores) {

		for(int i=0; i<valores.length;i++) {

			System.out.print(String.format("%d ", valores[i]));
		
		}

	}
	
}
