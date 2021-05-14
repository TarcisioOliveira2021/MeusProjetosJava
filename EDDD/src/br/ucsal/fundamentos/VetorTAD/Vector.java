package br.ucsal.fundamentos.VetorTAD;

public class Vector implements IVector {
	Integer[] valores;

	// Criacao de um construtor.

	public Vector(int tamanho) {
		valores = new Integer[tamanho];
	}

	// Adciona no array;
	public void add(int posicao, int valor) {
		// Se a posicao for menor que o tamanho do vetor.
		if (posicao < valores.length) {
			// Na posicao passada do array é inserido o valor.
			valores[posicao] = valor;
		}
	}

	// Adiciona um novo valor ao vector aumentando seu tamanho..
	public void addElement(Integer valor) {
		// Criacao de um array chamado novo com o tamanho do antigo vetor.
		Integer[] novo = new Integer[valor];
		// Varre o vetor velho colocando os elementos no novo.
		for (int i = 0; i < valores.length; i++) {
			novo[i] = valores[i];
		}
		// o elemento e inserido no final do array
		novo[novo.length - 1] = valor;
		// O array valores agora tem o conteundo do array novo.
		valores = novo;
	}

//Sublist dos elementos na posicao desejada ate a ultima posicao informada
	public Vector subList(int posicaoInicial, int posicaoFinal) {
		// Variavel que guarda o tamanho.
		int tamanho = posicaoInicial + posicaoFinal;
		// Criacao de um objeto chamado vector que tem o tamanho = tamanho;
		Vector vector = new Vector(tamanho);
		// comecando na posicao inicio ate menor que a posicaoFinal
		for (int i = posicaoInicial, j = 0; i < posicaoFinal; i++, j++) {
			// O vetor recebe o indice J e o valor.
			vector.add(j,valores[i]);
		}
		// Retorna o sublist.
		return vector;
	}
	//Retorna a 1 ocorrencia do valor passado.
	public int indexOf(int valor) {
		//Percorre o array de valores
		for (int i = 0; i < valores.length; i++) {
			//No Se usa-se a condicao falsa primeiro para ganhar
			//Desempenho.
			//Caso valores[i] nao esteja vazia e valores[i] == ao valor informado.
			if ((valores[i] != null) && (valores[i] == valor)) {
				//Retorna o indice.
				return i;
			}
		}
		//Se nao retorna -1.
		return -1;
	}
	/*
	 * Index of com while:
	 * 
	 * public int indexOf(int valor) {
		int indice = -1, i=0;
		boolean continua=true;
		while(i<valores.length&&continua) {
			if((valores[i]!=null) && valores[i]==valor) {
				indice = i;
				continua = false;
			}		
			i++;
		}
		return indice;
	}
	 * 
	 * 
	 * 
	 */
	
	//Retorna a ultima ocorrencia do valor passado.
	public int lastIndexOf(int valor) {
		//Varre o array do final para o inicio.
		for (int i = valores.length-1; i >= 0; i--) {
			//No Se usa-se a condicao falsa primeiro para ganhar
			//Desempenho.
			//Caso valores[i] nao esteja vazia e valores[i] == ao valor informado.
			if ((valores[i] != null) && (valores[i] == valor)) {
				//Retorna o indice.
				return i;
			}
		}
		//Se nao retorna -1.
		return -1;
	//Retorna a ultima ocorrencia do valor passado.
	}
	
	/*
	 * lastIndexOf com while:
	 * public int lastIndexOf(int valor) {
		int indice = -1, i=valores.length-1;
		boolean continua=true;
		while((i>=0)&&(continua)) {
			if((valores[i]!=null) && valores[i]==valor) {
				indice = i;
				continua=false;
			}	
			i--;
		}
		return indice;
	}
	 * 
	 * 
	 */

	public void ensureCapacity(int tamanho) {
		//Se o tamanho for maior que o tamnaho do array de valores.
		if(tamanho>valores.length) {
			//Cria um novo array novo onde o seu tamanho e definido no parametro.
			Integer[] novo = new Integer[tamanho];
			//Varre o array coloca os valores antigos no array novo
			for (int i = 0; i < valores.length; i++) {
				novo[i] = valores[i];
			}
			//Devolve o novo array.
			valores = novo;
		}

	}
	//Reseta o array
	public void clear() {
		//Cria um novo array e atribui ele a valores.
		Integer[] novo = new Integer[valores.length];
		valores = novo;
	}

	//Imprime o array.
	public void imprimir() {
		for (Integer integer : valores) {
		System.out.print(integer + " ");	
		}
		System.out.println();
	}

}
