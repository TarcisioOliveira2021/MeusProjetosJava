import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementa��o did�tica para resolu��o da 18� quest�o da lista de exerc�cios 1
 * Observem o nome das vari�veis, constantes e m�todos que esclarecem a inten��o de uso dos mesmos
 * Observem os coment�rios que esclarecem a implementa��o 
 */


public class Questao_18 {

	Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

	public static void main(String[] args) {

		Questao_18 questao = new Questao_18();
		questao.executa();
		
	}

	/**
	 * M�todo que realiza a execucao do programa
	*/
	public void executa() {
		
		System.out.println("Qual o tamanho do primeiro array?");
		int tamanhoDeA = entrada.nextInt();

		System.out.println("Qual o tamanho do segundo array?");
		int tamanhoDeB = entrada.nextInt();

		int[] arrayA = leArray(tamanhoDeA);
		int[] arrayB = leArray(tamanhoDeB);
		
		imprimeArray(arrayA);
		imprimeArray(arrayB);
		
		int[] arrayIntercalado = intercalaArray(arrayA, arrayB);
		imprimeArray(arrayIntercalado);
		
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
	 * M�todo que intercala dois arrays
	 * @param arrayA Primeiro array
	 * @param arrayB Segundo array
	 * @return arrayIntercalado Array intercalado
	*/
	public int[] intercalaArray(int[] arrayA, int[] arrayB) {
		
		int[] arrayIntercalado = new int[arrayA.length+arrayB.length];

		boolean inverte = false;
		
		if(arrayA.length<arrayB.length) {

			arrayIntercalado = mesclaArrays(arrayA, arrayB,inverte);
			
		} else {
			
			inverte = true;
			arrayIntercalado = mesclaArrays(arrayB, arrayA,inverte);
			
		}	
		
		return arrayIntercalado;
	}


	/**
	 * M�todo que mescla os arrays
	 * @param arrayA Primeiro array
	 * @param arrayB Segundo array
	 * @param inverte Indica se o preenchimento do array deve ser invertido
	 * @return arrayMesclado Array mesclado
	*/
	public int[] mesclaArrays(int[] arrayA, int[] arrayB, boolean inverte) {

		int[] arrayIntercalado = new int[arrayA.length+arrayB.length];

		int cursor=0; 
		int j = cursor;

		while(cursor<arrayA.length) {
			if(!inverte) {
				arrayIntercalado[j]=arrayA[cursor];
				arrayIntercalado[j+1]=arrayB[cursor];
			}else {
				arrayIntercalado[j]=arrayB[cursor];
				arrayIntercalado[j+1]=arrayA[cursor];			
			}	
			cursor++;
			j+=2;
		}
		
		if(cursor<arrayB.length) {

			while(cursor<arrayB.length) {
				arrayIntercalado[j]=arrayB[cursor];
				j++;
				cursor++;
			}
			
		}	

		return arrayIntercalado;
		
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

}
