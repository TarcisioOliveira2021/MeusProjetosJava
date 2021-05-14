package fundamentosAULA11.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade09Set {
	// Definicao de constantes static para ser usado dentro da classe e final pois é
	// imutavel esse valor.
	private static final int QTD_NOMES = 10;
	// Definicao do scanner para interacao com o usuario.
	private static Scanner scr = new Scanner(System.in);

	// Metodo main.
	public static void main(String[] args) {
		executa();
	}

	// Metodo que executa o programa.
	private static void executa() {
		//Criacao de um variavel do tipo set que recebe o o retorno do metodo obterNomesDistintos();
		Set<String> nomesDistintos = obterNomesDistintos();
		//Metodo que exibe os nomes.
		exibir(nomesDistintos);

	}
	//Metodo que obtem os numeros metodo setter.
	private static Set<String> obterNomesDistintos() {
		Set<String> nomesDistintos = new HashSet<>();
		System.out.println("Informe " + QTD_NOMES + " nomes: ");
		//Estrutura de repeticao que ate a quantidade de nomes dentro da lista set for menor que a QTD_NOMES = 10
		//O laco se repete.
		do {
			//Variavel que registra o nome digitado.
			String nome = scr.nextLine();
			//Armazena na lista o nome.
			nomesDistintos.add(nome);
		} while (nomesDistintos.size() < QTD_NOMES);
		//Retorna a lista.
		return nomesDistintos;
	}
	//Metodo que exibe a lista
	private static void exibir(Set<String> nomesDistintos) {
		System.out.println("Os nomes distintos informados foram: ");
		//Foreach que serve apenas para varrer.
		for (String string : nomesDistintos) {
			//Escreve os nomes que estao dentro da lista sem repetilos
			//Pois isso é garantido pela estrutura Set.
			System.out.println(string);
		}
	}

}
