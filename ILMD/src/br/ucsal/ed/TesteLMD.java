package br.ucsal.ed;

public class TesteLMD {
	public static void main(String[] args) {
		executar(new LMD());
	}

	private static void executar(ILMD lista) {
		
		lista.insere(0, "Produtos de limpeza");
		lista.insere(1, "Materias de escritório");
		lista.insere(2, "Alimentação");
		lista.insere(3, "Briquedos");
		lista.insere(4, "DVD");
		
//		lista.remove(0);
//		lista.remove(2);
//		lista.remove(4);
		
		Noc v1 = lista.buscar(0);
		if (v1!=null) {
			System.out.println("Categoria " + v1.descricao);
		}
		
		Noc v2 = lista.buscar(2);
		
		if (v2!=null) {
			System.out.println("Categoria " + v2.descricao);
		}
		
		Noc v3 = lista.buscar(4);
		if (v3!=null) {
			System.out.println("Categoria " + v3.descricao);
		}
		
		lista.alterar(0, "Limpeza geral");
		lista.alterar(2, "Comer comer");
		lista.alterar(4, "Filmes");
		
		
		lista.insereNo(1, 0);
		lista.insereNo(2, 0);
		lista.insereNo(3, 0);
		lista.insereNo(4, 0);
		lista.insereNo(5, 0);
		
		lista.insereNo(1, 1);
		lista.insereNo(2, 1);
		lista.insereNo(3, 1);
		lista.insereNo(4, 1);
		lista.insereNo(5, 1);
		
		lista.insereNo(1, 2);
		lista.insereNo(2, 2);
		lista.insereNo(3, 2);
		lista.insereNo(4, 2);
		lista.insereNo(5, 2);
		
		lista.insereNo(1, 3);
		lista.insereNo(2, 3);
		lista.insereNo(3, 3);
		lista.insereNo(4, 3);
		lista.insereNo(5, 3);
		
		lista.insereNo(1, 4);
		lista.insereNo(2, 4);
		lista.insereNo(3, 4);
		lista.insereNo(4, 4);
		lista.insereNo(5, 4);
	
		lista.imprimeCategoria(0);
		
//		lista.removeNo(1, 0);
//		lista.removeNo(3, 0);
//		lista.removeNo(5, 0);
		
		lista.imprimeCategoria(0);
		
		No ele1 = lista.burcarNo(0, 1);
		
		if (ele1 != null) {
			System.out.println("Elemento: " + ele1.valor);
		}
		
		No ele2 = lista.burcarNo(0, 3);
		
		if (ele2 != null) {
			System.out.println("Elemento: " + ele2.valor);
		}
		
		No ele3 = lista.burcarNo(0, 5);
		
		if (ele3 != null) {
			System.out.println("Elemento: " + ele3.valor);
		}
		
		lista.alterar(0, 1, 10);
		lista.alterar(0, 3, 30);
		lista.alterar(0, 5, 50);
		
		lista.imprimeCategoria(0);
		
		System.out.println("Imprimir tudo: ");
		lista.imprimeTudo();
	}
}
