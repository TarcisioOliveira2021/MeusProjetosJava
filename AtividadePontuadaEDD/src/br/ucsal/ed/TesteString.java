package br.ucsal.ed;

public class TesteString {
	public static void main(java.lang.String[]  args) {
		executa(new String());

	}

	static void executa(IString string){
		String nova = new String();
		int quantidade = string.length();
		char valor = string.charAt(0);
		boolean ehIgual = string.equals(nova);
		boolean iniciaCom = string.startsWith(nova);
		boolean terminaCom = string.endWith(nova);
		int indicePLetra = string.indexOf('a');
		int indiceULetra = string.lastIndexOf('a');

		System.out.println("Quantidade de elementos: " + quantidade);
		
		System.out.println("Valor na posicao informada: " + valor);
		
		if (ehIgual) {
			System.out.println("A primeira String é igual a segunda String!!");
		}else {
			System.out.println("A primeira String não é igual a segunda String!!");
		}
	
		if (iniciaCom) {
			System.out.println("A primeira String inicia com a segunda String!!");
		}else {
			System.out.println("A primeira String não inicia com a segunda String!!");
		}
		
		if (terminaCom) {
			System.out.println("A primeira String termina com a segunda String!!");
		} else {
			System.out.println("A primeira String não termina com a segunda String!!");
		}
		
		System.out.println("Indice da primeira ocorrencia do caracter informado: " + indicePLetra);
		
		System.out.println("Indice da ultima ocorrencia do caracter informado: " + indiceULetra);

		System.out.println("O substring é: "+nova.substring(0,4));
		
		
	}
}
