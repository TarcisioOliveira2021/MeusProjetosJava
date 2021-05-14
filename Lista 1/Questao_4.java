import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 4� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */


public class Questao_4 {

	public static void main(String[] args) {

		Questao_4 questao = new Questao_4();
		questao.executa();
		
	}
	
	
	/**
	 * M�todo que realiza a execucao do programa
	*/
	public void executa() {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		System.out.println("Qual a popula��o inicial?");
		double populacao = entrada.nextDouble();

		System.out.println("Qual a taxa de crescimento em percentual?");
		double taxaDeCrescimentoAnual = entrada.nextDouble();

		for(int ano=1; ano<=5; ano++) {
			
			populacao = calculaCrescimentoDemografico(populacao, taxaDeCrescimentoAnual);
			imprimePopulacao(populacao, ano);
			
		}
		
		entrada.close();
		
	}

	/**
	 * M�todo que calcula o crescimento demogr�fico de uma popula��o
	 * @param populacao Par�metro que recebe o valor da popula��o
	 * @param taxaDeCrescimento Par�metro que recebe o valor da taxa de crescimento
	 * @return populacaoFinal Popula��o resultante do incremento
	 */
	public double calculaCrescimentoDemografico(double populacao, double taxaDeCrescimento) {
		
		double fatorDeCrescimento =  1 + (taxaDeCrescimento/100);
		double populacaoFinal = populacao * fatorDeCrescimento;
		
		return populacaoFinal;
		
	}
	
	/**
	 * M�todo que imprime a popula��o estimada
	 * @param populacao Par�metro que recebe o valor da popula��o a ser impresso
	 */
	public void imprimePopulacao(double populacao, int ano) {
		
		System.out.println(String.format("A popula��o estimada no ano %d � %.2f", ano, populacao));
		
	}
	
}
