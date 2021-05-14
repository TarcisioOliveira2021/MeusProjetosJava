package br.ucsal.bes20192.poo.atividade07.usoenumeracoes;

public class ExemploForEach {

	public static void main(String[] args) {

		String nomes[] = { "Antonio", "Maria", "Ana", "Pedro" };

		System.out.println("Nomes (usando um for tradicional):");
		for (int i = 0; i < nomes.length; i++) {
			String nome = nomes[i];

			System.out.println(nome);
		}

		System.out.println("\n\nNomes (usando um for each):");
		for (String nome : nomes) {

			System.out.println(nome);
		}

	}

}
