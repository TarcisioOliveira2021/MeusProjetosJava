package listaDuplamente;

public class LDE implements ILDE {
	No inicio = null;
	
	public void inserir(int valor) {
	No novo = new No();
	novo.valor = valor;
		if(inicio==null) {
			inicio = null;
		}else {
			novo.prox = inicio;
			inicio.ant = novo;
			inicio = novo;
		}
		
	}

	public void remover(int valor) {
		if(inicio==null) {
			System.out.println("Lista vazia");
		}else {
			No aux = inicio;
			while(aux.prox!=null&&aux.valor!=valor) {
				aux=aux.prox;
			}
			if(aux.valor==valor) {
				if(aux.ant==null) {
					inicio = aux.prox;
					inicio.ant = null;
					aux = null;
				}else if(aux.prox==null) {
					aux.ant.prox = null; 
					aux = null;
				}else if(aux.ant!=null&&aux.prox!=null){
					aux.ant.prox = aux.prox;
					aux.prox = aux.ant;
					aux = null;
				}else {
					System.out.println("Elemento nao encontrado! ");					
				}
			}
		}
	}

	public No buscar(int chave) {
		if(inicio==null) {
			System.out.println("Lista vazia");
		}else {
			No aux = inicio;
			while(aux.prox!=null&&aux.valor!=chave) {
				aux = aux.prox;
			}
			if(aux.valor==chave) {
				return aux;
			}else {
			}
		}
		return null;
	}

	public void alterar(int chave, int novoValor) {
		if(inicio==null) {
			System.out.println("Lista vazia");
		}else {
			No aux = inicio;
			while(aux.prox!=null&&aux.valor!=chave) {
				aux =aux.prox;
			}
			if(aux.valor==chave) {
				aux.valor= novoValor;
			}else {
				System.out.println("Elemento nao encontrado.");
			}
		}
		
	}


	public void imprimirCrescente() {
		if(inicio==null) {
			System.out.println("Lista vazia");
		}else {
			No aux = inicio;
			while(aux!=null) {
				System.out.println(aux.valor+ " ");
				aux = aux.prox;
			}
		}
		
	}

	public void imprimirDescrescente() {
		if(inicio==null) {
			System.out.println("Lista vazia");
		}else {
			No aux = inicio;
			while(aux.prox!=null) {
				System.out.println(aux.valor+ " ");
				aux = aux.prox;
			}
			while(aux!=null) {
				System.out.println(aux.valor+ " ");
				aux = aux.ant;
			}
		}
		
	}


	public void inserirOrdenado(int valor) {
		No novo = new No();
		novo.valor = valor;
			if(inicio==null) {
				inicio = null;
			}else {
				
				novo.prox = inicio;
				inicio.ant = novo;
				inicio = novo;
			}
			
		}
		
	}
	
