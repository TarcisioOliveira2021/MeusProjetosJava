package br.ucsal.fundamentos.ListaCircular;

public class LCO implements ILC {

	No inicio = null;
	No fim = null;

	// Metodo que insere ordenado.
	public void inserir(int valor) {
		No novo = new No();
		novo.valor = valor;
		if (inicio == null) {
			inicio = novo;
			fim = novo;
			fim.prox = inicio;
		} else {
			No ant = null;
			No aux = inicio;
			while (aux != fim && valor > aux.valor) {
				ant = aux;
				aux = aux.prox;
			}
			if (ant == null && valor < aux.valor) {
				novo.prox = inicio;
				inicio = novo;
				fim.prox = inicio;
			} else if (aux.prox == inicio && valor > aux.valor) {
				aux.prox = novo;
				novo.prox = inicio;
				fim = novo;
			} else {
				ant.prox = novo;
				novo.prox = aux;
			}
		}
	}

	@Override
	public void remover(int chave) {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterar(int chave, int novoValor) {
		// TODO Auto-generated method stub

	}

	@Override
	public No buscar(int chave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
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

	}

	@Override
	public void imprimirDuasVezes() {
		// TODO Auto-generated method stub

	}

}
