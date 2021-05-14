package br.ucsal.ed;
import java.util.Scanner;
public class String implements IString {

	char[] valores;

	public String(int tamanho) {
		valores = new char[tamanho];
	}

	public String() {
		Scanner scan = new Scanner(System.in);
		valores = scan.nextLine().toCharArray();
	}

	@Override
	public int length() {
		return valores.length;
	}

	@Override
	public char charAt(int posicao) {

		return valores[posicao];
	}

	@Override
	public boolean equals(String valor) {
		
		if (valor.length() != valores.length) {
			return false;
		}
		
		int qtdTrue = 0;

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == valor.valores[i]) {
				qtdTrue++;
			}
		}

		if (qtdTrue == valores.length) {
			return true;
		}

		return false;
	}

	@Override
	public boolean startsWith(String valor) {

		if (valor.length() > valores.length) {
			return false;
		}
		
		for (int i = 0; i < valor.length(); i++) {
			if (valores[i] != valor.valores[i]) {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean endWith(String valor) {
		
		if (valor.length() > valores.length) {
			return false;
		}

		for (int i = valores.length; i < valor.length(); i--) {
			if (valores[i] != valor.valores[i]) {
				return false;
			}
		}

		return true;
	}

	@Override
	public int indexOf(char letra) {
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == letra) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(char letra) {
		for (int i = valores.length - 1; i >= 0; i--) {
			if (valores[i] == letra) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String substring(int inicio, int quantidadeDeCaracteres) {
		String valor = new String();
		for (int i = inicio; i < quantidadeDeCaracteres; i++) {
			valor.valores[i] = valores[i];
		}
		return valor;
	}

	@Override
	public String replace(char letraASerTrocada, char letraATrocar) {
		String valor = new String();
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == letraASerTrocada) {
				valor.valores[i] = letraATrocar;
			} else {
				valor.valores[i] = valores[i];
			}

		}
		return valor;
	}

	@Override
	public String concat(String valor) {
		int cont = 0;
		String novoValor = new String(valores.length + valor.length());

		for (int i = 0; i < valores.length; i++, cont++) {
			novoValor.valores[cont] = valores[i];
		}

		for (int i = 0; i < novoValor.length(); i++, cont++) {
			novoValor.valores[cont] = valor.valores[i];
		}

		return novoValor;
	}

	@Override
	public void imprime() {
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Valor " + i + ": " + valores[i]);
		}

	}


}
