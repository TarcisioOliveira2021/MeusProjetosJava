package br.ucsal.fundamentos.Convercao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Conversao {
	// Criacao do Scanner Statico para usar em toda a classe.
	private static Scanner scr = new Scanner(System.in);
	// Criacao da variavel que recebe o valor da data em String.
	private static String dataRecebida;
	// Criacao da variavel formato responsavel por formatar a data para String,
	// Statica pra usar.
	// em toda a classe
	static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	// Metodo main
	public static void main(String[] args) {
		// Metodo inicializador
		InformeAdata();

	}

	private static void InformeAdata() {
		System.out.print("Informe a data: ");
		// Pega a data inserida pelo usuario em String
		dataRecebida = scr.nextLine();
		// Metodo que realiza a conversao de String para Date recebendo um parametro
		// em String
		Convercao(dataRecebida);
	}

	private static void Convercao(String data) {
		// Criacao da variavel para armazenar o valor convertido.
		Date dataFormatada = null;
		// Try e catch para solucionar caso de erro.
		try {
			// A varivel dataFormatada recebe a conversao da data em String.
			// o parse converte de String para date.
			dataFormatada = formato.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// Metodo responsavel por imprimir a tada convertida
		// Recebendo como parametro um atributo date.
		imprimir(dataFormatada);
	}

	private static void imprimir(Date data) {
		// imprime convetendo o formato do texto para: dd/mm/aa.
		System.out.println("A data é: " + formato.format(data));

	}
}
