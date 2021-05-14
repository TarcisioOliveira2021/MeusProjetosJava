package br.ucasl.ED_2019_2_avaliacao;

public class LDE implements ILDE {
	No inicio = null;
	int qtdElementos = 0;

	public void insere(int valor) {
		No novo = new No();
		novo.valor = valor;
		if (inicio == null) {
			inicio = novo;
		} else {
			No aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			novo.ant = aux;
			aux.prox = novo;
		}
		qtdElementos++;
	}

	public void limpar() {
		if (inicio == null) {
			System.out.println("Lista vazia!");
		} else {
			qtdElementos = 0;
			if (qtdElementos == 1) {
				inicio = null;
			} else {
				while (inicio.prox != null) {
					inicio = inicio.prox;
					inicio.ant = null;
				}
				inicio = null;
			}
		}
	}

	public int conta() {
		return qtdElementos;
	}

	public void remove(int valor) {
		if (inicio == null) {
			System.out.println("Lista vazia!");
		} else {
			No aux = inicio;
			while (aux.prox != null && aux.valor != valor) {
				aux = aux.prox;
			}
			if (aux.valor == valor) {
				if (qtdElementos == 1) {
					inicio = null;
					aux = null;
				} else if (aux.ant == null && qtdElementos > 1) {
					inicio = inicio.prox;
					inicio.ant = null;
					aux.prox = null;
					aux = null;
				} else if (aux.prox == null) {
					aux = aux.ant;
					aux.prox = null;
					
				} else {
					aux.ant.prox = aux.prox;
					aux.prox.ant = aux.ant;
					aux.prox = null;
					aux.ant = null;
					aux = null;
				}
				qtdElementos--;
			} else {
				System.out.println("Elemento não encontrado!");
			}
		}
	}

	public ILDE inverte() {
		LDE novaLista = new LDE();
		if (inicio == null) {
			System.out.println("Lista vazia!");
		} else {
			
			No aux = inicio;
			while(aux.prox!=null) {
				aux = aux.prox;
			}
			while(aux!=null) {
				novaLista.insere(aux.valor);
				aux = aux.ant;
			}
		}
		return novaLista;
	}
	
	public void imprime() {
		if(inicio==null) {
			System.out.println("Lista vazia!");
		}else {
			No aux = inicio;
			while(aux!=null) {
				System.out.print(aux.valor+" ");
				aux = aux.prox;
			}
			System.out.println();
		}
	}

}
