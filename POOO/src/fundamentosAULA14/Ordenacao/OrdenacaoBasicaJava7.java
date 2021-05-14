package fundamentosAULA14.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoBasicaJava7 {
public static void main(String[] args) {
	//Variaveis.
	
	String nome1 = "A";
	String nome2 = "B";
	//Faz a comparacao.
	System.out.println("Comparacao nome1 com nome2"+ nome1.compareTo(nome2));
	//Criacao de uma lista de nomes
	List<String> nomes = new ArrayList<>();
	//Adicionando nomes a esta lista.
	nomes.add("A");
	nomes.add("C");
	nomes.add("D");
	nomes.add("E");
	nomes.add("F");
	
	System.out.println("Nomes, na ordem que foram inforamdos:");
	System.out.println(nomes);
	
	System.out.println("Nomes, em ordem crescente:");
	//Interface collections que contem o metodo sort que ordena por ordem crescente.
	Collections.sort(nomes);
	System.out.println(nomes);
	
	System.out.println("Nomes, em ordem decrescente:");
	// Atenção, o reverse apenas inverte a listas, para que ela fique em ordem
	// decrescente, é preciso chamar previamente o sort para funcionar.
	//Fake reverse.
	Collections.reverse(nomes);
	System.out.println(nomes);

	
}
}
