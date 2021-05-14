package br.ucsal.fundamentos.ListaSimplesmenteENCADEADA;

public class TesteListaSimplesmenteEncadeadaOrganizada {
	public static void main(String[] args) {
		//Metodo que executa o programa passando como parametro uma nova lista: LSEO.
		executa(new LSEO());
	}
	//Metodo que executa Que usa como parametro uma ILSE lista 
	public static void executa(ILSE lista) {
		//Usa para incluir na lista e organiza a lista do menor para o maior.
		lista.inserir(1);
		lista.inserir(5);
		lista.inserir(4);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(0);
		lista.inserir(7);
		lista.inserir(6);		
		lista.imprimir();
		//Criacao de um No novo para fazer a busca, isto é uma variavel para fazer a comparacao.
		No no1 = lista.buscar(2);
		//Caso o no1 for diferente de null, o busca passa a lista e esta condicao garante que vai passar do inicio ate o fim da lista.
		if(no1!=null) {
			//Aqui escreve o valor caso ele esteja
			System.out.println(no1.valor);
			//Se nao encontrar.
		}else {
			System.out.println("Chave não encontrada!");
		}
		//
		No no2 = lista.buscar(0);
		if(no2!=null) {
			System.out.println(no2.valor);
		}else {
			System.out.println("Chave não encontrada!");
		}
		//
		No no3 = lista.buscar(7);
		if(no3!=null) {
			System.out.println(no3.valor);
		}else {
			System.out.println("Chave não encontrada!");
		}
		
		//
		No no4 = lista.buscar(100);
		if(no4!=null) {
			System.out.println(no4.valor);
		}else {
			System.out.println("Chave não encontrada!");
		}

		//Altera os valores da lista o 2 pelo 100
		lista.alterar(2, 100);
		//Imprime a lista ja alterada.
		lista.imprimir();
		
		//
		lista.alterar(3, 13);
		//
		lista.imprimir();
		//
		lista.alterar(7, 17);
		//
		lista.imprimir();
		
		//Remove o valor da lista
		lista.remover(100);
		//imprime a lista.
		lista.imprimir();
		//
		lista.remover(17);
		//
		lista.imprimir();		
		//
		lista.remover(13);
		//
		lista.imprimir();		

	}
}
