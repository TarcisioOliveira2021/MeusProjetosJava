package br.ucsal.bes20192.poo.aula11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade09BMap {

	private static final int QTD_NOMES = 20;

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Map<String, Integer> nomesQuantidades = obterNomesQuantidades();
		exibir(nomesQuantidades);
	}

	private static Map<String, Integer> obterNomesQuantidades() {
		// Map<nome, qtd de ocorr�ncias do nomes>
		Map<String, Integer> nomesQuantidades = new HashMap<>();
		System.out.println("Informe " + QTD_NOMES + " nomes:");
		for (int i = 0; i < QTD_NOMES; i++) {
			String nome = sc.nextLine();
			if (nomesQuantidades.containsKey(nome)) {
				// O nome est� no mapa e precisamos incrementar a quantidade de ocorr�ncias.
				Integer qtdAtual = nomesQuantidades.get(nome);
				nomesQuantidades.put(nome, qtdAtual + 1);
			} else {
				// O nome N�O est� no mapa e precimos inclu�-lo associando � uma ocorr�ncia.
				nomesQuantidades.put(nome, 1);
			}
		}
		return nomesQuantidades;
	}

	private static void exibir(Map<String, Integer> nomesQuantidades) {
		for (String nome : nomesQuantidades.keySet()) {
			System.out.println(nome + " x " + nomesQuantidades.get(nome));
		}
	}
}
