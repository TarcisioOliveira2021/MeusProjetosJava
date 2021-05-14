package br.ucsal.bes20192.poo.aula09.tui;

import java.util.Scanner;

import br.ucsal.bes20192.poo.aula09.domain.CategoriaMotoEnum;

public class MotoTUI {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CategoriaMotoEnum categoriaMoto;
		String categoriaMotoString;
		Integer codigoCategoriaMoto;

		System.out.println("Informe a categoria da moto:");
		categoriaMotoString = sc.nextLine();

		categoriaMoto = CategoriaMotoEnum.valueOf(categoriaMotoString.toUpperCase());
		System.out.println("categoriaMotoString=" + categoriaMotoString);
		System.out.println("categoriaMoto=" + categoriaMoto);
		
		System.out.println("Informe o código da categoria da moto:");
		codigoCategoriaMoto = sc.nextInt();
		sc.nextLine();
		
		categoriaMoto = CategoriaMotoEnum.valueOfCodigo(codigoCategoriaMoto);
		System.out.println("codigoCategoriaMoto=" + codigoCategoriaMoto);
		System.out.println("categoriaMoto=" + categoriaMoto);
	}

}
