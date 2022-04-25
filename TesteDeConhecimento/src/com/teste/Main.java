package com.teste;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
	 List<String> palavra = Arrays.asList("-","x","-");
	 List<String> palavraEscrita = Arrays.asList("a","x","e");
	 
	 
	 System.out.println(Teste.testarString(palavra,palavraEscrita));
	}
}
