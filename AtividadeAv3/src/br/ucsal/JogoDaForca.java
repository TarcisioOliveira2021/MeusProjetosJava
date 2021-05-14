package br.ucsal;

import java.util.Scanner;

public class JogoDaForca {
	static Scanner tec = new Scanner(System.in);
	static int tentativa = 1;
	public static void main(String[] args) {
	inicio();
	}
	public static void inicio() {
		int erros = 0;
		System.out.println("== Bem vindo ao Jogo da Forca ==\n");
		System.out.println(" Voce tem 6 tentativas para acerta a palavra, Boa sorte.");
		String letra,palavra;
		palavra = PalavraOculta();
		System.out.println("");
		aForca();
		String letras[] = new String[palavra.length()];
		for (int i = 0; i < letras.length; i++) {
			letras[i] = "__ ";
		}
		while(tentativa<7 && erros<6) {
			tracinhos(letras);
			letra = DigiteaLetra();
			System.out.println();
			CondicaoVit(letras);
			if(verific(letras,palavra,letra)) {
				tentativa++;
			}
			if(!verific(letras,palavra,letra)) {
				tentativa++;
				erros++;
				if(erros==1) {
					homenzinho1();
				}
				if(erros==2) {
					homenzinho2();
				}
				if(erros==3) {
					homenzinho3();
				}
				if(erros==4) {
					homenzinho4();
				}
				if(erros==5) {
					homenzinho5();
				}
				if(erros==6) {
					homenzinho6();
				}
			}
			if(tentativa==6) {
				System.out.println("Falta 1 tentativa cuidado !");
			}
			if(tentativa==7) {
				System.out.println("Voce perdeu");
				System.out.println("A palavra era "+palavra.toUpperCase()+" boa sorte na proxima vez.");
				Continuar();
				
			}
			if(CondicaoVit(letras)) {
				tracinhos(letras);
				System.out.println("Parabens voce venceu !");
				Continuar();
			}
		  }
	}

	public static String  PalavraOculta() {
		String palavra = "CASA";
		return palavra;
	}	
	public static void aForca() {
		System.out.println("  _________");
		System.out.println(" |         |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|_______");
		System.out.println("");
		
	}
	public static String DigiteaLetra () { 
		System.out.print("Informe a letra da "+tentativa+ "ª tentativa: ");
		return  tec.next().toUpperCase();
	}
	public static boolean verific(String[] letras, String palavra, String letra) {
		boolean acerto = false;
		for (int i = 0; i < letras.length; i++) {
			if(palavra.substring(i,i+1).equals(letra)) {
				letras[i] = letra;
				acerto = true;
			}
		}
		return acerto;
	}
	public static boolean CondicaoVit(String[] letras) {
		for (int i = 0; i < letras.length; i++) {
			if("__ ".equals(letras[i])) {
				return false;
			}
		}
		return true;
	}
	public static void tracinhos(String[] letras) {
		for (int i = 0; i < letras.length; i++) {
			System.out.print(letras[i]);
		}
		System.out.println();
	}
	public static void homenzinho1() {
		System.out.println("  _________");
		System.out.println(" |         |");
		System.out.println(" |         O");
		System.out.println(" |         ");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|_______");
		System.out.println("");
	}
	public static void homenzinho2() {
		System.out.println("  _________");
		System.out.println(" |         |");
		System.out.println(" |         O");
		System.out.println(" |         |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|_______");
		System.out.println("");
	}
	public static void homenzinho3() {
		System.out.println("  _________");
		System.out.println(" |         |");
		System.out.println(" |         O");
		System.out.println(" |         |--");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|_______");
		System.out.println("");
	}
	public static void homenzinho4() {
		System.out.println("  _________");
		System.out.println(" |         |");
		System.out.println(" |         O");
		System.out.println(" |       --|--");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|_______");
		System.out.println("");
	}
	public static void homenzinho5() {
		System.out.println("  _________");
		System.out.println(" |         |");
		System.out.println(" |         O");
		System.out.println(" |       --|--");
		System.out.println(" |        | ");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|_______");
		System.out.println("");
	}
	public static void homenzinho6() {
		System.out.println("  _________");
		System.out.println(" |         |");
		System.out.println(" |         O");
		System.out.println(" |       --|--");
		System.out.println(" |        | |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|_______");
		System.out.println("");
	}
	public static void Continuar () {
		int resp = 0;
		System.out.println();
		System.out.println("Deseja continuar ?");
		System.out.println("1- sim | 2- para");
		resp = tec.nextInt();
		if(resp==1) {
			inicio();
			tentativa=1;
		}else {
			Projeto.inicio();
		}
	}
}

	
	

	

