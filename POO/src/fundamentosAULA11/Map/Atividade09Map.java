package fundamentosAULA11.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade09Map {
	private static final int QTD_NOMES = 20;
	private static Scanner scr = new Scanner(System.in);
	
	public static void main(String[] args) {
		executar();
	}

	private static void executar() {
		Map<String,Integer> nomesQuantidades = obterNomesQuantidades();
		exibir(nomesQuantidades);
	}

	private static Map<String, Integer> obterNomesQuantidades() {
		Map<String,Integer> nomesQuantidades = new HashMap<>();
		System.out.println("Informe "+QTD_NOMES+" nomes: ");
		for (int i = 0; i < QTD_NOMES; i++) {
			String nome = scr.nextLine();
			//Se ja contem o nome na lista.
			if(nomesQuantidades.containsKey(nome)) {
				Integer qtdAtual = nomesQuantidades.get(nome);
				nomesQuantidades.put(nome, qtdAtual + 1);
			//Se nao 
			}else {
				nomesQuantidades.put(nome, 1);
			}
		}
		return nomesQuantidades;
	}
	
	private static void exibir(Map<String, Integer> nomesQuantidades) {
		for (String nome : nomesQuantidades.keySet()) {
			System.out.println(nome+" x "+nomesQuantidades.get(nome));
		}
	}

}
