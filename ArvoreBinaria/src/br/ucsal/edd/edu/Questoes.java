package br.ucsal.edd.edu;

public class Questoes {
	public static void main(String[] args) {
		executar(new ArvoreBinaria());
	}

	private static void executar(IArvoreBinaria arvoreBinaria) {
		No aux = new No();
		//O 1 valor da arvore tem que ser definido pelo primeiro valor do No criado.
		arvoreBinaria.inserir(aux, aux.valor=11);
		arvoreBinaria.inserir(aux, 1);
		arvoreBinaria.inserir(aux, 2);
		arvoreBinaria.inserir(aux, 6);
		arvoreBinaria.inserir(aux, 10);
		arvoreBinaria.inserir(aux, 15);
		arvoreBinaria.inserir(aux, 3);
		arvoreBinaria.inserir(aux, 25);
		//Questao02
		arvoreBinaria.emOrdem(aux);
		System.out.println();
		arvoreBinaria.posOrdem(aux);
		System.out.println();
		arvoreBinaria.preOrdem(aux);
		System.out.println();
		System.out.println();
		//Questao04
		System.out.println("O maior numero na arvore é: " +arvoreBinaria.exibirMaior(aux));
		System.out.println();
		//Questao05
		System.out.println("O menor numero na arvore é: " +arvoreBinaria.exibirMenor(aux));
		System.out.println();
		//Questao06
		System.out.println("A media entre os Nos é: " +arvoreBinaria.exibirMediaDaArvore(aux));
		System.out.println();
		//Questao07
		System.out.print("Arvore em ordem crescente: ");
		arvoreBinaria.emOrdem(aux);
		System.out.println();
		System.out.println();
		//Questao08
		System.out.print("As folhas da arvore passada sao: ");
		arvoreBinaria.exibirFolhas(aux);
		System.out.println();
		System.out.println();
		//Questao09
		System.out.print("Os valores da Sub Arvore da esquerda é : ");
		arvoreBinaria.exibirSubArvoreEsq(aux);
		System.out.println();
		System.out.println();
		//Questao11
		System.out.println("A arvore tem "+ arvoreBinaria.qtdNos()+ " Nos.");	
	}
}
