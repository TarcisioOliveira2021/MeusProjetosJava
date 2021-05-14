package br.ucsal;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
	static String[][] Tabuleiro = new String[3][3];          // Criacao do tabuleiro que esta visivel para todos os metodos da classe
	static Scanner tec = new Scanner(System.in);			 // teclado visivel para tos os metodos da classe
	static int esc =0;										 // variavel do modo de jogo
	static String[] jogadores = new String[2];				 // vetor contendo 2 jogadores 
	static Random PC = new Random();						 // variavel que armazena um numero randomico
	public static void main(String[] args) {
	inicio();												 //Metodo inicial
	}
	public static void inicio() {
		System.out.println("== Bem vindo ao Jogo da Velha ==\n");
		LimparTabu();												//limpa o tabuleiro deixando os espacos vazios
		ExibirTabu();												//Exibi o tabuleiro
		System.out.println("\n Escolha como quer jogar");
		System.out.println("(1) Jogador x Jogador");
		System.out.println("(2) Jogador x Computador");
		System.out.println("(3) Sair");
		System.out.print("Digite: ");
		esc = tec.nextInt();										//pega o resultado digitado pelo usuario
		Escolha();													// metodo switch que decidi o modo de jogo
	}
	public static void ExibirTabu() {							//Exibi o tabuleiro
		System.out.println("   0    1    2");
		for (int i = 0; i < Tabuleiro.length; i++) {
			System.out.print(i + " ");
		for (int j = 0; j < Tabuleiro[i].length; j++) {
			System.out.print(Tabuleiro[i][j]);
			if(j != Tabuleiro[i].length -1) {
				System.out.print("  |  ");
			}
		}
		System.out.println();
		if(i != Tabuleiro.length -1)
			System.out.println("  -------------");
		}
	}
	public static void LimparTabu() {
		for (int i = 0; i < Tabuleiro.length; i++) {			//limpa o tabuleiro
			for (int j = 0; j < Tabuleiro.length; j++) {
			Tabuleiro[i][j] = " ";	
			}
		}
	}
	public static void Escolha() {
		switch(esc){										//Define o modo de jogo
		case 1:
			JogadorJogador();
		case 2:
			JogadorComputador();
		case 3:
			Projeto.inicio();
		}
	}
	public static void JogadorJogador(){                                              //Modo JxJ
		boolean endGame = true;														//Declaracao da variavel sendo verdadeira
		int tentativas = 0;															//variavel das tentativas permitidas
		System.out.println("\nO jogador1 vai usar qual marcador X ou O ?");
		System.out.print("Digite: ");
		jogadores[0] = tec.next();													//Definicao e armazenamento das respostas fornecidas pelo usuario 
		System.out.println("O jogador2 vai usar qual marcador X ou O ?");
		System.out.print("Digite: ");
		jogadores[1] = tec.next();
		boolean jogada = true;															//Definicao da variavel que controla as jogadas
		while(endGame || tentativas == 9) {
			if(jogada) {
				System.out.println("\nVez do jogador " + jogadores[0]);											
				jogada = false;
				if(jogar(0)) {																					//metodo que contem a forma de jogo do jogador 
					System.out.println("\n"+jogadores[0].toUpperCase() + "- VENCEU!! \n..Fim de jogo..");		//vitoria
					endGame = false;
					
				}
			}else {
				System.out.println("\nVez do jogador " + jogadores[1]);
				jogada = true;
				if (jogar(1)) {																					//metodo que contem a forma de jogo do jogador 
					System.out.println("\n"+jogadores[1].toUpperCase() + " - VENCEU!! \n..Fim de jogo..");		//vitoria
					endGame = false;

				}
			}
			ExibirTabu();																//Mostra o tabuleiro
			tentativas++;																//contabiliza as tetativas 
		}
		if (tentativas == 9) {															//Caso de empate
			System.out.println("");
			System.out.println("Empate \n..Fim de jogo..");
		}
		Continuar();
	}	
	public static void JogadorComputador(){												//JxPc
		boolean endGame = true;
		int tentativas = 0;																
		System.out.println("\nJogador vai usar qual marcador (X) ou (O) ?");			//Definicao e armazenamento das respostas fornecidas pelo usuario 
		System.out.print("Digite: ");
		jogadores[0] = tec.next();														
		if(jogadores[0].equals("X")) {												//condicao para que o numero inverso digitado pelo usuario seja atribuido ao computador
			jogadores[1] = "O";
		}else {
			jogadores[1] = "X";
		}
		boolean jogada = true;
		while(endGame || tentativas == 9) {															
			if(jogada == true) {
				System.out.println("\nVez do jogador " + jogadores[0]);
				jogada = false;
				if(jogarPC(0)) {
					System.out.println("\n"+jogadores[0].toUpperCase() + "- VENCEU!! \n..Fim de jogo..");
					endGame = false;
					
				}
			}else {
				System.out.println("\nVez do jogador " + jogadores[1]);
				jogada = true;
				if (jogarPC(1)) {
					System.out.println("\n"+jogadores[1].toUpperCase() + " - VENCEU!! \n..Fim de jogo..");
					endGame = false;
					
				}
			}
			ExibirTabu();
			tentativas++;
		}
		if (tentativas == 9) {
			System.out.println("");
			System.out.println("Empate \n..Fim de jogo..");
		}
		Continuar();
		}
		
	public static boolean jogar(int jogador) {														//metodo de jogadas JxJ
		int linha, coluna;
		do {
			System.out.print("Linha: ");
			linha = tec.nextInt()  ;
			System.out.print("Coluna: ");
			coluna = tec.nextInt() ;
		}while(!verificar(linha,coluna));
		if(jogador == 0) {
			Tabuleiro[linha][coluna] = jogadores[0];
			if(verificarVit(jogadores[0])) {
				return true;
			}
		}else{
			Tabuleiro[linha][coluna] = jogadores[1];
			if(verificarVit(jogadores[1])) {
				return true;
			}
		}
		return false;
	}
	public static boolean jogarPC(int j) {										//metodo de jogadas JxPc
		int linha,coluna,linhap,colunap;
		if(j == 0) {
			do {
				System.out.print("Linha: ");
				linha = tec.nextInt()  ;
				System.out.print("Coluna: ");
				coluna = tec.nextInt();
			}while(!verificar(linha,coluna));									//negacao do metodo verificar caso a posicao esreja errada recebe true se nao false;
			
			Tabuleiro[linha][coluna] = jogadores[0];
			if(verificarVit(jogadores[0])) {									// verifica as condicoes de vitoria 
				return true;
			}
		}else {
				do {			
					linhap = PC.nextInt(2);									//pega os numeros randomicos de 0 a 2
					colunap= PC.nextInt(2);
	
				}while(!verificar(linhap,colunap));
				
				Tabuleiro[linhap][colunap] = jogadores[1];
				if(verificarVit(jogadores[1])) {
					return true;
				}
		}
		return false;
}

	public static boolean verificarVit (String s) {
		int cont = 0;
		for (int j = 0; j < Tabuleiro.length; j++) {
			for (int i = 0; i < Tabuleiro.length; i++) {
				if(Tabuleiro[j][i].equals(s)) {
					cont++;
				}
				if(cont == 3) {
					return true;
				}
			}
			cont =0;
		}
		for (int j = 0; j < Tabuleiro.length; j++) {
			for (int i = 0; i < Tabuleiro.length; i++) {
				if(Tabuleiro[i][j].equals(s)) {
					cont++;
				}
				if (cont==3) {
					return true;
				}
			}
			cont =0;
		}
		for (int i = 0; i < Tabuleiro.length; i++) {
			if(Tabuleiro[i][i].equals(s)) {
				cont++;
			}
			if(cont == 3) {
				return true;
			}
		}
		cont = 0;

		for (int i = 0, j = Tabuleiro.length -1; i < Tabuleiro.length; i++, j--) {
			if (Tabuleiro[i][j].equals(s)) {
				cont++;
			}
			if (cont == 3) {
				return true;
			}
		cont =0;	
		}
		return false;
	}
	public static boolean verificar(int l , int c) {
		if(Tabuleiro[l][c].equals(" "))
			return true;
		System.out.println("Ops! posicao ocupada informe novamente");
		return false;
	}
	public static void Continuar() {
		int resp = 0;
		System.out.println();
		System.out.println("Deseja continuar ?");
		System.out.println("1- sim | 2- para");
		resp = tec.nextInt();
		if(resp==1) {
			inicio();
		}else {
			Projeto.inicio();
		}
	}
}


