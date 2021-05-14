package br.ucsal.edd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exmplo {
	private static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		Executar();
	}

	private static void Executar() {
		MenuAgenda();
	}

	public static void MenuAgenda() {
		int opcaoSelecionada = 0;
		System.out.println("************** MENU *****************");
		System.out.println("\n1 - Inserir contato ");
		System.out.println("2 - Remover o Cpf ");
		System.out.println("3 - Buscar contato por cpf");
		System.out.println("4 - Buscar contato por Bairro");
		System.out.println("5 - Buscar contato por Cidade");
		System.out.println("6 - Atualizar contato");
		System.out.println("7 - Listar contatos");
		System.out.println("8 - Ordenar a lista por cpf");
		System.out.println("9 - Ordenar a lista por nome");
		System.out.println("10 - Ordenar a lista por data de nascimento");
		System.out.print("\n  Opcao Desejada: ");

		opcaoSelecionada = scr.nextInt();
		scr.nextLine();

		selecionadorOpcoes(opcaoSelecionada);

	}

	private static void selecionadorOpcoes(int opcao) {
		switch (opcao) {
		case 1:
			criarContato();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			listarContatos();
			break;
		case 8:
			break;
		case 9:
			break;
		}

	}

	public static void listarContatos() {
		System.out.println("**************** Listar *************");
		AgendaContatos.imprimirTodosContatos();

	}

	public static void criarContato() {

		String cpf;
		String nome;
		String email;
		String telefone;
		String logradouro;
		int numero;
		String bairro;
		String cidade;
		String data;

		Contato contato = new Contato();
		System.out.println("**************** Inserir *************");
		System.out.print("Informe o Nome: ");
		nome = scr.nextLine();
		contato.setNome(nome);
		
		System.out.print("Informe o Data de nascimento: ");
		data = scr.nextLine();

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = formato.parse(data);
			contato.setDataDeNascimento(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.print("Informe o Cpf: ");
		cpf = scr.nextLine();
		contato.setCpf(cpf);
		System.out.print("Informe o Email: ");
		email = scr.nextLine();
		contato.setEmail(email);
		System.out.print("Informe o Telefone: ");
		telefone = scr.nextLine();
		contato.setTelefone(telefone);
		System.out.print("Informe o Logradouro: ");
		logradouro = scr.nextLine();
		contato.setLogradouro(logradouro);
		System.out.print("Informe o Numero: ");
		numero = scr.nextInt();
		scr.nextLine();
		contato.setNumero(numero);
		System.out.print("Informe o Bairro: ");
		bairro = scr.nextLine();
		contato.setBairro(bairro);
		System.out.print("Informe o Cidade: ");
		cidade = scr.nextLine();
		contato.setCidade(cidade);
		AgendaContatos.inserir(contato);
		//TODO Adicionar os parametros no metodos Listar para finalizar o metodo Inserir contato.
	}

}
