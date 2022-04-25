package com.teste;

import java.util.List;

public class Teste {
	public static boolean testarString(List<String> palavra , List<String> palavraEscrita) {
		if (palavra.size()!= palavraEscrita.size()) {
			System.out.println("Não cabe pois "+palavraEscrita+" tem um tamanho diferente de "+palavra);
			return false;
		}
		for (int i = 0; i < palavra.size(); i++) {
			if (palavra.get(i) != "-" && palavra.get(i) != palavraEscrita.get(i)) {
				System.out.println("Não cabe pois "+palavraEscrita+" não cabe em "+palavra);
				return false;
			}
		}
		System.out.println("A palavra: "+palavraEscrita+" cabe dentro de "+palavra);
		return true;
	}
	
	public static boolean testarString1(String[] palavra1,String[] palavraEscrita1 ) {
		if (palavra1.length != palavraEscrita1.length) {
			System.out.println("Não cabe pois o tamanho das duas é diferente");
			return false;
		}
		for (int i = 0; i < palavra1.length; i++) {
			if (palavra1[i] != "-" && palavra1[i] != palavraEscrita1[i]) {
				System.out.println("Não cabe pois um elemento não é igual");
				return false;
			}
		}
		System.out.println("Cabe");
		return true;
	}
	
	public static String maiorString(String[] lista) {
		String palavraMaior = "";
		int aux  = 0;
		int aux1 = 0;
		
		for (int i = 0; i < lista.length; i++) {
			aux = lista[i].length();
			if (aux > aux1) {
				palavraMaior = lista[i];
			}
		}
		return palavraMaior;
	}
}
