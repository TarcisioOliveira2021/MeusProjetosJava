package br.ucsal.fundamentos.OrdenacaoDeArray;

public class SelectionSort {
	public static void main(String[] args) {
		executar();
	}

	private static void executar() {
		int[] valores = {100,88,29,13,55,10,9,1,10000};
		System.out.println("Array Desordenado:");
		for (int i : valores) {
		System.out.print(" "+i);	
		}
		System.out.println();
		imprimir(ordenaValores(valores));
	}
	private static void imprimir(int[] ordenaValores) {
		System.out.println("Array Ordenado: ");
		for (int i : ordenaValores) {
		 System.out.print(" "+i);	
		}
		
	}

	//Metodo que ordena Selection sort ordena do maior para o menor.
	private static int[] ordenaValores(int[] valores) {
		//navegando pelo array de valores.
		for (int i = 0; i < valores.length; i++) {
			//Criacao de uma variavel chave que guarda a posicao.
			int chave = i;
			//navegacao do vetor verificando se valores[j] < valores[chave]
			for (int j = 0; j < valores.length; j++) {
				if(valores[j]<valores[chave]) {
					// a chave recebe a posicao de navegacao j caso ela seja menor.
					chave = j;
				}
				//Variavel auxilar que guarda valores na posicao[i]
				int aux = valores[i];
				//Valores na posicao[i] recebe valores[chave]
				valores[i] = valores[chave];
				//E chave recebe o aux.
				valores[chave]=aux;
			}
		}
		//retornando o vetor ja ordenado.
		return valores;
	}
}
