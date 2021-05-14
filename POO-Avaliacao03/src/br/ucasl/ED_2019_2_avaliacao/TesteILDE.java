package br.ucasl.ED_2019_2_avaliacao;


public class TesteILDE {

	
	public static void main(String[] args) {
		
		executa(new LDE());		
		
	}
	
	public static void executa(ILDE lista) {
		
		lista.insere(1);
		lista.insere(2);
		lista.insere(7);
		lista.insere(4);
		lista.insere(9);
		lista.insere(0);
		lista.insere(3);

		System.out.println("Esperado: 1 2 7 4 9 0 3");
		lista.imprime();
		
		System.out.println("Esperado: 7");
		System.out.println(lista.conta());
		
		lista.remove(1);
		System.out.println("Esperado: 2 7 4 9 0 3");
		lista.imprime();

		System.out.println("Esperado: 6");
		System.out.println(lista.conta());

		lista.remove(3);
		System.out.println("Esperado: 2 7 4 9 0");
		lista.imprime();
		
		System.out.println("Esperado: 5");
		System.out.println(lista.conta());

		lista.remove(9);
		System.out.println("Esperado: 2 7 4 0");
		lista.imprime();
		
		System.out.println("Esperado: 4");
		System.out.println(lista.conta());

		lista.remove(25);
		System.out.println("Esperado: Elemento não encontrado!");
		
		System.out.println("Esperado: 4");
		System.out.println(lista.conta());

		lista.insere(1);
		lista.insere(8);
		lista.insere(6);

		System.out.println("Esperado: 2 7 4 0 1 8 6");
		lista.imprime();

		System.out.println("Esperado: 7");
		System.out.println(lista.conta());

		ILDE novaLista = lista.inverte();

		lista.limpar();
		System.out.println("Esperado: Lista vazia!");
		lista.imprime();
		

		System.out.println("Esperado: 6 8 1 0 4 7 2");
		novaLista.imprime();
		
		novaLista.remove(6);
		System.out.println("Esperado: 8 1 0 4 7 2");
		novaLista.imprime();

		System.out.println("Esperado: 6");
		System.out.println(novaLista.conta());

		novaLista.remove(2);
		System.out.println("Esperado: 8 1 0 4 7");
		novaLista.imprime();

		System.out.println("Esperado: 5");
		System.out.println(novaLista.conta());

		novaLista.remove(0);
		System.out.println("Esperado: 8 1 4 7");
		novaLista.imprime();

		System.out.println("Esperado: 4");
		System.out.println(novaLista.conta());

		novaLista.remove(8);
		System.out.println("Esperado: 1 4 7");
		novaLista.imprime();

		System.out.println("Esperado: 3");
		System.out.println(novaLista.conta());
		
		novaLista.remove(7);
		System.out.println("Esperado: 1 4");
		novaLista.imprime();

		System.out.println("Esperado: 2");
		System.out.println(novaLista.conta());
		
		novaLista.remove(1);
		System.out.println("Esperado: 4");
		novaLista.imprime();

		System.out.println("Esperado: 1");
		System.out.println(novaLista.conta());

		novaLista.remove(4);
		System.out.println("Esperado: Lista vazia!");
		novaLista.imprime();

		System.out.println("Esperado: 0");
		System.out.println(novaLista.conta());

		System.out.println("Esperado: Lista vazia!");
		lista = novaLista.inverte();

		
		System.out.println("Esperado: 0");
		System.out.println(lista.conta());
		
		System.out.println("Esperado: Lista vazia!");
		lista.imprime();
		
	}
	
}
