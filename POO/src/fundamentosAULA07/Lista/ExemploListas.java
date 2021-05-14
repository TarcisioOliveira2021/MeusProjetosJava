package fundamentosAULA07.Lista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExemploListas {

	private static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		//Declarando lista de nomes vazia 
		//<Elemento (pode ser um datatype ou 
		//um objeto>
		//Lembrar de importar o pacore list.util
		List<String> nomes = null;
		String tipoLista;
		
		System.out.print("Informe o tipo de lista que deseja usar, ArrayList(A) ou linkedList(B):");
		tipoLista = scr.nextLine();
		
		//equalIgnoreCase = procura verificar
		//se o valor é o msm indepentende se
		//o usuario colocou maiusculo ou minusculo
		if(tipoLista.equalsIgnoreCase("A")) {
			nomes = new ArrayList<String>();
		}else {
			nomes = new LinkedList<String>();
		}
		//getClass().getCanonicalName = retorna o Datatype do atributo.
		System.out.println("O Datatype escolhido foi:"+ nomes.getClass().getCanonicalName());
		
		nomes.add("jesus");
		nomes.add("Amanha");
		nomes.add("fazer a diference");
		
		//ForEach serve para varrer o vetor 
		for (String nome : nomes) {
		System.out.println(nome);	
		}
		
		//Exibi a quantidade de valores detro do array
		//Exibi a quantidade de nomes dentro do arry
		System.out.println("Existem na lista " +nomes.size() + " Pessoas:");
	}

}
