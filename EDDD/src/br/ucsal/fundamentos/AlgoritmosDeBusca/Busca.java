package br.ucsal.fundamentos.AlgoritmosDeBusca;

public class Busca {
	
	public static void main(String[] args) {
		//Metodo que executa o programa.
		executar();
	}
	//Metodo de buca em um array organizado ou nao.
	private static void executar() {
		int inicio = 0;
		int meio = 0;
		int fim = 10;
		//Valor que desejaa buscar.
		int elemento = 8;
		boolean verificador = true;
		
		//Declaracao do vetor que deseja buscar o elemento
		int[] vetor = { 0,2,3,5,7,8,9,10,15} ;
		
		//Enquanto o inicio for menor ou igual a fim e o verificador
		//for verdade.
		while(inicio <= fim && verificador) {
			meio = (fim - inicio) / 2 + inicio;
			if(vetor[meio] == elemento) {
				System.out.println("Achei o valor "+elemento+" na posicao: "+meio);
				verificador = false;
			}else if (vetor[meio]< elemento) {
				inicio = meio + 1;
			}else if (vetor[meio]> elemento) {
				fim = meio -1;
			}
		}
	}
}
