import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 13ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */

public class Questao_13 {

	Random gerador = new Random(Calendar.getInstance().getTimeInMillis());
	final int POSICAO_NAO_ENCONTRADO = -1;
	
	public static void main(String[] args) {

		Questao_13 questao = new Questao_13();
		questao.executa();
		
	}

	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual a quantidade de números a serem sorteados?");
		int quantidadeDeNumerosSorteados = entrada.nextInt();
		
		int[] numerosSorteados = getValoresSorteados(quantidadeDeNumerosSorteados);

		imprimeArray(numerosSorteados);
		
		System.out.println("Qual o valor a ser buscado?");
		int valorProcurado = entrada.nextInt();

		int indiceDoValor = buscaValorNoArray(numerosSorteados, valorProcurado);
		
		if(indiceDoValor == POSICAO_NAO_ENCONTRADO) {
			System.out.println("Valor não encontrado!");
		} else {
			System.out.println(String.format("O valor %d foi encontrado no índice %d do array.", valorProcurado, indiceDoValor));
		}

		entrada.close();
		
	}
	
	/**
	 * Método que cria o array com os valores sorteados
	 * @param tamanhoDoArray Tamanho do array
	 * @return valores Array
	 */
	public int[] getValoresSorteados(int tamanhoDoArray) {

		int[] valores = new int[tamanhoDoArray];
		
		for(int i=0; i<tamanhoDoArray; i++) {
			valores[i] = sorteia();
		}
		
		return valores;
		
	}

	
	/**
	 * Método que sorteia um valor
	 * @return valor Valor sorteado
	 */
	public int sorteia() {

		int valor = gerador.nextInt();
		return valor;
		
	}
	
	/**
	 * Método que faz a busca no array
	 * @valores Array
	 * @valorProcurado Valor procurado
	 * @return int Posição em que o valor procurado foi encontrado. -1 se não achou
	 */
	public int buscaValorNoArray(int[] valores, int valorProcurado) {
		
		for(int i=0; i<valores.length; i++) {
			if(valores[i]==valorProcurado)
				return i;
		}		
		
		return POSICAO_NAO_ENCONTRADO;
				
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
	
}
