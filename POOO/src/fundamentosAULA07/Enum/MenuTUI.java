package fundamentosAULA07.Enum;

import java.util.Scanner;

public class MenuTUI {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		//Cria uma variavel para receber a opcao com base na enumeracao
		ItensMenuEnum opcaoSelecionada;
		exibirOpcoesMenu();
		opcaoSelecionada = obterOpcaoSelecio();
		//Escreve comparando o codigo a descricao da opcao escolhida
		System.out.println("opcao selecionada = "+opcaoSelecionada.getDescricao());
	}

	private static ItensMenuEnum obterOpcaoSelecio() {
		Integer opcaoSelecionadaConvercao;
		ItensMenuEnum opcaoSelecionada;
		
		System.out.println("Informe a opcao: ");
		opcaoSelecionadaConvercao = scanner.nextInt();
		
		//Converte a opcao inteira em item de menu passando para o metodo valueofCodigo
		opcaoSelecionada = ItensMenuEnum.valueOfCodigo(opcaoSelecionadaConvercao);
		return opcaoSelecionada;
	}

	private static void exibirOpcoesMenu() {
		//lista as opcoes do menu contidas na enum
		for (ItensMenuEnum itemMenu : ItensMenuEnum.values()) {
			// Aqui mostra o numero do item mais sua descricao.
			System.out.println(itemMenu.getCodigo() + "----" +itemMenu.getDescricao());
		}
		
	}
}
