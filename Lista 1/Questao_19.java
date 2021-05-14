import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 19ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */


public class Questao_19 {

	Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

	public static void main(String[] args) {

		Questao_19 questao = new Questao_19();
		questao.executa();
		
	}

	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {

		System.out.println("Qual o tamanho do array?");
		int tamanho = entrada.nextInt();

		int[] valores = leArray(tamanho);
		
		imprimeArray(valores);
		
		for(int i: valores){
			System.out.println(String.format("O fatorial de %d é %d", i, calculaFatorial(i)));
		}
		
		for(int i: valores){
			if(ehPrimo(i)) {
				System.out.println(String.format("O número %d é primo", i));
			}else {
				System.out.println(String.format("O número %d não é primo", i));			
			}
		}
		
		int maior = getMaiorNumero(valores);	
		System.out.println(String.format("O maior número no vetor é %d", maior));
		
		int menor = getMenorNumero(valores);	
		System.out.println(String.format("O menor número no vetor é %d", menor));
		
		entrada.close(); //Fecha a entrada
		
	}

	/**
	 * Método que cria e lê um array
	 * @param tamanho Tamanho do array
	 * @return valores Array lido
	*/
	public int[] leArray(int tamanho) {
		
		int[] valores = new int[tamanho];
		
		for(int i=0; i<valores.length; i++) {
			System.out.println("Digite um valor!");
			valores[i] = entrada.nextInt();
		}
		return valores;
	}

	/**
	 * Método que imprime um array
	 * @param array
	*/
	public void imprimeArray(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.print(String.format("%d ", array[i]));
		}
		System.out.println("");
	}

	/**
	 * Método que calcula o fatorial de um número
	 * @param numero Número para ser calculado o fatorial
	 * return fatorial Fatorial do número
	*/
	public int calculaFatorial(int numero) {
		
		int fatorial = 1;
		
		for(int i=numero; i>0; i--) {
			fatorial *= i; 
		}
		return fatorial;
	}

	/**
	 * Método que verifica se um número é primo
	 * @param numero Número a ser verificado
	 * return boolean Indica se um numero é primo
	*/
	public boolean ehPrimo(int numero) {
		
		boolean ehPrimo = true;
		
		if(numero==1)
			return false;
		else if(numero==2)
			return true;
		
		for(int i=numero-1; i>1; i--) {
			if(numero%i==0)
				ehPrimo = false;
		}
		
		return ehPrimo;
	}

	/**
	 * Método que verifica qual o maior número de um vetor
	 * @param valores Vetor
	 * return numero Maior número
	*/
	public int getMaiorNumero(int[] valores) {
		
		int maior = valores[0];
		
		for(int i=0; i<valores.length; i++) {
			if(valores[i]>maior)
				maior=valores[i];
		}
		
		return maior;
	}

	/**
	 * Método que verifica qual o menor número de um vetor
	 * @param valores Vetor
	 * return numero Menor número
	*/
	public int getMenorNumero(int[] valores) {
		
		int menor = valores[0];
		
		for(int i=0; i<valores.length; i++) {
			if(valores[i]<menor)
				menor=valores[i];
		}
		
		return menor;
	}

}
