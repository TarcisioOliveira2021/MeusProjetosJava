package listaDuplamente;

public interface ILDE {
	
	void inserir(int valor);
	void inserirOrdenado(int valor);
	void remover(int valor);
	No buscar(int chave);
	void alterar(int chave, int novoValor);
	void imprimirCrescente();
	void imprimirDescrescente();
}
