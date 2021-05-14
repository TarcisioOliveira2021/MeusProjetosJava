package br.ucsal.ed;

public interface IString {

	int length(); //Retorna o tamanho da string
	char charAt(int posicao); //Retorna o caracter na posi��o especificada
	boolean equals(String valor); //Verifica se a string passada por par�metro � igual
	boolean startsWith(String valor); //Verifica se a string inicia com o texto dado
	boolean endWith(String valor); //Verifica se a string finaliza com o texto dado
	int indexOf(char letra); //Localiza a primeira ocorr�ncia na string do caracter dado
	int lastIndexOf(char letra); //Localiza a �ltima ocorr�ncia na string do caracter dado
	String substring(int inicio, int quantidadeDeCaracteres); //Retorna a substring que come�a
	//em in�cio e tem como tamanho quantidadeDeCaracteres
	String replace(char letraASerTrocada, char letraATrocar); //Retorna uma string onde todas
	//as ocorr�ncias do primeiro par�metro s�o trocadas pelo segundo
	String concat(String valor); //Concatena a string com aquela passada como par�metro
	void imprime(); //Imprime a String
}