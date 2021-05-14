package br.ucsal;

import java.util.Random;
import java.util.Scanner;

public class DiaDosNamorados {
	static Scanner tec = new Scanner (System.in);
	static int tolerancia = 0;
	
	public static void main(String[] args) {
		inicio();
	}
	public static void inicio() {
		System.out.println("       ==============================================     ");
		System.out.println("    =             Bem vindo ao Gift Love               =   ");
		System.out.println("|         A sua solucao para o dia dos Namorados          |");
		System.out.println("|    ==================================================   |");
		Itens();
	}

	public static void Itens() {
		int S =0;
		String presente="",catergoria;
		System.out.println("|                                                         |");
		System.out.println("|                                                         |");
		System.out.println("     Exemplos                                              ");
		System.out.println("       roupa, perfume, calcado, acessorio ou outros.       ");
		System.out.println("");
		System.out.println("");
		System.out.print("       Digite a catergoria do presente: ");
		catergoria = tec.next();
		
		Random rd = new Random();
		
		String[]Roupa = new String[10];
		Roupa[0] = "Camisa(blusa)";
		Roupa[1] = "Camiseta";
		Roupa[2] = "Short";
		Roupa[3] = "Saia";
		Roupa[4] = "Calça";
		Roupa[5] = "Vestido";
		Roupa[6] = "Moleton";
		Roupa[7] = "Bermuda";
		Roupa[8] = "Camisa social";
		Roupa[9] = "Regata";
		
		
		String[]Perfume = new  String[9];
		Perfume[0] = "Chanel Nº 5 por Chanel";
		Perfume[1] = "Dazzle Hinode";
		Perfume[2] = "Classique por Jean Paul Gaultier";
		Perfume[3] = "Jequiti Patrícia Abravanel";
		Perfume[4] = "Essencial Exclusivo Natura";
		Perfume[5] = "STARK (MAHOGANY)";
		Perfume[6] = "LADRO (L’ACQUA DI FIORI)";
		Perfume[7] = "ZAAD VISION (O BOTICÁRIO)";
		Perfume[8] = "ESSENCIAL ESTILO (NATURA)";
		
		String[]Calcado = new  String[7];
		Calcado[0] = "Tenis";
		Calcado[1] = "Sapatilha";
		Calcado[2] = "Sapato";
		Calcado[3] = "Havaianas";
		Calcado[4] = "Bota";
		Calcado[5] = "Sandalia rasteira";
		Calcado[6] = "Cocs";
		
		
		
		String[]Acessorio = new  String[10];
		Acessorio[0] = "Colar";
		Acessorio[1] = "Anel";
		Acessorio[2] = "Oculos";
		Acessorio[3] = "Bolsa";
		Acessorio[4] = "Argola";
		Acessorio[5] = "Maquiagem";
		Acessorio[6] = "Joia";
		Acessorio[7] = "Bone";
		Acessorio[8] = "Relogio";
		Acessorio[9] = "Bracelete";
		
		
		String[]Outro = new  String[6];
		Outro[0] = "Livro";
		Outro[1] = "Jogos";
		Outro[2] = "Celular";
		Outro[3] = "Bonecos de pelucia";
		Outro[4] = "Ida ao cinema";
		Outro[5] = "Ida a um restaurante";
		
		
		if(catergoria.equals("roupa")||(catergoria.equals("Roupa")||(catergoria.equals("ROUPA")))){
			presente = Roupa[rd.nextInt(10)];
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("      -----| Sugestao de presente: "+presente+" |-----  ");
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("                 Voce gostou da sugestao ?               ");
			System.out.println("                        (1) Sim                          ");
			System.out.println("                        (2) Nao                          ");
			System.out.println("                                                         ");
			System.out.print("        Digite:  ");  
			S = tec.nextInt();
			Selecionador(S);
		}
		if(catergoria.equals("Perfume")||(catergoria.equals("perfume")||(catergoria.equals("PERFURME")))) {
			presente = Perfume[rd.nextInt(9)];
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("      -----| Sugestao de presente: "+presente+" |-----  ");
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("                 Voce gostou da sugestao ?               ");
			System.out.println("                        (1) Sim                          ");
			System.out.println("                        (2) Nao                          ");
			System.out.println("                                                         ");
			System.out.print("        Digite:  ");  
			S = tec.nextInt();
			Selecionador(S);
	
		}
		if(catergoria.equals("Calcado")||(catergoria.equals("calcado")||(catergoria.equals("CALCADO")||(catergoria.equals("calçado")||(catergoria.equals("Calçado")||(catergoria.equals("CALÇADO"))))))){
			presente = Calcado[rd.nextInt(7)];
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("      -----| Sugestao de presente: "+presente+" |-----  ");
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("                 Voce gostou da sugestao ?               ");
			System.out.println("                        (1) Sim                          ");
			System.out.println("                        (2) Nao                          ");
			System.out.println("                                                         ");
			System.out.print("        Digite:  ");  
			S = tec.nextInt();
			Selecionador(S);

		}
		if(catergoria.equals("Acessorio")||(catergoria.equals("acessorio")||(catergoria.equals("Acessorio")))){
			presente = Acessorio[rd.nextInt(10)];
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("      -----| Sugestao de presente: "+presente+" |-----  ");
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("                 Voce gostou da sugestao ?               ");
			System.out.println("                        (1) Sim                          ");
			System.out.println("                        (2) Nao                          ");
			System.out.println("                                                         ");
			System.out.print("        Digite:  ");  
			S = tec.nextInt();
			Selecionador(S);
		}
		if(catergoria.equals("outro")||(catergoria.equals("Outro")||(catergoria.equals("OUTRO")))){
			presente = Outro[rd.nextInt(7)];
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("      -----| Sugestao de presente: "+presente+" |-----  ");
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("                 Voce gostou da sugestao ?               ");
			System.out.println("                        (1) Sim                          ");
			System.out.println("                        (2) Nao                          ");
			System.out.println("                                                         ");
			System.out.print("        Digite:  ");  
			S = tec.nextInt();
			Selecionador(S);	
		}
		
		else {
			   System.out.println();
			   System.out.println("            ====================================            ");
			   System.out.println("|           || Nome invalido digite Novamente ||           |");
			   System.out.println("            ====================================            ");
			   System.out.println("");
			   Itens();
		}
		
	}
		
	public static void Selecionador(int S) {
		switch(S) {
		case 1:
			System.out.println("===========================================================");
			System.out.println("|                Ficamos felizes em ajudar !              |");
			System.out.println("===========================================================");
			System.exit(0);
		case 2:
			tolerancia++;
			if(tolerancia==2) {
				ExibirTudo();
			}
			inicio();
		}
	}
	public static void ExibirTudo() {
		String[]Roupa = new String[10];
		Roupa[0] = "Camisa(blusa)";
		Roupa[1] = "Camiseta";
		Roupa[2] = "Short";
		Roupa[3] = "Saia";
		Roupa[4] = "Calça";
		Roupa[5] = "Vestido";
		Roupa[6] = "Moleton";
		Roupa[7] = "Bermuda";
		Roupa[8] = "Camisa social";
		Roupa[9] = "Regata";
		
		String[]Perfume = new  String[9];
		Perfume[0] = "Chanel Nº 5 por Chanel";
		Perfume[1] = "Dazzle Hinode";
		Perfume[2] = "Classique por Jean Paul Gaultier";
		Perfume[3] = "Jequiti Patrícia Abravanel";
		Perfume[4] = "Essencial Exclusivo Natura";
		Perfume[5] = "STARK (MAHOGANY)";
		Perfume[6] = "LADRO (L’ACQUA DI FIORI)";
		Perfume[7] = "ZAAD VISION (O BOTICÁRIO)";
		Perfume[8] = "ESSENCIAL ESTILO (NATURA)";
		
		String[]Calcado = new  String[7];
		Calcado[0] = "Tenis";
		Calcado[1] = "Sapatilha";
		Calcado[2] = "Sapato";
		Calcado[3] = "Havaianas";
		Calcado[4] = "Bota";
		Calcado[5] = "Sandalia rasteira";
		Calcado[6] = "Cocs";
		
		String[]Acessorio = new  String[10];
		Acessorio[0] = "Colar";
		Acessorio[1] = "Anel";
		Acessorio[2] = "Oculos";
		Acessorio[3] = "Bolsa";
		Acessorio[4] = "Argola";
		Acessorio[5] = "Maquiagem";
		Acessorio[6] = "Joia";
		Acessorio[7] = "Bone";
		Acessorio[8] = "Relogio";
		Acessorio[9] = "Bracelete";
		
		String[]Outro = new  String[6];
		Outro[0] = "Livro";
		Outro[1] = "Jogos";
		Outro[2] = "Celular";
		Outro[3] = "Bonecos de pelucia";
		Outro[4] = "Ida ao ao cinema";
		Outro[5] = "Ida ao um restaurante";

			System.out.println("");
			System.out.println("|       Lista de todos os presentes para a Namorada       |");
			System.out.println("|                                                         |");
			System.out.println("|                                                         |");
			System.out.println("|                       Roupa                             |");
			System.out.println("|                                                         |");
			System.out.println("        "+Roupa[0]);
			System.out.println("        "+Roupa[1]);
			System.out.println("        "+Roupa[2]);
			System.out.println("        "+Roupa[3]);
			System.out.println("        "+Roupa[4]);
			System.out.println("        "+Roupa[5]);
			System.out.println("        "+Roupa[5]);
			System.out.println("        "+Roupa[6]);
			System.out.println("        "+Roupa[7]);
			System.out.println("        "+Roupa[8]);
			System.out.println("        "+Roupa[9]);
			System.out.println("|                                                         |");
			System.out.println("|                      Perfume                            |");
			System.out.println("|                                                         |");
			System.out.println("        "+Perfume[0]);
			System.out.println("        "+Perfume[1]);
			System.out.println("        "+Perfume[2]);
			System.out.println("        "+Perfume[3]);
			System.out.println("        "+Perfume[4]);
			System.out.println("        "+Perfume[5]);
			System.out.println("        "+Perfume[6]);
			System.out.println("        "+Perfume[7]);
			System.out.println("        "+Perfume[8]);
			
			System.out.println("|                                                         |");
			System.out.println("|                      Calcado                            |");
			System.out.println("|                                                         |");
			System.out.println("        "+Calcado[0]);
			System.out.println("        "+Calcado[1]);
			System.out.println("        "+Calcado[2]);
			System.out.println("        "+Calcado[3]);
			System.out.println("        "+Calcado[4]);
			System.out.println("        "+Calcado[5]);
			System.out.println("        "+Calcado[6]);
			System.out.println("|                                                         |");
			System.out.println("|                     Acessorio                           |");
			System.out.println("|                                                         |");
			System.out.println("        "+Acessorio[0]);
			System.out.println("        "+Acessorio[1]);
			System.out.println("        "+Acessorio[2]);
			System.out.println("        "+Acessorio[3]);
			System.out.println("        "+Acessorio[4]);
			System.out.println("        "+Acessorio[5]);
			System.out.println("        "+Acessorio[6]);
			System.out.println("        "+Acessorio[7]);
			System.out.println("        "+Acessorio[8]);
			System.out.println("        "+Acessorio[9]);
			System.out.println("|                                                         |");
			System.out.println("|                       Outro                             |");
			System.out.println("|                                                         |");
			System.out.println("        "+Outro[0]);
			System.out.println("        "+Outro[1]);
			System.out.println("        "+Outro[2]);
			System.out.println("        "+Outro[3]);
			System.out.println("        "+Outro[4]);
			System.out.println("        "+Outro[5]);
			System.out.println("|                                                         |");
			System.out.println("|      Fim da lista desejamos boa sorte para voce !       |");
			System.out.println("                   ..Fim do Programa..                     ");
			System.exit(0);	
		}
}

