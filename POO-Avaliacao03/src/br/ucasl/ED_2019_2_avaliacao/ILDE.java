package br.ucasl.ED_2019_2_avaliacao;

public interface ILDE {
	void insere(int valor); // Adiciona um elemento ao final da lista
	void limpar(); // Limpa a lista
	int conta(); // Retorna o número de elementos na lista
	void remove(int valor); // Remove um elemento da lista
	ILDE inverte(); // Retorna a lista invertida
	void imprime(); // Imprime toda a lista
}
