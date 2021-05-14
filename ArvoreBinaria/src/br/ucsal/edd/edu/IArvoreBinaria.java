package br.ucsal.edd.edu;

public interface IArvoreBinaria {
	No inserir(No aux,int valor);
	No remover(No aux,int valor);
	boolean buscar(No aux,boolean encontrou, int valor);
	public void preOrdem(No aux);
	public void emOrdem(No aux);
	public void posOrdem(No aux);
	public int exibirMaior(No aux);
	public int exibirMenor(No aux);
	public double exibirMediaDaArvore(No aux);
	public void exibirFolhas(No aux);
	public void exibirSubArvoreEsq(No aux);
	public int qtdNos();
}
