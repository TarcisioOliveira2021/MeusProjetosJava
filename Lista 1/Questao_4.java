import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 4ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */


public class Questao_4 {

	public static void main(String[] args) {

		Questao_4 questao = new Questao_4();
		questao.executa();
		
	}
	
	
	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		System.out.println("Qual a população inicial?");
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
	 * Método que calcula o crescimento demográfico de uma população
	 * @param populacao Parâmetro que recebe o valor da população
	 * @param taxaDeCrescimento Parâmetro que recebe o valor da taxa de crescimento
	 * @return populacaoFinal População resultante do incremento
	 */
	public double calculaCrescimentoDemografico(double populacao, double taxaDeCrescimento) {
		
		double fatorDeCrescimento =  1 + (taxaDeCrescimento/100);
		double populacaoFinal = populacao * fatorDeCrescimento;
		
		return populacaoFinal;
		
	}
	
	/**
	 * Método que imprime a população estimada
	 * @param populacao Parâmetro que recebe o valor da população a ser impresso
	 */
	public void imprimePopulacao(double populacao, int ano) {
		
		System.out.println(String.format("A população estimada no ano %d é %.2f", ano, populacao));
		
	}
	
}
