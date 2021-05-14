package br.ucsal.fundamentos.ListaDuplamenteENCADEADA;

//Neste tipo de lista precisamos conhecer o anterior e o proximo.
public interface ILDE {
	
	void inserir(int valor);
	void remover(int valor);
	No buscar(int chave);
	void alterar(int chave, int novoValor);
	void imprimirAscendente();
	void imprimirDescendente();
}
