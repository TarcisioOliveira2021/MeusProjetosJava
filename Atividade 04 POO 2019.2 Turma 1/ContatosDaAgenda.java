package br.ucsal.bes20192.poo.atividade04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Contato {
	String nome;
	String telefone;
	LocalDate dataNac;
	String tipo;
}

public class ContatosDaAgenda {
	public static Contato contatos[] = new Contato[10];
	public static Scanner scr = new Scanner(System.in);
	public static int quantidadeDeContatos = 0;

	public static void implementar() {
		quantidadeDeContatos = 1;
		boolean resp = true;
		String nascimento;
		for (int i = 1; resp; i++) {
			contatos[i] = new Contato();
			System.out.println();
			System.out.println("      ..Novo Contato..");
			System.out.print("Nome: ");
			String nome = scr.next();
			contatos[i].nome = nome;
			if ((i > 1) && (contatos[i].nome.equals(contatos[1].nome))) {
				System.out.println();
				System.out.println("Erro001- O Contato ja existente, porfavor refaa a operacao.");
				System.out.println();
				quantidadeDeContatos = 1;
				Agenda.agenda();
			}
			System.out.print("Telefone: ");
			String telefone = scr.next();
			contatos[i].telefone = telefone;
			System.out.print("Data de nascimeto ");
			nascimento = scr.next();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate data = LocalDate.parse(nascimento, formato);
			contatos[i].dataNac = data;
			System.out.print("Tipo: ");
			String tipoDoContato = scr.next();
			contatos[i].tipo = tipoDoContato;
			System.out.println("================================================");
			System.out.println("Deseja adicionar outro contato ?  true || false");
			System.out.print(":");
			resp = scr.nextBoolean();
			if (resp) {
				quantidadeDeContatos++;
			}
			System.out.println("================================================");
		}
		System.out.println();
		Agenda.agenda();
	}

	public static void listar() {
		System.out.println();
		if (quantidadeDeContatos == 0) {
			System.out.println("      ..Lista vazia..");
			System.out.println();
			Agenda.agenda();
		}
		for (int i = 1; i <= quantidadeDeContatos; i++) {
			System.out.println();
			System.out.println("        Contatos (" + i + ")");
			System.out.println("     ==============");
			System.out.println("Nome:" + contatos[i].nome);
			System.out.println("Telefone:" + contatos[i].telefone);
			System.out.println("Data de nascimento:" + contatos[i].dataNac);
			System.out.println("Tipo do contato:" + contatos[i].tipo);
		}
	}

	public static void excluirContato() {
		String nome;
		System.out.println();
		System.out.println("      ..Exclusao de contatos..");
		System.out.print("Digite o nome do contato que queira excluir: ");
		nome = scr.next();
		for (int i = 1; i <= quantidadeDeContatos; i++) {
			if (contatos[i].nome.equals(nome) && (quantidadeDeContatos > 1)) {
				contatos[i].nome = contatos[i + 1].nome;
				contatos[i].telefone = contatos[i + 1].telefone;
				contatos[i].dataNac = contatos[i + 1].dataNac;
				contatos[i].tipo = contatos[i + 1].tipo;
				System.out.println();
				System.out.println("    Contato apagado com sucesso");
				quantidadeDeContatos--;
			} else if (contatos[2].nome.equals(nome) && (quantidadeDeContatos > 1)) {
				contatos[2] = null;
				System.out.println();
				System.out.println("    Contato apagado com sucesso");
				quantidadeDeContatos--;
			} else if (contatos[i].nome.equals(nome)) {
				contatos[i] = null;
				System.out.println();
				System.out.println("    Contato apagado com sucesso");
				quantidadeDeContatos--;
			} else if (contatos[i].nome != nome && (i == quantidadeDeContatos)) {
				System.out.println();
				System.out.println("    Contato nao localizado");
			}
		}
		System.out.println();
		Agenda.agenda();
	}
	public static void buscarContato(){
	    String nome;
		System.out.println();
		System.out.println("      ..Busca de contatos..");
		System.out.print("Digite o nome do contato que queira procurar: ");
		nome = scr.next();
		for (int i = 1; i <= quantidadeDeContatos; i++) {
			if (nome.equals(contatos[i].nome){
			System.out.println("        Contato encontrado ");
			System.out.println("\n"+"        Contatos (" + i + ")");
			System.out.println("     ==============");
			System.out.println("Nome:" + contatos[i].nome);
			System.out.println("Telefone:" + contatos[i].telefone);
			System.out.println("Data de nascimento:" + contatos[i].dataNac);
			System.out.println("Tipo do contato:" + contatos[i].tipo);	
			}
	    )
	    System.out.println();
	    Agenda.agenda();
}
