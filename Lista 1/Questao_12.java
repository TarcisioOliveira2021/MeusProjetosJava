import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 12� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */

public class Questao_12 {

	public static void main(String[] args) {

		Questao_12 questao = new Questao_12();
		questao.executa();
		
	}

	/**
	 * M�todo que realiza a execucao do programa
	*/
	public void executa() {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o termo inicial da PA?");
		int primeiroTermo = entrada.nextInt();
		
		System.out.println("Qual a raz�o da PA?");
		int razao = entrada.nextInt();

		System.out.println("Qual a quantidade de termos da PA?");
		int quantidadeDeTermos = entrada.nextInt();

		int[] pa = getTermosPG(quantidadeDeTermos, razao, primeiroTermo);
		
		System.out.print("Os termos da PA s�o: ");
		imprimeArray(pa);
		
		entrada.close();
		
	}
	
	/**
	 * M�todo que imprime o array
	 * @param valores Array a ser impresso
	 */
	public void imprimeArray(int[] valores) {

		for(int i=0; i<valores.length;i++) {

			System.out.print(String.format("%d ", valores[i]));
		
		}

	}
	
	/**
	 * M�todo que cria o array com a PG
	 * @param quantidadeDeTermos Quantidade de termos da PG
	 * @param razao Raz�o da PG
	 * @param primeiroTermo Primeiro termo da PG
	 * @return termos Array com a PG
	 */
	public int[] getTermosPG(int quantidadeDeTermos, int razao, int primeiroTermo) {
		
		int[] termos = new int[quantidadeDeTermos];
		termos[0] = primeiroTermo;
		
		for(int i=1; i<termos.length; i++) {
			termos[i] = proximoTermoPG(razao, termos[i-1]);
		}		
		
		return termos;
				
	}
	
	/**
	 * M�todo que calcula o pr�ximo termo de uma PG
	 * @param razao Raz�o da PG
	 * @param termoAnterior Termo anterior
	 * @return proximoTermo Pr�ximo termo
	 */
	public int proximoTermoPG(int razao, int termoAnterior) {
		
		int proximoTermo = termoAnterior * razao;
		return proximoTermo;
		
	}
	
}
