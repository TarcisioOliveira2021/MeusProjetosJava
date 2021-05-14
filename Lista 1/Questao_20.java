import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 20� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */


public class Questao_20 {

	public static void main(String[] args) {

		Questao_20 questao = new Questao_20();
		questao.executa();
		
	}

	/**
	 * M�todo que realiza a execucao do programa
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
	 * M�todo que imprime um array
	 * @param array
	*/
	public void imprimeArray(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.print(String.format("%d ", array[i]));
		}
		System.out.println("");
	}

	/**
	 * M�todo que identifica a posi��o de inser��o do n�mero no array
	 * @param array Vetor com os valores
	 * @param numero N�mero para buscar a posi��o
	 * @return posicao Posi��o de inser��o
	*/
	public int buscaPosicao(int[] array, int numero) {
	
		int i = 0;
		
		while(i<array.length&&numero<array[i]) {
			i++;
		}

		return i;
	}

	/**
	 * M�todo que  reorganiza o array
	 * @param array Vetor com os valores
	 * @param posicao Posi��o de onde parte a reorganiza��o
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
