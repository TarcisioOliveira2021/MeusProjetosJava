package problema_com_Scanner;

import java.util.Scanner;

public class ProblemaScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		Integer anoNasc;
		String email;
		
		System.out.println("Informe o nome: ");
		nome = sc.nextLine();
		
		System.out.println("Informe o ano de nascimento: ");
		//anoNasc = Integer.parseInt(sc.nextLine());
		
		//Aqui acontece o erro pois ele passa direto e joga um espaco branco
		//isso devido a um enter que fica no buffer quando usa-se o next.int
		//Para solucionar e so usar: anoNascimento = Integer.parseInt(sc.nextLine());
		//ou da um nextLine();
		
		System.out.println("Informe o email: ");
		email = sc.nextLine();
		
		
		System.out.println("Nome: "+nome);
		//System.out.println("Ano Nasc:"+anoNasc);
		System.out.println("Email: "+email);
	}
}
