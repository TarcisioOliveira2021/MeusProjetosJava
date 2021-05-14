package br.ucsal.fundamentos.OrdenacaoDeArray;

//Ordenacao de array usando Bubble sort
//Melhor metodo de ordenacao.
public class BublleSort {
	public static void main(String[] args) {
		executar();
	}
	private static void executar() {
		//Criacao do array de valores.
		int[] valores = {5,2,9,8,1,3};
		//Imprime o array antes de ordenar
		System.out.println("Array desordenado:");
		for (int i : valores) {
		System.out.print(i+" ");	
		}
		System.out.println();
		
		//Imprime o array ordenado por Bubble sort.
		imprime(ordenarArray(valores));
	}
	
	//Metodo que ordena o vetor
	private static int[] ordenarArray(int[] array) {
		//Laco de varredura usando 2 for onde um caminha e o outro verifica.
		//verificando se j > ou < que j + 1 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				//Caso o valor de J seja maior que o J da proxima posicao
				if(array[j]> array[j+1]) {
					//Cria uma variavel auxiliar = aux que armazena aquele valor.
					int aux = array[j];
					//Ai o valor que era maior passa a ser o proximo e o menor vem para a posicao array[j].
					array[j] = array[j+1];
					// e o array[j+1] vira o numero maior.
					array[j+1] = aux;
				}
			}
		}
		//Devolve o array ja ordenado.
		return array;
	}
	//Metodo que imprime o array ordenado.
	private static void imprime(int[] array) {
		System.out.println("Array ordenado: ");
		//foreach pois agt so vai imprimir passar 1 vez pelo array e fim.
		for (int i : array) {
			System.out.print(i+" ");
		}
		
	}
}
