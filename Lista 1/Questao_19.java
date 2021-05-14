import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 19� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */


public class Questao_19 {

	Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

	public static void main(String[] args) {

		Questao_19 questao = new Questao_19();
		questao.executa();
		
	}

	/**
	 * M�todo que realiza a execucao do programa
	*/
	public void executa() {

		System.out.println("Qual o tamanho do array?");
		int tamanho = entrada.nextInt();

		int[] valores = leArray(tamanho);
		
		imprimeArray(valores);
		
		for(int i: valores){
			System.out.println(String.format("O fatorial de %d � %d", i, calculaFatorial(i)));
		}
		
		for(int i: valores){
			if(ehPrimo(i)) {
				System.out.println(String.format("O n�mero %d � primo", i));
			}else {
				System.out.println(String.format("O n�mero %d n�o � primo", i));			
			}
		}
		
		int maior = getMaiorNumero(valores);	
		System.out.println(String.format("O maior n�mero no vetor � %d", maior));
		
		int menor = getMenorNumero(valores);	
		System.out.println(String.format("O menor n�mero no vetor � %d", menor));
		
		entrada.close(); //Fecha a entrada
		
	}

	/**
	 * M�todo que cria e l� um array
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
	 * M�todo que imprime um array
	 * @param array
	*/
	public void imprimeArray(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.print(String.format("%d ", array[i]));
		}
		System.out.println("");
	}

	/**
	 * M�todo que calcula o fatorial de um n�mero
	 * @param numero N�mero para ser calculado o fatorial
	 * return fatorial Fatorial do n�mero
	*/
	public int calculaFatorial(int numero) {
		
		int fatorial = 1;
		
		for(int i=numero; i>0; i--) {
			fatorial *= i; 
		}
		return fatorial;
	}

	/**
	 * M�todo que verifica se um n�mero � primo
	 * @param numero N�mero a ser verificado
	 * return boolean Indica se um numero � primo
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
	 * M�todo que verifica qual o maior n�mero de um vetor
	 * @param valores Vetor
	 * return numero Maior n�mero
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
	 * M�todo que verifica qual o menor n�mero de um vetor
	 * @param valores Vetor
	 * return numero Menor n�mero
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
