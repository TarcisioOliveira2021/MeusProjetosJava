package br.ucsal.bes20192.poo.atividade07.veiculoatributosnaoprivados;

import java.util.Scanner;

// Esta classe não faz parte da atividade, e foi construida apenas para ilustrar a importância das enumerações
public class AluguelTUI {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		CategoriaMotoEnum categoriaMoto;
		String categoriaMotoString;

		System.out.println("Informe a categoria da moto:");
		categoriaMotoString = scanner.nextLine();
		// Transformar uma String numa CategoriaMotoEnum
		categoriaMoto = CategoriaMotoEnum.valueOf(categoriaMotoString.toUpperCase());
		System.out.println("categoriaMoto=" + categoriaMoto);

	}

	public static void alugar(Moto moto) {
		if (moto.categoria.equals(CategoriaMotoEnum.ESTRADA)) {
			System.out.println("Perguntar quantos anos o condutor tem de habilitação");
		} else if (moto.categoria.equals(CategoriaMotoEnum.TRILHA)) {
			System.out.println("Perguntar se o condutor tem experiência em trilha");
		}

		// NÃO FAZ ASSIM!!!!!
		if (moto.categoria.equals("Estrada")) {
			System.out.println("Perguntar quantos anos o condutor tem de habilitação");
		} else if (moto.categoria.equals("Trilha")) {
			System.out.println("Perguntar se o condutor tem experiência em trilha");
		}

	}

}
