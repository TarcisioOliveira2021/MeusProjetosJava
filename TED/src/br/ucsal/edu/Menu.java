package br.ucsal.edu;

import java.util.Scanner;

public class Menu {
	public static Scanner scr = new Scanner(System.in);

	private static final int CADRASTRAR_CATER = 1;
	private static final int CADRASTRAR_PROD = 2;
	private static final int CONSULTAR_CATER = 3;
	private static final int CONSULTAR_PROD = 4;
	private static final int ALTERAR_CATER = 5;
	private static final int ALTERAR_PROD = 6;
	private static final int REMOVER_PROD = 7;
	private static final int EXIBIR_ESTOQUE = 8;
	private static final int EXIBIR_CATER = 9;
	private static final int EXIBIR_PROD_POR_CATER = 10;
	private static final int ENCERRAR = 11;
	public static  LMDEstoque lmdEstoque = new LMDEstoque();

	public static void main(String[] args) {
		executarMenu();
	}

	private static void executarMenu() {
		Integer opcao;
		do {
			apresentarOpcoes();
			opcao = setOpcaoDesejada();
			scr.nextLine();
			menu(opcao);
		} while (opcao != ENCERRAR);

	}

	private static Integer setOpcaoDesejada() {
		System.out.print("Informe a Operacao desejada: ");
		return scr.nextInt();
	}

	private static void apresentarOpcoes() {
		System.out.println("=============== MENU ================");
		System.out.println(CADRASTRAR_CATER + "- Cadastrar catergoria");
		System.out.println(CADRASTRAR_PROD + "- Cadastrar produto");
		System.out.println(CONSULTAR_CATER + "- Consultar catergoria");
		System.out.println(CONSULTAR_PROD + "- Consultar produto");
		System.out.println(ALTERAR_CATER + "- Alterar catergoria");
		System.out.println(ALTERAR_PROD + "- Alterar produto");
		System.out.println(REMOVER_PROD + "- Remover produto");
		System.out.println(EXIBIR_ESTOQUE + "- Exibir estoque produto");
		System.out.println(EXIBIR_CATER + "- Exibir catergoria");
		System.out.println(EXIBIR_PROD_POR_CATER + "- Exibir produtos de uma catergoria");
		System.out.println(ENCERRAR + "- Encerrar");
		System.out.println("=======================================");


	}

	private static void menu(int opcaoDesejada) {
		switch (opcaoDesejada) {
		case CADRASTRAR_CATER:
			String descricao;
			Integer codigo;
			System.out.println("\n***** Cadrastro de Catergoria *****\n");
			System.out.print("Informe o nome da Catergoria: ");
			descricao = scr.nextLine();
			System.out.print("Informe o codigo da Catergoria: ");
			codigo = scr.nextInt();
			lmdEstoque.insereCater(descricao, codigo);
			executarMenu();
			break;
		case CADRASTRAR_PROD:
			String prodDescricao;
			Integer quantidade;
			Integer codigoProduto;
			Double valor;
			System.out.println("\n***** Cadrastro do produto *****\n");
			System.out.print("Informe o nome do produto: ");
			prodDescricao = scr.nextLine();
			System.out.print("Informe o codigo do produto: ");
			codigoProduto = scr.nextInt();
			System.out.print("Informe a quantidade do produto: ");
			quantidade = scr.nextInt();
			System.out.print("Informe o valor do produto: ");
			valor = scr.nextDouble();
			lmdEstoque.insereNo(prodDescricao, codigoProduto, valor, quantidade);
			executarMenu();
			break;
		case CONSULTAR_CATER:
			//FIXME
			//Olhar o documento testeLMD parte do Buscar.
			System.out.println("\n***** Consultar catergoria *****\n");
			System.out.print("Informe o codigo da catergoria: ");
			Integer consultaCater = scr.nextInt();
			lmdEstoque.consultarCater(consultaCater);
		
			break;
		case CONSULTAR_PROD:
			System.out.println("\n***** Consultar produto *****\n");
			System.out.print("Informe o codigo do produto: ");
			Integer consultaProd = scr.nextInt();
			lmdEstoque.consultarProd(consultaProd);
			break;
		case ALTERAR_CATER:
			break;
		case ALTERAR_PROD:
			break;
		case REMOVER_PROD:
			break;
		case EXIBIR_ESTOQUE:
			System.out.println("\n***** Estoque *****\n");
			lmdEstoque.exibirEstoque();	
			break;
		case EXIBIR_CATER:
			break;
		case EXIBIR_PROD_POR_CATER:
			break;
		case ENCERRAR:
			System.out.println("\n ====  Programa encerrado ====");
			System.exit(0);
			break;
		default:
			break;
		}
	}

}
