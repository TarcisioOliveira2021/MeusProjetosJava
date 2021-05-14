package br.ucsal.ed;

public interface ILMD {

	void insere(int codigo, String descricao);
	void remove(int codigo);
	Noc buscar(int codigo);
	void alterar(int codigo, String descricao);
	void imprimeTudo();
	void imprimeCategoria(int codigo);
	void insereNo(int valor, int codigo);
	void removeNo(int valor, int codigo);
	No burcarNo(int codigo, int valor);
	void alterar(int codigo, int valor, int novoValor);
	
}
