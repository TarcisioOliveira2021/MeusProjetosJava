package br.ucsal.bes20192.poo.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade09BList {

	private static final int QTD_NOMES = 20;

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		obterEExibirNomesEQuantidades();
	}

	private static void obterEExibirNomesEQuantidades() {
		List<String> nomes = new ArrayList<>();
		List<Integer> quantidades = new ArrayList<>();
		System.out.println("Informe " + QTD_NOMES + " nomes:");
		for (int i = 0; i < QTD_NOMES; i++) {
			String nome = sc.nextLine();
			Integer posicaoNome = nomes.indexOf(nome);
			if (posicaoNome < 0) {
				// Nome não está na lista, devo adicionar o mesmo e indicar que ele ocorreu, até
				// agora, uma única vez.
				nomes.add(nome);
				quantidades.add(1);
			} else {
				// Se posição maior ou igual à zero, é porque o nome está na lista e devemos
				// incrementar a quantidade.;
				Integer qtdAtual = quantidades.get(posicaoNome);
				quantidades.set(posicaoNome, qtdAtual + 1);
			}
		}

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i) + " x " + quantidades.get(i));
		}
	}

}
