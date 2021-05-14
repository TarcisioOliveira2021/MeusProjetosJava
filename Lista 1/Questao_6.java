import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 6ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */

public class Questao_6 {

	public static void main(String[] args) {

		Questao_6 questao = new Questao_6();
		questao.executa();
		
	}
	
	
	/**
	 * Método que realiza a execucao do programa
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
	 * Método que inverte uma String
	 * @param texto Parâmetro que contém o texto a ser invertido
	 * @return novaString String invertida
	 */
	public String inverteString(String texto) {

		char[] stringNormal = texto.toCharArray();
		char[] stringInvertida = new char[texto.length()];
		
		//Duas variáveis de controle, i e j, deslocam-se em sentidos opostos
		for(int i=0, j=texto.length()-1;j>=0;i++,j--) {
			
			stringInvertida[i]=stringNormal[j];

		}

		String novaString = new String(stringInvertida); 
		
		return novaString;
		
	}

}
