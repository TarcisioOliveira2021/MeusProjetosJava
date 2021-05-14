package br.ucsal.bes20192.poo.aula14.interfaceexemplo;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exemplo1 {

	public static void main(String[] args) {

		Deque<String> nomes = new LinkedList<>();
		nomes.add("claudio");
		nomes.spliterator();
		nomes.addFirst("claudio");
		nomes.addLast("maria");

		usarLista(new ArrayList<>());
		usarLista(new LinkedList<>());
		usarLista(new Vector<>());
		usarLista(new ClaudioList<>());
	}

	private static void usarLista(List<String> lista) {
		lista.add("claudio");
		lista.get(1);
		lista.clear();
	}

}
