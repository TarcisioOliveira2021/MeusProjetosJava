package br.ucsal.fundamentos.VetorTAD;

//Interface IVector que contem os metodos da classe vector.
public interface IVector {
	//adiciona no vetor um novo elemento passando a posicao que
	//queira adicionar.
	void add(int posicao,int valor);
	//
	void addElement(Integer valor);
	//
	Vector subList(int posicaoInicial, int posicaoFinal);
	//diz a primeira ocorrencia do valor passado no parametro.
	int indexOf(int valor);
	//diz a ultima ocorrencia do valor passado no parametro.
	int lastIndexOf(int valor);
	//
	void ensureCapacity(int tamanho);
	//Limpa o array.
	void clear();
	//Imprime o array.
	void imprimir();
}
