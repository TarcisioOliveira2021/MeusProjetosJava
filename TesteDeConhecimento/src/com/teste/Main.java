package com.teste;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
	 //Testa se uma string cabe dentro de outra - Método1
	 List<String> palavra = Arrays.asList("-","x","-");
	 List<String> palavraEscrita = Arrays.asList("a","x","e");
	 System.out.println(Teste.testarString(palavra,palavraEscrita));
	 
	 System.out.println("===============================================");
	 
	 //Testa se uma string cabe dentro de outra - Método 2
	 String[] palavra1 = {"-","-","x"};
	 String[] palavraEscrita1 = {"b","o","x"};
	 System.out.println(Teste.testarString1(palavra1,palavraEscrita1));
	 
	 //Verifica qual é a maior palavra dentro de um array de palavras.
	 String[] listaDePalavras = {"apple","beer","sickness"};
	 System.out.println("A maior palavra é: "+Teste.maiorString(listaDePalavras));
	}
}
