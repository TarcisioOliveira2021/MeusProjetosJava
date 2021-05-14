package fundamentosAULA14.Ordenacao;

import java.util.Comparator;

//Comparacao por ano de Nascimento em ordem crescente.
public class ComparadorPessoaPorAnoDeNascimento implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getAnoDeNascimento().compareTo(o2.getAnoDeNascimento());
	}

}
