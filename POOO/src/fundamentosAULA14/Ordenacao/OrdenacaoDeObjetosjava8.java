package fundamentosAULA14.Ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoDeObjetosjava8 {
public static void main(String[] args) {
	//Criacao de um lista de pessoas.
	List<Pessoa> pessoas = new ArrayList<>();
	//Adicionando pessoas a lista.
	pessoas.add(new Pessoa("AlanzokaTopOneInBrazilMan",2000,"Maria"));
	pessoas.add(new Pessoa("Brendo",1973,"Claudete"));
	pessoas.add(new Pessoa("Claudio",2001,"Gloria"));
	pessoas.add(new Pessoa("Damiani",1995,"Gloria"));
	pessoas.add(new Pessoa("Edno",1979,"Suzete"));
	pessoas.add(new Pessoa("Fernando",2000,"Suzete"));
	pessoas.add(new Pessoa("Gabriel",2003,"Rosecleya"));
	
	//Lista de pessoas na ordem informada.
	System.out.println("\nPessoas, na ordem que foram inforamdas:");
	exbirListaPessoas(pessoas);
	//Lista de pessoas em ordem crescente.
	System.out.println("\nPessoas, em ordem crescente de nome da pessoa:");
	pessoas.sort(Comparator.naturalOrder());
	//exibe a lista.
	exbirListaPessoas(pessoas);
	//Lista de pessoas em crescente do ano de nascimento.
	System.out.println("\nPessoas, em ordem crescente de ano de nascimento:");
	
	//Alternativa nao muito boa.
	/*
	 Collections.sort(pessoas, new Comparator<Pessoa>() {
	 @Override
	 public int compare(Pessoa o1, Pessoa o2) {
	 return o1.getAnoNascimento().compareTo(o2.getAnoNascimento());
	 }
	 });
	 pessoas.sort((Pessoa p1, Pessoa p2) ->
	 p1.getAnoNascimento().compareTo(p2.getAnoNascimento()));
	*/

	//Usar o segundo comparing e prestar atencao.
	pessoas.sort(Comparator.comparing(Pessoa::getAnoDeNascimento));
	//exibe a lista.
	exbirListaPessoas(pessoas);
	
	//Compra as pessoas por ordem crecente do nome da mae e do nome da pessoa
	System.out.println("\nPessoas, em ordem crescente de nome da mãe e, para a mesma mãe, por ordem crescente de nome da pessoa:");
	//Compare o nome da mae de cada pesso e depois compare o nome da pessoa e ordene em ordem crescente.
	pessoas.sort(Comparator.comparing(Pessoa::getNomeMae).thenComparing(Pessoa::getNome));
	//Exibe a lista
	exbirListaPessoas(pessoas);

}

//Metodo que exibe a lista de pessoas.
private static void exbirListaPessoas(List<Pessoa> pessoas) {
	for (Pessoa pessoa : pessoas) {
	System.out.println(pessoa);	
	}
}
}
