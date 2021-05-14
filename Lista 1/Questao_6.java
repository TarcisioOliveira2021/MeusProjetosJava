import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 6� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */

public class Questao_6 {

	public static void main(String[] args) {

		Questao_6 questao = new Questao_6();
		questao.executa();
		
	}
	
	
	/**
	 * M�todo que realiza a execucao do programa
	*/
	public void executa() {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		System.out.println("Digite o texto a ser invertido!");
		String texto = entrada.nextLine();
		String textoInvertido = inverteString(texto);
		System.out.println(textoInvertido);
		
		entrada.close();
		
	}

	/**
	 * M�todo que inverte uma String
	 * @param texto Par�metro que cont�m o texto a ser invertido
	 * @return novaString String invertida
	 */
	public String inverteString(String texto) {

		char[] stringNormal = texto.toCharArray();
		char[] stringInvertida = new char[texto.length()];
		
		//Duas vari�veis de controle, i e j, deslocam-se em sentidos opostos
		for(int i=0, j=texto.length()-1;j>=0;i++,j--) {
			
			stringInvertida[i]=stringNormal[j];

		}

		String novaString = new String(stringInvertida); 
		
		return novaString;
		
	}

}
