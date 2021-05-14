package br.ucsal.fundamentos.AlgoritmosDeBusca;

//Recursividade = repeticao.
//Recursividade direta = ela chama ela mesma.
//Recursividade indireta = ela chama um e depois outro.
//3 fatores para ser recursivo:
//	Chamada a ele mesmo ( ou ela ).
//  Há uma condicao de parada. ( ex: i<10).
//  Mudança de estado. (ex: i--)
//O seu problema é o consumo de memoria ecessivo.
public class BuscaComRecursividade {
	static int[] array = { 0,11,2,33,4,55,6,7,82,9,100};
	
	public static void main(String[] args) {
		executar();
	}

	private static void executar() {
		int inicio = 0;
		int meio = 0;
		int fim = 11;
		int valorABuscar = 100;
		
		System.out.println("O elemento procurado: "+valorABuscar+", esta na posicao: "+busca(inicio,meio,fim,valorABuscar));
	}
	//Metodo recursivo que retorna a ele mesmo, ele mesmo.
	private static int busca(int inicio, int meio, int fim, int valorABuscar) {
		//Se o fim for menor que o inicio ele retorna -1;
		if(fim<inicio) {
			return -1;
		}
		//Formula que faz a busca.
		meio = (fim-inicio)/2 + inicio;
		// Caso o elemento seja igual no array[na posicao].
		if(array[meio]==valorABuscar) {
			return meio;
		//Caso o conteudo no array[na posicao] for menor que o
		//valor que buscamos.
		}else if(array[meio] < valorABuscar) {
			inicio = meio + 1;
		//Caso ele seja maior que o valor.
		}else if(array[meio] > valorABuscar) {
			fim = meio - 1;
		}
		return busca(inicio, meio, fim , valorABuscar);
	}
}
