package br.ucsal.ed;

public interface IString {

	int length(); //Retorna o tamanho da string
	char charAt(int posicao); //Retorna o caracter na posição especificada
	boolean equals(String valor); //Verifica se a string passada por parâmetro é igual
	boolean startsWith(String valor); //Verifica se a string inicia com o texto dado
	boolean endWith(String valor); //Verifica se a string finaliza com o texto dado
	int indexOf(char letra); //Localiza a primeira ocorrência na string do caracter dado
	int lastIndexOf(char letra); //Localiza a última ocorrência na string do caracter dado
	String substring(int inicio, int quantidadeDeCaracteres); //Retorna a substring que começa
	//em início e tem como tamanho quantidadeDeCaracteres
	String replace(char letraASerTrocada, char letraATrocar); //Retorna uma string onde todas
	//as ocorrências do primeiro parâmetro são trocadas pelo segundo
	String concat(String valor); //Concatena a string com aquela passada como parâmetro
	void imprime(); //Imprime a String
}