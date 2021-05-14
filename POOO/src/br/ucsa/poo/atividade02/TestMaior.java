package br.ucsa.poo.atividade02;

public class TestMaior {
	public static void main(String[] args) {
		executar(new Maior());
	}

	private static void executar(Maior sequencia) {
		int[] vet = new int[5];
		sequencia.obterNumeros(vet);
		int maior = sequencia.encontrarMaiorNumero(vet);
		sequencia.exibirMaiorNumero(maior);
	}
}
