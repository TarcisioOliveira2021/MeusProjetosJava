package br.ucsal.fundamentos.ListaCircular;

public interface ILC {
	void inserir(int valor);
	void remover(int chave);
	void alterar(int chave, int novoValor);
	No buscar(int chave);
	void imprimir();
	void imprimirDuasVezes();
}
