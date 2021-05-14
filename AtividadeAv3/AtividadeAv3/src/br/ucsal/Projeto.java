package br.ucsal;

import java.util.Scanner;

public class Projeto {
	public static Scanner tec = new Scanner ( System.in);
	static int escolha =0;
	public static void main(String[] args) {
		inicio();
	}
	public static void inicio(){
		autentific(); //Metodo autentificador
	}
	public static boolean autentific() {
		System.out.println("             Bem vindo");
		System.out.println("   ===============================");
		System.out.print(" Informe o CPF cadastrado: ");
		String cpf = tec.next();									//Pega o valor digitado -- joga em cpf
		System.out.print(" Informe a SENHA cadastrada: ");
		String senha = tec.next();									//Pega o valor digitado -- joga em senha
		
		boolean val = validar(cpf,senha);							// variavel val que recebe o metodo validar com os parametros cpf e senha
		if(val==true) {												//Caso val seja verdade 
			System.out.println("\n==== Usuario validado com sucesso ====");	
			do {														//Laco de repetico caso val seja verdade
				System.out.println("   === Jogos Disponiveis ===");
				System.out.println("\n1 - Jogo da Velha");
				System.out.println("2 - Jogo da Forca");
				System.out.println("3 - Batalha Naval");
				System.out.println("4 - Sair");	
				escolha = tec.nextInt();								//variavel que pega o resultado do Menu
				Selecionador();											//metodo com switch que executa a classe solicitada
				if((escolha < 0)||(escolha == 0)||(escolha > 4)){		//Mensagem de erro caso numero digitado fora do laco 
					System.out.println("\n             ERRO");
					System.out.println("Numero invalido digite novamente: ");
				}
			}while((escolha < 0)||(escolha == 0)||(escolha > 4));		//condicao para sair do laco
	
		}else {														//Caso seja val seja falsa
			System.out.println("");
			System.out.println("                     ERRO");
			System.out.println("Voce nao tem permisao para jogar, execute novamente.");
		}
		return val;                                                
		
	}
	public static boolean validar(String cpf, String senha) {   //metodo para validar
		boolean validou = false;								//validou = falso.
		int indicecpf = 4,indiceSenha=5;						//variaveis para compara o indice dos vetores, os numeros sao diferentes devido a condicao de um ser igual ao outro para retornar TRUE
		String[] CPF = new String[3];							//Elementos do vetor
		CPF[0] = "12345678900";
		CPF[1] = "11234567890";									//Lista de cpfs validos
		CPF[2] = "00987654321";
		String[] Senha = new String[3];
		Senha[0] = "123";
		Senha[1] = "112";										//Lista de senhas validas
		Senha[2] = "009";
		for (int i = 0; i < CPF.length; i++) {
			if(cpf.equals(CPF[i])){								//Caso o cpf digitado seja igual a o conteudo guardado no vetor CPF o indicecpf recebe o numero do indice do vetor.
				indicecpf = i;
			}
		}
		for (int j = 0; j < Senha.length; j++) {
			if(senha.equals(Senha[j])){							//Caso a senha digitada seja igual a senha guardado no vetor Senha o indiceSenha recebe o numero do indice do vetor.
				indiceSenha = j;
			}
		}
		if(indicecpf==indiceSenha) {						   //Caso os indices forem igual validou = Verdade.
			validou = true;
		}
		
	return validou;											   //Retorna a variavel validou.
}
	public static void Selecionador () {						//metodo que seleciona o game escolhido
		switch(escolha) {
		case 1:
			JogoDaVelha.inicio();
		case 2:
			JogoDaForca.inicio();
		case 3:
			BatalhaNaval.inicio();
		case 4:													//encerra o programa
			System.out.println("..Fim do programa..");
			System.exit(0);
		}
	}
	
}
		