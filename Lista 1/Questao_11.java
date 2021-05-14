import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 11ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */

public class Questao_11 {

	public static void main(String[] args) {

		Questao_11 questao = new Questao_11();
		questao.executa();
		
	}

	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o termo inicial da PA?");
		int primeiroTermo = entrada.nextInt();
		
		System.out.println("Qual a razão da PA?");
		int razao = entrada.nextInt();

		System.out.println("Qual a quantidade de termos da PA?");
		int quantidadeDeTermos = entrada.nextInt();

		int[] pa = getTermosPA(quantidadeDeTermos, razao, primeiroTermo);
		
		System.out.print("Os termos da PA são: ");
		imprimeArray(pa);
		
		entrada.close();
		
	}
	
	/**
	 * Método que imprime o array
	 * @param valores Array a ser impresso
	 */
	public void imprimeArray(int[] valores) {

		for(int i=0; i<valores.length;i++) {

			System.out.print(String.format("%d ", valores[i]));
		
		}

	}
	
	/**
	 * Método que cria o array com a PA
	 * @param quantidadeDeTermos Quantidade de termos da PA
	 * @param razao Razão da PA
	 * @param primeiroTermo Primeiro termo da PA
	 * @return termos Array com a PA
	 */
	public int[] getTermosPA(int quantidadeDeTermos, int razao, int primeiroTermo) {
		
		int[] termos = new int[quantidadeDeTermos];
		termos[0] = primeiroTermo;
		
		for(int i=1; i<termos.length; i++) {
			termos[i] = proximoTermoPA(razao, termos[i-1]);
		}		
		
		return termos;
				
	}
	
	/**
	 * Método que calcula o próximo termo de uma PA
	 * @param razao Razão da PA
	 * @param termoAnterior Termo anterior
	 * @return proximoTermo Próximo termo
	 */
	public int proximoTermoPA(int razao, int termoAnterior) {
		
		int proximoTermo = termoAnterior + razao;
		return proximoTermo;
		
	}
	
}
