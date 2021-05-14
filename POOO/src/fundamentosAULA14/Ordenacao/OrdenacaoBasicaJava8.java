package fundamentosAULA14.Ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoBasicaJava8 {
public static void main(String[] args) {
	//Criacao de uma lista de nomes.
	List<String> nomes = new ArrayList<>();
	//Adicionando nomes.
	nomes.add("a");
	nomes.add("b");
	nomes.add("c");
	nomes.add("d");
	nomes.add("e");
	//Impreme na ordem que foram inseridos na lista.
	System.out.println("Nomes, na ordem que foram inforamdos:");
	System.out.println(nomes);
	
	System.out.println("Nomes, em ordem decrescente:");
	// Diferente do reverse do Collection.sort, o reverseOrder ordena em ordem
	// inversa de verdade.
	nomes.sort(Comparator.reverseOrder());
	System.out.println(nomes);
	
	
	System.out.println("Nomes, em ordem crescente:");
	nomes.sort(Comparator.naturalOrder());
	System.out.println(nomes);
}
}
