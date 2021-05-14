package br.ucsal.fundamentos.VetorTAD;

public class ExemploVector {
	public static void main(String[] args) {
		//Executa o metodo executar criando um novo array com 6 posicoes.
		executar(new Vector(5));
	}

	private static void executar(IVector vector) {
		
		System.out.println("Esperado null null null null null:");
		//Imprime o array
		vector.imprimir();
		
		//Adiciona ao vetor = add(posicao,valor).
		vector.add(0,1);
		vector.add(1,2);
		vector.add(2,3);
		vector.add(3,4);
		vector.add(4,5);
		System.out.println("Esperado 1 2 3 4 5:");
		vector.imprimir();
		
		//Adiciona o elemento mais uma posicao ao vetor a 6.
		vector.addElement(6);
		System.out.println("Esperado 1 2 3 4 5 6:");
		vector.imprimir();
		

		//Faz o subList dos valores nesse intervalo.
		Vector v1 = vector.subList(0, 3);
		System.out.println("Esperado 1 2 3:");
		v1.imprimir();
		
		
		//Faz o subList dos valores nesse intervalo.
		Vector v2 = vector.subList(4, 6);
		System.out.println("Esperado 5 6:");
		v2.imprimir();
		
		
		System.out.println("Esperado 0:");	
		//1 ocorrencia do 1 no vetor.
		System.out.println(vector.indexOf(1));
		System.out.println("Esperado -1:");
		//Primeira ocorrencia do 21 no vetor, como 21 nao aparece no vetor é falsa e retorna -1.
		System.out.println(vector.indexOf(21));
		System.out.println("Esperado -1:");
		//Primeira ocorrencia do 10 no vetor.
		System.out.println(vector.indexOf(10));
		System.out.println("Esperado 5:");
		//Primeira ocorrencia do 6 no vetor.
		System.out.println(vector.indexOf(6));
		
		System.out.println("Esperado 0:");
		//Ultima ocorrencia do um no vetor.
		System.out.println(vector.lastIndexOf(1));
		System.out.println("Esperado 1:");
		//Ultima ocorrencia do 2 no vetor.
		System.out.println(vector.lastIndexOf(2));
		System.out.println("Esperado -1:");
		//Ultima ocorrencia do 11 no vetor,como nao existe retorna -1.
		System.out.println(vector.lastIndexOf(11));
		System.out.println("Esperado -1:");
		//Ultima ocorrencia do 11 no vetor,como nao existe retorna -1.
		System.out.println(vector.lastIndexOf(9));
		
		//Aqui retorna todos os elementos no array na posicao 0 a 5.
		vector.ensureCapacity(5);
		System.out.println("Esperado 1 2 3 4 5 6:");
		vector.imprimir();
		//Aqui retorna todos os elementos no array na posicao 0 a 25.
		System.out.println("Esperado 1 2 3 4 5 6 null null null null null null null null null null null null null null null null null null null :");
		vector.ensureCapacity(25);
		vector.imprimir();
		
		//Limpa o array.
		vector.clear();
		System.out.println("Esperado null null null null null null null null null null null null null null null null null null null null null null null null null");
		vector.imprimir();

	}
}
