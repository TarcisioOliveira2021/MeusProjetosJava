package br.ucsal.fundamentos.StringTAD;

import java.util.Scanner;

//Essa classe implementa a Interface IString.
public class String implements IString {

	// Criacao de um array de caracteres.
	char[] valores;

	// Construtor que recebe um tamanho.
	// Cria um array com o tamanho passado por parametro.
	public String(int tamanho) {
		valores = new char[tamanho];
	}

	public String() {
		// pede para o usuario digitar a palavra.
		Scanner scr = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		// Joga cada caractere da string em uma posicao do vetor.
		valores = scr.nextLine().toCharArray();
		scr.close();
	}

	// Retorna o tamanho da string digitada.
	public int length() {
		return valores.length;
	}

	// Retorna um caractere numa posicao especifica.
	public char charAt(int indice) {
		// Se a posicao informada for + que o tamanho do vetor ou igual.
		// Retorna ' '.
		if (indice >= valores.length) {
			return ' ';
		} else {
			// Se nao retorna o conteudo na posicao indicada.
			return valores[indice];
		}
	}

	public boolean equals(String valor) {
		if (valor.length() != valores.length) {
			return false;
		}
		// Percorre o array de valores procurando saber se alguma letra
		// informada na strig passada por parametro contem no Array.
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] != valor.valores[i]) {
				return false;
			}
		}
		//Caso nenhum das condicoes seja atendidas esse metodo
		//retorna verdadeiro.
		return true;
	}

	//Verifica se a palavra comeca com a letra informada
	public boolean startsWith(String valor) {
		//Caso a palavra informada for maior do que a palavra armazenada.
		if(valor.length()>valores.length) {
			return false;
		}
		//Percorre o array , caso alguma letra seja diferente da palavra armazenada
		//Retorna falso.
		for (int i = 0; i < valor.length(); i++) {
			if(valores[i]!= valor.valores[i]) {
				return false;
			}
		}
		//Se nenhuma das condicoes forem verdade retorna true.
		return true;
	}

	public boolean endWith(String valor) {
		//Verifica se a palavra passada por parametro é maior
		//que a palavra armazenada.
		if(valor.length()>valores.length) {
			return false;
		}
		// Coloca uma variavel que recebe valores.leng - valor.leng;
		int inicio = valor.length()-1;
		//percorre o arrai de valor
		//comparando se a ultima letra é igual.
		for(int i=0, j=inicio ;i<valor.length();i++,j++) {
			if(valores[j]!=valor.valores[i]) {
				return false;
			}
		}
		return true;
	}
	//Esse metodo retorna 1 primeira ocorrencia da letra na string armazenada
	public int indexOf(char letra) {
		//Varre o array procurando a letra passada.
		for (int i = 0; i < valores.length; i++) {
			//Se acha retorna a possicao daquela letra.
			if(valores[i]==letra) {
				return i;
			}
		}
		//Se nao retorna -1.
		return -1;
	}

	//Esse metodo retorna a ultima ocorrencia da letra na palavra armazenada.
	public int lastIndexOf(char letra) {
		//Varre o array da ultima posicao e compara 
		for (int i = valores.length-1; i > 0; i--) {
			//caso ache a letra retorna sua posicao.
			if(valores[i]==letra) {
				return i;
			}
		}
		return -1;
	}
	//Retorna o substring que tem um inicio definido pelo atributo
	//inicio e vai ate uma quantidadeDeCaracteres que é o final.
	public String substring(int inicio, int quantidadeDeCaracteres) {
		String string = new String(quantidadeDeCaracteres);
		for (int i = inicio,j=0; i < quantidadeDeCaracteres ; i++, j++) {
			string.valores[j]=valores[i];
		}
		return string;
	}
	//Esse metodo troca a letra passada por parametro por uma escolhida.
	public void replace(char letraASerTrocada, char letraATrocar) {
		//Varre o array de valores quando o conteudo for igual a letra que 
		//deseja trocar.
		for (int i = 0; i < valores.length; i++) {
			if(valores[i]==letraASerTrocada) {
				//Quando acha a na posicao = á letraASerTrocada
				//O endereço recebe a letra que passou para 
				//alterar.
				valores[i] = letraATrocar;
			}
		}
	}
	//Cocatena a String com a passada por parametro.
	public String concat(String valor) {
		int tamanho = valores.length + valor.length();
		String string = new String(tamanho);
		int i=0;
		for (int j = 0; j < valores.length; j++) {
			string.valores[i] =valores[i];
		}
		for (int j = 0,z=0; z < valor.length(); j++,z++) {
			string.valores[j]=valor.valores[z];
		}
		return string;
	}
	//Esse metodo imprime a palavra ou array.
	public void imprime() {
		for (char c : valores) {
			System.out.println(c);
		}
		System.out.println();
	}

}
