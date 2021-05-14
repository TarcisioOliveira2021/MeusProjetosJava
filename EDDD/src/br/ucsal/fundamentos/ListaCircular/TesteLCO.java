package br.ucsal.fundamentos.ListaCircular;

public class TesteLCO {
	public static void main(String[] args) {
		executar(new LCO());
	}

	private static void executar(LCO lista) {
		lista.inserir(100);
		lista.inserir(120);
		lista.inserir(560);
		lista.inserir(10000);
		lista.inserir(1);
		lista.inserir(0);
		lista.inserir(10);
		
		System.out.println("Lista:");
		lista.imprimir();
		
	}
}
