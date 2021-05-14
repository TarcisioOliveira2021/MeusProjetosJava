package br.ucsal.bes20192.poo.atividade04;


import java.util.Scanner;
public class Agenda {
	public static Scanner scr = new Scanner(System.in);
	public static void main(String[] args)  {
		agenda();
	}
	public static void agenda() {
			int resp;
			do {
			System.out.println("====    A G E N D A    ====");
			System.out.println("1- Inserir novo contato");
			System.out.println("2- Excluir contato existente");
			System.out.println("3- Listar contatos");
			System.out.println("4- Sair");
			System.out.println("5- Buscar contato");
			System.out.print(": ");
			resp = scr.nextInt();
			}while(resp >= 6 || resp == 0);
			selecionador(resp);
	}
	public static void selecionador(int n)   {
		switch(n) {
		case 1:
				ContatosDaAgenda.implementar();
				break;
		case 2:
				ContatosDaAgenda.excluirContato();
				break;
		case 3:
				ContatosDaAgenda.listar();
				break;
		case 4: 
				System.out.println();
				System.out.println("Deseja sair mesmo ?    true || false");
				System.out.print(": ");
				if(scr.nextBoolean()==false) {
					agenda();
				}else {
					System.out.println();
					System.out.println("     ..Fim da execucao..");
					System.exit(0);
				}
				break;
		}
		case 5:
		    ContatosDaAgenda.buscarContato();
		    break;
	}

}
