package fundamentosAULA14.InterfaceExemplo;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exemplo1 {
	public static void main(String[] args) {
	//Deque == pilha ou fila
	Deque <String> nomes = new LinkedList<>();
	//Adiciona na lista.
	nomes.add("A");
	nomes.spliterator();
	nomes.addFirst("A");
	nomes.addLast("B");
	
	usarLista(new ArrayList<>());
	usarLista(new Vector<>());
	usarLista(new LinkedList<>());
	usarLista(new MinhaList<>());
	}

	private static void usarLista(List<String> lista) {
		//chama ao metodo add que adiciona na lista um elemento "x".
		lista.add("A");
		//Chamada ao metodo get que retorna um elemento na posicao informada.
		lista.get(1);
		//Chamada ao metodo clear que limpa a lista
		lista.clear();
	}
}
