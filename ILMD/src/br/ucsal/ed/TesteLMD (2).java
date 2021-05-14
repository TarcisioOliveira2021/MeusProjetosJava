
public class TesteLMD {

	public static void main(String[] args) {

		executa(new LMD());
		
	}
	
	public static void executa(ILMD lista) {
		
		System.out.println("Teste insere------------------------------------------------------------------------");
		
		lista.insere(1, "Papelaria");
		lista.insere(2, "Material de limpeza");
		lista.insere(3, "Alimentos");
		lista.insere(4, "Eletr�nicos");
		lista.insere(5, "M�veis");
		
		System.out.println("Esperado: Papelaria, Material de limpeza, Alimentos, Eletr�nicos, M�veis");
		lista.imprimeTudo();
		
		System.out.println("Teste alterar categoria------------------------------------------------------------------------");	
		
		lista.alterar(1, "Nova papelaria");
		lista.alterar(3, "Novo alimentos");
		lista.alterar(5, "Novo m�veis");
		
		System.out.println("Esperado: Nova papelaria, Material de limpeza, Novo alimentos, Eletr�nicos, Novo m�veis");
		lista.imprimeTudo();	
		
		System.out.println("Categoria n�o encontrada!");
		lista.alterar(7, "Novo eletrodom�sticos");
		
		System.out.println("Teste buscar------------------------------------------------------------------------");
		
		System.out.println("Esperado: Nova papelaria");
		Noc no1 = lista.buscar(1);
		if (no1!=null)
			System.out.println(no1.descricao);
		
		System.out.println("Esperado: Novo alimentos");
		Noc no2 = lista.buscar(3);
		if (no2!=null)
			System.out.println(no2.descricao);
		
		System.out.println("Esperado: Novo m�veis");
		Noc no3 = lista.buscar(5);
		if (no3!=null)
			System.out.println(no3.descricao);

		System.out.println("Teste insere n�------------------------------------------------------------------------");
		
		
		lista.insereNo(1, 1);
		lista.insereNo(1, 2);
		lista.insereNo(1, 3);

		lista.insereNo(3, 4);
		lista.insereNo(3, 5);
		
		lista.insereNo(5, 6);
		
		System.out.println("Esperado: Nova papelaria 1 2 3, Material de limpeza, Novo alimentos 4 5, Eletr�nicos, Novo m�veis 6");
		lista.imprimeTudo();
		
		
		System.out.println("Teste alterar n�------------------------------------------------------------------------");

		lista.alterarNo(1, 1, 10);
		lista.alterarNo(3, 5, 50);
		lista.alterarNo(5, 6, 60);

		System.out.println("Esperado: Nova papelaria 10 2 3, Material de limpeza, Novo alimentos 4 50, Eletr�nicos, Novo m�veis 60");
		lista.imprimeTudo();
		
		System.out.println("Esperado: N� n�o encontrado!");
		lista.alterarNo(5, 7, 70);	
		
		System.out.println("Teste buscar n�------------------------------------------------------------------------");

		System.out.println("Esperado: 3");
		No no4 = lista.buscarNo(1, 3);
		if(no4!=null) {
			System.out.println(no4.valor);
		}
		
		System.out.println("Esperado: 50");
		No no5 = lista.buscarNo(3, 50);
		if(no5!=null) {
			System.out.println(no5.valor);
		}

		System.out.println("Esperado: 60");
		No no6 = lista.buscarNo(5, 60);
		if(no6!=null) {
			System.out.println(no6.valor);
		}

		
		System.out.println("Esperado: Elemento n�o encontrado!");
		No no7 = lista.buscarNo(5, 70);
		if(no7!=null) {
			System.out.println(no7.valor);
		}

		System.out.println("Teste remover n�------------------------------------------------------------------------");
		
		lista.removeNo(1, 2);
		System.out.println("Esperado: Nova papelaria 10 3, Material de limpeza, Novo alimentos 4 50, Eletr�nicos, Novo m�veis 60");
		lista.imprimeTudo();
		
		lista.removeNo(3, 50);
		System.out.println("Esperado: Nova papelaria 10 3, Material de limpeza, Novo alimentos 4, Eletr�nicos, Novo m�veis 60");
		lista.imprimeTudo();
		
		lista.removeNo(5, 60);
		System.out.println("Esperado: Nova papelaria 10 3, Material de limpeza, Novo alimentos 4, Eletr�nicos, Novo m�veis");
		lista.imprimeTudo();
		
		lista.removeNo(5, 70);
		System.out.println("Esperado: Elemento n�o encontrado!");
		lista.imprimeTudo();
		
		System.out.println("Teste imprimir categoria------------------------------------------------------------------------");
		
		System.out.println("Esperado: Nova papelaria 10 3");
		lista.imprimeCategoria(1);
		
		System.out.println("Esperado: Novo alimentos 4");
		lista.imprimeCategoria(3);
		
		System.out.println("Esperado: Novo m�veis");
		lista.imprimeCategoria(5);
		
		System.out.println("Esperado: Categoria n�o encontrada!");
		lista.imprimeCategoria(7);
		
		System.out.println("Teste remover categoria------------------------------------------------------------------------");
		
		lista.remove(3);
		System.out.println("Esperado: Nova papelaria 10 3, Material de limpeza, Eletr�nicos, Novo m�veis");
		lista.imprimeTudo();

		lista.remove(1);
		System.out.println("Esperado: Material de limpeza, Eletr�nicos, Novo m�veis");
		lista.imprimeTudo();

		lista.remove(5);
		System.out.println("Esperado: Material de limpeza, Eletr�nicos");
		lista.imprimeTudo();


	}
	
	

}
