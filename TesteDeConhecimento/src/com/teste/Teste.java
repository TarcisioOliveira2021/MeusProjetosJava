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
}
