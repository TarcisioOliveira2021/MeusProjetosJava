
public class TestePilha {

	public static void main(String[] args) {

		executa(new Pilha());

	}

	public static void executa(IPilha pilha) {
	
		System.out.println("Esperado: Pilha vazia!");
		pilha.imprimir();
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);		
		
		System.out.println("Esperado: 4 3 2 1");
		pilha.imprimir();

		No no1 = pilha.pop();
		if(no1!=null) {
			System.out.println("Esperado: 4 ");
			System.out.println(String.format(" %d ", no1.valor));
		}
		
		System.out.println("Esperado: 3 2 1");
		pilha.imprimir();

	}
}
