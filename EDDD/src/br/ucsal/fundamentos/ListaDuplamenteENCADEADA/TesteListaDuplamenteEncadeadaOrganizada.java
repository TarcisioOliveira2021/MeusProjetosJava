package br.ucsal.fundamentos.ListaDuplamenteENCADEADA;

public class TesteListaDuplamenteEncadeadaOrganizada {
	public static void main(String[] args) {
		//Metodo que executa e cria uma nova lista
		executa(new LDEO());
	}

	public static void executa(ILDE lista) {
		//Metodo que insere valores na lista
		lista.inserir(2);
		lista.inserir(7);
		lista.inserir(0);
		lista.inserir(9);
		lista.inserir(3);
		System.out.println("Lista: ");
		lista.imprimirAscendente();
		
	}
}
