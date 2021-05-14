package br.ucsal.fundamentos.ListaDuplamenteENCADEADA;

public class TesteListaDuplamenteEncadeada {
	//Metodo main que executa o programa
	public static void main(String[] args) {
		//Metodo que executa e cria uma nova lista
		executa(new LDE());
	}

	public static void executa(ILDE lista) {
		//Metodo que insere valores na lista
		lista.inserir(2);
		lista.inserir(7);
		lista.inserir(0);
		lista.inserir(9);
		lista.inserir(3);
		
		System.out.println("Esperado: 3 9 0 7 2");
		//Metodo que imprime valores da lista na ordem inversa.
		lista.imprimirAscendente();
		//Metodo que imprime valores da lista na ordem certa.
		System.out.println("Esperado: 2 7 0 9 3");
		lista.imprimirDescendente();
		//Metodo que altera um valor da lista
		lista.alterar(2, 32);
		System.out.println("Esperado: 3 9 0 7 32");
		lista.imprimirAscendente();
		//Metodo que altera um valor da lista
		lista.alterar(3, 93);
		System.out.println("Esperado: 93 9 0 7 32");
		lista.imprimirAscendente();
		//Metodo que altera um valor da lista
		lista.alterar(0, 50);
		System.out.println("Esperado: 93 9 50 7 32");
		lista.imprimirAscendente();
		
		//Metodo que busca um valor na lista
		System.out.println("Esperado: 93");		
		No no1 = lista.buscar(93);
		if(no1!=null) {
			System.out.println(no1.valor);
		}

		//Metodo que busca um valor na lista
		System.out.println("Esperado: 32");		
		No no2 = lista.buscar(32);
		if(no2!=null) {
			System.out.println(no2.valor);
		}

		//Metodo que busca um valor na lista
		System.out.println("Esperado: 50");		
		No no3 = lista.buscar(50);
		if(no3!=null) {
			System.out.println(no3.valor);
		}

		System.out.println("Esperado: Elemento não encontrado!");		
		No no4 = lista.buscar(115);
		if(no4!=null) {
			System.out.println(no4.valor);
		}
		//Metodo que remove um valor da lista.
		lista.remover(93);
		
		System.out.println("Esperado: 9 50 7 32");
		lista.imprimirAscendente();

		System.out.println("Esperado: 32 7 50 9");
		lista.imprimirDescendente();

		//Metodo que remove um valor da lista.
		lista.remover(32);
		
		System.out.println("Esperado: 9 50 7");
		lista.imprimirAscendente();

		System.out.println("Esperado: 7 50 9");
		lista.imprimirDescendente();

		//Metodo que remove um valor da lista.
		lista.remover(50);
		
		System.out.println("Esperado: 9 7");
		lista.imprimirAscendente();

		System.out.println("Esperado: 7 9");
		lista.imprimirDescendente();

		//Metodo que remove um valor da lista.
		lista.remover(9);
		lista.imprimirAscendente();
		
	}
}
