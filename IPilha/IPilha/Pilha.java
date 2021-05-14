
public class Pilha implements IPilha {

	No topo = null;

	public void push(int valor) {

		No novo = new No();
		novo.valor = valor;
		novo.prox = topo;
		topo = novo;

	}


	public No pop() {

		No aux = topo;
		
		if(topo!=null) {
			topo = topo.prox;
		}
		
		return aux;
	}


	public void imprimir() {

		if(topo==null) {
			System.out.println("Pilha vazia!");
		}else {
			No aux = topo;
			while(aux!=null) {
				System.out.print(String.format(" %d", aux.valor));
				aux = aux.prox;
			}
		}
		System.out.println("");
	}

}
