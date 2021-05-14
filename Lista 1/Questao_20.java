import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 20ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */


public class Questao_20 {

	public static void main(String[] args) {

		Questao_20 questao = new Questao_20();
		questao.executa();
		
	}

	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado
		
		int posicao=0;
		int nota=0;
		
		System.out.println("Qual o tamanho do array?");
		int tamanho = entrada.nextInt();

		int[] valores = new int[tamanho];

		do{
			
			System.out.println("Digite uma nota!");
			nota = entrada.nextInt();
			posicao = buscaPosicao(valores, nota);
			
			if(posicao<valores.length) {
				valores = reorganizaArray(valores, posicao);			
				valores[posicao]=nota;
			}
			
			imprimeArray(valores);
			
		}while(nota!=-1); 
		
		entrada.close(); //Fecha a entrada
		
	}

	/**
	 * Método que imprime um array
	 * @param array
	*/
	public void imprimeArray(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.print(String.format("%d ", array[i]));
		}
		System.out.println("");
	}

	/**
	 * Método que identifica a posição de inserção do número no array
	 * @param array Vetor com os valores
	 * @param numero Número para buscar a posição
	 * @return posicao Posição de inserção
	*/
	public int buscaPosicao(int[] array, int numero) {
	
		int i = 0;
		
		while(i<array.length&&numero<array[i]) {
			i++;
		}

		return i;
	}

	/**
	 * Método que  reorganiza o array
	 * @param array Vetor com os valores
	 * @param posicao Posição de onde parte a reorganização
	 * @return array Array reorganizado
	*/
	public int[] reorganizaArray(int[] array, int posicao) {
	
		int i = posicao;
		int atual, proximo;
		
		atual = array[i];
		
		while(i<array.length-1) {	
			proximo = array[++i];
			array[i]=atual;
			atual=proximo;
		}

		return array;
	}

}
