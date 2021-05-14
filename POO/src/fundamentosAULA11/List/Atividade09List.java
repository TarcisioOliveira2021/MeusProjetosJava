package fundamentosAULA11.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade09List {
	//Define a constante (final) chamada QTD_NOMES que tem como valor 20;
	private static final int QTD_NOMES = 20;
	//Criacao do Scanner.
	private static Scanner scr = new Scanner(System.in);
	
	//Metodo main.
	public static void main(String[] args) {
		executar();
	}
	//Metodo que executa o programa.
	private static void executar() {
		//Criacao de uma Lista de nomes usando o List e o seu filho ArrayList.
		List <String> nomes = new ArrayList<>();
		//Criacao de uma Lista de Quantidades. 
		List <Integer> quantidades = new ArrayList<>();
		
		System.out.println("Informe "+QTD_NOMES+" nomes: ");
		//For que adiciona na lista de nomes os nomes informados enquanto o i for menor que QTD_NOMES.
		for (int i = 0; i < QTD_NOMES; i++) {
			//A variavel nome recebe o conteudo digitado.
			String nome = scr.nextLine();
			//Variavel que guarda a posicao do nome inserido.
			Integer posicaoNome = nomes.indexOf(nome); 
			//Caso a posicao do nome seja menor que < 0 
			if(posicaoNome < 0) {
				//Adiciona o nome na lista.
				nomes.add(nome);
				//Adiciona 1 na lista de quantidades referente ao nome.
				quantidades.add(1);
			//Se nao
			}else {
				//É criada uma varivel que guarda a quantidade atual do nome com relacao a posicao.
				Integer qtdAtual = quantidades.get(posicaoNome);
				//e coloca nela a posicao do nome e soma mais 1, caso o nome seja inserido duas ou mais vezes.
				quantidades.set(posicaoNome, qtdAtual + 1);
			}
		}
		//Aqui a lista é escrita.
		for (int i = 0; i < nomes.size(); i++) {
			//Informando os nomes e suas respectivas quantidades.
			System.out.println(nomes.get(i)+" -- "+quantidades.get(i));
		}
	}
}
