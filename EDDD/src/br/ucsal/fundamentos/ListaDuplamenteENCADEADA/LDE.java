package br.ucsal.fundamentos.ListaDuplamenteENCADEADA;

//Neste tipo de lista precisamos conhecer o anterior e o proximo.

public class LDE implements ILDE {
	// Criacao do inicio.
	No inicio = null;

	// Metodo que insere os valores na lista.
	public void inserir(int valor) {
		// Criacao de um novo no.
		No novo = new No();
		// Onde o valor do No novo = ao valor passado no parametro.
		novo.valor = valor;
		// Caso o inicio esteja vazio isso é a lista vazia.
		if (inicio == null) {
			// O inicio recebe o valor colocado no parametro
			inicio = novo;
			// Se a lista nao estiver vazia.
		} else {
			// O novo.prox ( O proximo valor recebe o inicio)
			novo.prox = inicio;
			// O inicio.ant (recebe o novo o proximo valor inserido).
			inicio.ant = novo;
			inicio = novo;
		}
	}

	// Metodo que remove da lista.
	public void remover(int valor) {
		// Se a lista estiver vazia
		if (inicio == null) {
			// Escreve
			System.out.println("Lista vazia.");
			// Se nao
		} else {
			// Cria um No aux que recebe o inicio.
			No aux = inicio;
			// Enquanto o aux != de vazio isto é: enquanto nao tenha chegado no fim da lista
			// E o aux.valor: o valor do auxiliar for diferente de valor.
			while (aux.prox!= null && aux.valor != valor) {
				// O aux recebe o proximo valor.
				aux = aux.prox;
			}
			// Se o valor do auxilar for igual ao passado por parametro.
			if (aux.valor == valor) {
				// Caso o valor a ser removido esteja no inicio da lista.
				if (aux.ant == null) {
					// O inicio vai ser igual ao inicio.prox.
					inicio = inicio.prox;
					// E o inicio anterior é igual a null: vazio , quebrando a referencia assim como
					// ngm aponta para ele e o garbage collector consegue deleta-lo.
					inicio.ant = null;
					// Se entao o aux.prox: o proximo valor = a vazio isto é se o valor a ser
					// removido estiver no final.
				} else if (aux.prox == null) {
					// O aux.ant = numero anterior ao aux (aux.ant.prox = proximo do antes do
					// auxiliar) recebe vazio.
					aux.ant.prox = null; // Talvez precise remover.
					// O valor antes do auxiliar recebe null: vazio
					aux.ant = null;
					// O auxiliar recebe nulo
					aux = null;
				}else {
					aux.ant.prox = aux.prox;
					aux.prox.ant = aux.ant;
					aux.ant=null;
					aux.prox=null;
					aux=null;
				}
			}
		}
	}

	// Metodo que busca o valor na lista
	public No buscar(int chave) {
		// Caso o inicio esteja vazio
		if (inicio == null) {
			// Escreve
			System.out.println("Lista vazia");
			// Se nao
		} else {
			// Cria um variavel aux que recebe o inicio (ela que navega pela lista).
			No aux = inicio;
			// Enquanto o aux.prox != null: vazio isto é enquanto nao tenha chegado ao fim
			// da lista.
			// e o aux.valor ( valor do auxiliar ) for diferente da chave
			while (aux.prox != null && aux.valor != chave) {
				// O auxliar recebe o proximo valor
				// Percorrendo entao a lista.
				aux = aux.prox;
			}
			// Se o valor do auxilar for igual ao da chave.
			if (aux.valor == chave) {
				// Retorne o auxiliar.
				return aux;
				// Se nao
			} else {
				// Escreva
				System.out.println("Elemento nao encontrado.");
			}
		}
		return null;
	}

	// Metodo que altera o valor
	public void alterar(int chave, int novoValor) {
		// Caso a lista esteja vazia
		if (inicio == null) {
			System.out.println("Lista vazia");
			// Se nao
		} else {
			// Cria um variavel auxiliar que recebe o valor de inicio.
			No aux = inicio;
			// Enquanto o aux.prox for diferente de vazio e o aux.valor for diferente da
			// chave
			while (aux.prox != null && aux.valor != chave) {
				// O auxiliar recebe o proximo valor.
				aux = aux.prox;
			}
			// Caso o aux.valor seja igual a chave
			if (aux.valor == chave) {
				// o aux.valor recebe o novoValor;
				aux.valor = novoValor;
				// Se nao
			} else {
				// Escreve
				System.out.println("Elemento nao encontrado");
			}
		}
	}

	// Metodo que imprime a lista da frente para tras.
	public void imprimirAscendente() {
		// Se a lista estiver vazia.
		if (inicio == null) {
			// Escreve
			System.out.println("Lista vazia");
			// Se nao
		} else {
			// Cria um variavel No que recebe o inicio.
			No aux = inicio;
			// Enquanto o aux for diferente de vazio
			while (aux != null) {
				// Escreve os valores da lista
				System.out.print(aux.valor + " ");
				// E o aux recebe o proximo valor.
				aux = aux.prox;
			}
			System.out.println();
		}
	}

	// Metodo que imprime a lista de tras para frente
	public void imprimirDescendente() {
		// Se a lista estiver vazia.
		if (inicio == null) {
			// Escreve
			System.out.println("Lista vazia");
			// Se nao
		} else {
			// Cria um variavel No que recebe o inicio.
			No aux = inicio;
			// Enquanto o aux.prox for diferente do vazio, isto é: enquanto nao estiver no
			// final da lista
			while (aux.prox != null) {
				// O aux recebe o aux.prox, isto é: o proximo valor.
				aux = aux.prox;
			}
			// Enquanto o aux for diferente de vazio
			while (aux != null) {
				// Escreve os valores da lista
				System.out.print(aux.valor + " ");
				// E o aux recebe o valor anterior.
				aux = aux.ant;
			}
			System.out.println();
		}
	}
}
