
package br.ucsal.fundamentos.StringTAD;
//interface contem os metodos que serao implementados em uma classe.
public interface IString {
	int length();
	char charAt(int posicao);
	boolean equals(String valor);
	boolean startsWith(String valor);
	boolean endWith(String valor);
	int indexOf(char letra);
	int lastIndexOf(char letra);
	String substring(int inicio, int quantidadeDeCaracteres);
	void replace(char letraASerTrocada, char letraATrocar);
	String concat(String valor);
	void imprime();
}
