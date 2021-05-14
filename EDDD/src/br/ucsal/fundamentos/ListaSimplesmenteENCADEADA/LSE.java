package br.ucsal.fundamentos.ListaSimplesmenteENCADEADA;

public class LSE implements ILSE {

	//Criacao de um No chamado inicio que esta vazio.
	//Obs = nunca se modifica o inicio pois isso pode destruir a lista.
	No inicio = null;
	
	//Metodo que insere um valor na lista.
	public void inserir(int valor) {
		//Criacao de um novo No
		No novo = new No();
		//Esse No que tem como atributo valor, recebe o valor passado por parametro.
		novo.valor = valor;
		//Caso o inicio esteja vazio.
		if(inicio==null) {
			//inicio recebe o novo no.
			inicio = novo;
		//Caso nao esteja
		}else {
			//É criado um no auxiliar que recebe o inicio.
			No aux = inicio;
			//Enquanto o aux.prox for diferente de vazio.
			while(aux.prox!=null) {
				//O aux recebe o prox.
				aux = aux.prox;
			}
			// O aux.prox recebe o No novo que recebe o valor passado por parametro.
			aux.prox = novo;
		}
	}

	//Metodo que remove um valor da lista.
	public void remover(int valor) {
		//Caso a lista esteja vazia
		if(inicio==null) {
			//Escreve
			System.out.println("Lista vazia.");
		//Se nao
		}else {
			//O no ant = vazio e o no aux = inicio.
			No ant = null;
			No aux = inicio;
			//Sempre fazer as condicoes falsas pois aumenta o desempenho
			//Enquanto o aux.prox != de vazio e aux.valor != do valor passado por parametro.
			//Percorre a lista
			while(aux.prox!=null&&aux.valor!=valor) {
				//O anterior vai ser igual ao auxiliar
				ant = aux;
				//E o aux é igual ao aux.prox.
				aux = aux.prox;
			}
			//Caso o valor do auxilar = aux.valor for igual ao valor passado por parametro.
			if(aux.valor==valor) {
			//Se o ant == vazio isto é se o valor a remover estiver no inicio da lista.
				if(ant==null) {
					//O valor do inicio vai ser o inicio.prox removendo o valor anterior
					//Assim o garbage collector elemina esse valor pois ngm aponta para ele.
					inicio = inicio.prox;
				}
				// Se entao o aux.prox = vazio , isto é se o valor que eu quero remover estiver
				//no final da lista.
				else if(aux.prox==null) {
					//O ant.prox recebe o aux.prox isto é o valor antes do final recebe o posto de final.
					ant.prox = aux.prox;
					//A referencia morre.
					aux=null;
				//Se nao isto é o valor no meio da lista.
				}else {
					//O ant.prox = vai receber o valor de aux.prox;
					// e o valor que fica no meio : o aux recebe vazio deixando de existir e apagando
					//o elemento do meio.
					ant.prox=aux.prox;
					aux = null;
				}
			//Caso o aux.valor seja != do valor passado no parametro:
			}else {
				//O elemento nao existe.
				System.out.println("Elemento nao encontrado.");
			}
		}
	}
	//Metodo que busca um elemento.
	public No buscar(int chave) {
		//Caso o inicio esteja vazio.
		if(inicio==null) {
			//Imprime que a lista esta vazia.
			System.out.println("Lista vazia.");
		//Se nao 
		}else {
			//O aux = inicio;
			No aux = inicio;
			//Percorre a lista enquanto o aux.prox!= vazio isto é enquanto nao tenha chegado no fim
			//e enquanto o valor do aux: aux.prox seja diferente da chave passada por parametro (o valor que agt busca).
			while(aux.prox!=null&&aux.valor!=chave) {
				// O auxilar recebe o proximo valor: aux.prox.
				aux = aux.prox;
			}
			//Se o aux: aux.valor , for igual a chave: o valor passado por parametro.
			if(aux.valor==chave) {
				//Entao retorna o aux.
				return aux;
			}
		}
		//Caso nao acha retorna null:vazio.
		return null;
	}
	//Altera um valor na lista por outro inserido no parametro: novoValor.
	public void alterar(int chave, int novoValor) { 
		//Caso a lista esteja vazia.
		if(inicio==null) {
			System.out.println("Lista vazia.");
		//Caso a lista nao esteja vazia.
		}else {
			//No aux recebe o inicio 
			No aux = inicio;
			//Percorre a lista 
			while(aux.prox!=null&&aux.valor!=chave) {
				//enquanto aux.prox != de vazio isto é: enquanto nao for o fim da lista
				//e o aux.valor = valor do auxiliar for diferente da chave.
				//O aux recebe o aux.prox que é o novo valor inserido no metodo inserir.
				aux = aux.prox;
			}
			//Caso o valor do aux: aux.valor for igual a chave.
			if(aux.valor==chave) {
				//O valor da lista e trocado pelo o novoValor passado por parametro.
				aux.valor = novoValor;
			//Se nao 
			}else {
				//Escreve
				System.out.println("Elemento nao encontrado");
			}
		}
	}
	
	
	//Metodo que imprime a lista.
	public void imprimir() {
		//Caso a lista esteja vazia
		if(inicio==null) {
			System.out.println("Lista vazia");
		//Caso nao esteja
		}else {
			//Varre a lista
			No aux = inicio;
			//Enquanto a lista nao chegar no final.
			while(aux!=null) {
				//Escreve os valores na lista.
				System.out.print(aux.valor+" ");
				//O aux recebe o proximo valor e vai escrevendo um por um ate a lista chegar no fim isto é: (aux==null).
				aux = aux.prox;
			}
		}
		System.out.println();
	}

}
