package br.ucsal.fundamentos.ListaCircular;

//Neste tipo de lista é necessario definir o inicio e o fim.
public class LC implements ILC {
	// Definindo o objeto No inicio e fim.
	No inicio = null;
	No fim = null;

	// Metodo que insere
	public void inserir(int valor) {
		// Criacao do novo No.
		No novo = new No();
		// no atributo novo.valor o valor é guardado.
		novo.valor = valor;
		// Se inicio estiver vazio
		if (inicio == null) {
			// O inicio recebe o No novo.
			inicio = novo;
			// E o final tambem
			fim = novo;
			// fim.prox recebe o inicio pois é uma lista circular.
			fim.prox = inicio;
		} else {
			// fim.prox recebe o novo valor
			fim.prox = novo;
			// Agora o fim é o novo valor
			fim = novo;
			// e o fim.prox aponta para o inicio da lista.
			fim.prox = inicio;
		}
	}

	// Metodo que remove um valor da lista circular
	public void remover(int chave) {
		// Caso a lista esteja vazia
		if (inicio == null) {
			// Escreve
			System.out.println("Lista vazia");
			// Se nao
		} else {
			// Cria 2 variaveis , um aux que caminha pela lista e o ant.
			No ant = null;
			No aux = inicio;
			// Enqnato o aux.prox != inicio isto é enquanto a lista nao tiver no "final".
			// E o aux.valor != chave isto é: o valor de aux for diferente do passado por
			// parametro.
			while (aux.prox != inicio && aux.valor != chave) {
				// O anterior recebe o valor do auxilar
				ant = aux;
				// O aux recebe o proximo valor.
				aux = aux.prox;
			}
			// se o valor do auxilar for igual ao do passado por parametro.
			if (aux.valor == chave) {
				// Se o anterior for nulo isto é se for removido no inicio.
				if (ant == null) {
					// O inicio recebe o inicio.prox o proximo valor
					inicio = inicio.prox;
					// O fim.prox recebe o inicio.
					fim.prox = inicio;
					// O auxliar.prox fica vazio,perdendo a referencia do proximo
					aux.prox = null;
					// E ele fica vazio sendo apagado.
					aux = null;
					// Caso ele esteja no final
				} else if (aux.prox == inicio) {
					// O anterior e ligado ao inicio.
					ant.prox = inicio;
					// O fim agr e o anterior.
					fim = ant;
					// O proximo auiliar é excluio.
					aux.prox = null;
					// E o valor é excluido.
					aux = null;
					// Caso esteja no meio.
				} else {
					ant.prox = aux.prox;
					aux.prox = null;
					aux = null;
				}
				// Caso o elemento nao esteja na lista.
			} else {
				System.out.println("Elemento nao encontrado");
			}
		}
	}

	public void alterar(int chave, int novoValor) {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			No aux = inicio;
			while (aux.prox != inicio && aux.valor != chave) {
				aux = aux.prox;
			}
			if (aux.valor == chave) {
				aux.valor = novoValor;
			} else {
				System.out.println("Elemento nao encontrado");
			}
		}
	}

	public No buscar(int chave) {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			No aux = inicio;
			while (aux.prox != inicio && aux.valor != chave) {
				aux = aux.prox;
			}
			if (aux.valor == chave) {
				return aux;
			} else {
				System.out.println("Elemento nao encontrado");
			}
		}
		return null;
	}

	public void imprimir() {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			No aux = inicio;
			do {
				System.out.print(aux.valor + " ");
				aux = aux.prox;
			} while (aux != inicio);
		}
		System.out.println();
	}

	public void imprimirDuasVezes() {
		if(inicio==null) {
			System.out.println("Lista vazia");
		}else {
			No aux = inicio;
			int cont = 0;
			do {
				System.out.print(aux.valor+" ");
				aux = aux.prox;
				if(aux==inicio) {
					cont++;					
				}
			}while(cont<2);
		}
		System.out.println("");
	}

}
