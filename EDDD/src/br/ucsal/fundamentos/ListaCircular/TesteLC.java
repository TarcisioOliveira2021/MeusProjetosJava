package br.ucsal.fundamentos.ListaCircular;

public class TesteLC {
	public static void main(String[] args) {
		executar(new LC());
	}

	public static void executar(LC lista) {

		lista.inserir(7);
		lista.inserir(3);
		lista.inserir(9);
		lista.inserir(4);
		lista.inserir(6);
		
		System.out.println("Esperado: 7 3 9 4 6");
		lista.imprimir();
		
		System.out.println("Esperado: 7 3 9 4 6 7 3 9 4 6");		
		lista.imprimirDuasVezes();
		
		System.out.println("Esperado: 7");
		No no1 = lista.buscar(7);
		if(no1!=null)
			System.out.println(no1.valor);
		
		System.out.println("Esperado: 9");
		No no2 = lista.buscar(9);
		if(no2!=null)
			System.out.println(no2.valor);

		System.out.println("Esperado: 6");
		No no3 = lista.buscar(6);
		if(no3!=null)
			System.out.println(no3.valor);

		System.out.println("Esperado: Elemento não encontrado!");
		No no4 = lista.buscar(15);
		if(no4!=null)
			System.out.println(no4.valor);
		
		lista.alterar(7, 17);

		System.out.println("Esperado: 17 3 9 4 6");
		lista.imprimir();
		
		System.out.println("Esperado: 17 3 9 4 6 17 3 9 4 6");		
		lista.imprimirDuasVezes();
		
		lista.alterar(9, 29);

		System.out.println("Esperado: 17 3 29 4 6");
		lista.imprimir();
		
		System.out.println("Esperado: 17 3 29 4 6 17 3 29 4 6");		
		lista.imprimirDuasVezes();
		
		lista.alterar(6, 36);

		System.out.println("Esperado: 17 3 29 4 36");
		lista.imprimir();
		
		System.out.println("Esperado: 17 3 29 4 36 17 3 29 4 36");		
		lista.imprimirDuasVezes();
		
		lista.remover(17);
		
		System.out.println("Esperado: 3 29 4 36");
		lista.imprimir();
		
		System.out.println("Esperado: 3 29 4 36 3 29 4 36");		
		lista.imprimirDuasVezes();
		
		lista.remover(36);
		
		System.out.println("Esperado: 3 29 4");
		lista.imprimir();
		
		System.out.println("Esperado: 3 29 4 3 29 4");		
		lista.imprimirDuasVezes();
		
		lista.remover(29);
		
		System.out.println("Esperado: 3 4");
		lista.imprimir();
		
		System.out.println("Esperado: 3 4 3 4");		
		lista.imprimirDuasVezes();
		
		lista.inserir(27);
		lista.inserir(32);
		lista.inserir(98);
		lista.inserir(44);
		lista.inserir(61);
		
		System.out.println("Esperado: 3 4 27 32 98 44 61");
		lista.imprimir();
		
		System.out.println("Esperado: 3 4 27 32 98 44 61 3 4 27 32 98 44 61");		
		lista.imprimirDuasVezes();
		
	}
}
