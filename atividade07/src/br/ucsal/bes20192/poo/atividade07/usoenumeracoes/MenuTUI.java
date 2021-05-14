package br.ucsal.bes20192.poo.atividade07.usoenumeracoes;

import java.util.Scanner;

public class MenuTUI {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ItemMenuEnum opcaoSelecionada;
		exibirOpcoesMenu();
		opcaoSelecionada = obterOpcaoSelecionada();
		System.out.println("Opção selecionada = " + opcaoSelecionada.getDescricao());
	}

	private static ItemMenuEnum obterOpcaoSelecionada() {
		Integer opcaoSelecionadaInteger;
		ItemMenuEnum opcaoSelecionada;

		System.out.println("Informe a opção:");
		opcaoSelecionadaInteger = scanner.nextInt();

		// Converter a opcaoSelecionadaInteger em opcaoSelecionada
		opcaoSelecionada = ItemMenuEnum.valueOfCodigo(opcaoSelecionadaInteger);

		return opcaoSelecionada;
	}

	private static void exibirOpcoesMenu() {
		for (ItemMenuEnum itemMenu : ItemMenuEnum.values()) {
			System.out.println(itemMenu.getCodigo() + " - " + itemMenu.getDescricao());
		}
	}

}
