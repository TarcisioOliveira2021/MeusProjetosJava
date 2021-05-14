package br.ucsal.fundamentos.ListaSimplesmenteENCADEADA;

public class LSEO implements ILSE {
	No inicio = null;

	public void inserir(int valor) {

		No novo = new No();
		novo.valor = valor;
		
		if(inicio==null) {
			inicio = novo;
		}else {
			No ant = null;
			No aux = inicio;
			while(aux.prox!=null&&aux.valor<valor) {
				ant=aux;
				aux=aux.prox;
			}
			//Organiza os valores
			if(ant==null&&novo.valor<aux.valor) {
				novo.prox=inicio;
				inicio=novo;
			}else if(aux.prox==null&&novo.valor>aux.valor) {
				aux.prox=novo;
			}else {
				ant.prox=novo;
				novo.prox=aux;
			}
			
		}


	}


	public void remover(int valor) {

		if(inicio==null) {
			System.out.println("Lista vazia!");
		}else {
			No ant = null;
			No aux = inicio;
			while(aux.prox!=null&&aux.valor!=valor) {
				ant=aux;
				aux=aux.prox;
			}
			if(aux.valor==valor) {
				if(ant==null) {
					inicio=inicio.prox;
				}else if(aux.prox==null) {
					ant.prox=null;
					aux=null;
				}else {
					ant.prox=aux.prox;
					aux=null;
				}
			}else {
				System.out.println("Elemento não encontrado!");
			}
			
		}

	}


	public No buscar(int chave) {

		if(inicio==null) {
			System.out.println("Lista vazia!");
		}else {
			No aux = inicio;
			while(aux.prox!=null&&aux.valor!=chave) {
				aux=aux.prox;
			}
			if(aux.valor==chave) {
				return aux;
			}
		}
		
		return null;
	}


	public void alterar(int chave, int novoValor) {

		if(inicio==null) {
			System.out.println("Lista vazia!");
		}else {
			No aux = inicio;
			while(aux.prox!=null&&aux.valor!=chave) {
				aux=aux.prox;
			}
			if(aux.valor==chave) {
				aux.valor=novoValor ;
			}

		}

	}



	public void imprimir() {

		if(inicio==null) {
			System.out.println("Lista vazia!");
		}else {
			No aux = inicio;
			while(aux!=null) {
				System.out.print(aux.valor + " ");
				aux=aux.prox;
			}
		}
		System.out.println("");
	}

}
