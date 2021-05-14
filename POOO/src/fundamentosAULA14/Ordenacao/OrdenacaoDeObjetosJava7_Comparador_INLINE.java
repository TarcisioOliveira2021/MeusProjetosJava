package fundamentosAULA14.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class OrdenacaoDeObjetosJava7_Comparador_INLINE {
public static void main(String[] args) {
	//Criando pessoas
	Pessoa pessoa1 = new Pessoa("A",1900,"claudete");
	Pessoa pessoa2 = new Pessoa("B",1920,"cladiana");
	//Comparacao entre pessoas.
	System.out.println("Pessoa1 comparando com pessoa2 ="+pessoa1.compareTo(pessoa2));
	
	//Criando uma lista de pessoas
	List<Pessoa> pessoas = new ArrayList<>();
	//Inserindo pessoas.
	pessoas.add(new Pessoa("A",1900,"claudete"));
	pessoas.add(new Pessoa("J",2000,"claudete"));
	pessoas.add(new Pessoa("M",1990,"claudete"));
	pessoas.add(new Pessoa("L",1980,"claudete"));
	pessoas.add(new Pessoa("G",1910,"claudete"));
	pessoas.add(new Pessoa("W",2002,"claudete"));
	pessoas.add(new Pessoa("X",2001,"claudete"));
	//Exibindo pessoas na ordem informada.
	System.out.println("\nPessoas, na ordem que foram inforamdas:");
	exbirListaPessoas(pessoas);
	//Exibindo pessoas na ordem crescente pelo nome da pessoa.
	System.out.println("\nPessoas, em ordem crescente de nome da pessoa:");
	Collections.sort(pessoas);
	exbirListaPessoas(pessoas);
	
	System.out.println("\nPessoas, em ordem crescente de ano de nascimento:");
	//Comparacao feita Inline
	Collections.sort(pessoas, new Comparator<Pessoa>() {
		public int compare(Pessoa o1, Pessoa o2) {
			return o1.getAnoDeNascimento().compareTo(o2.getAnoDeNascimento());
		}
	});
	//Exibindo pessoas em ordem crescente de ano de nascimento.
	exbirListaPessoas(pessoas);
	
	//Exibe em ordem "Decrescente".
	System.out.println("\nNomes, em ordem decrescente de nome da pessoa:");
	// Atenção, o reverse apenas inverte a listas, para que ela fique em ordem
	// decrescente, é preciso chamar previamente o sort.
	Collections.reverse(pessoas);
	exbirListaPessoas(pessoas);

	System.out.println("\nPessoas, em ordem crescente de nome da mãe e, para a mesma mãe, por ordem crescente de nome da pessoa:");
	//Comparacao Inline.
	Collections.sort(pessoas, new Comparator<Pessoa>() {
		public int compare(Pessoa o1, Pessoa o2) {
			int resultado = o1.getNomeMae().compareTo(o2.getNomeMae());
			if (resultado == 0) {
				resultado = o1.getNome().compareTo(o2.getNome());
			}
			return resultado;
		}
	});
	//Exibe a lista com as pessoas ordenadas 1 por nome da mae e 2 pelo nome.
	exbirListaPessoas(pessoas);

}

//Metodo que exibe a lista de pessoas.
private static void exbirListaPessoas(List<Pessoa> pessoas) {
	//Estrutra que forEach que varre o array de pessoas.
	for (Pessoa pessoa : pessoas) {
		System.out.println(pessoa);
	}
}
}
