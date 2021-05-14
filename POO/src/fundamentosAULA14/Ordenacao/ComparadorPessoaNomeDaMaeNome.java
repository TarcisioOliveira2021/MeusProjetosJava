package fundamentosAULA14.Ordenacao;

import java.util.Comparator;

//A classe ComparadorPessoaNomeDaMae se compromete com comparator.
public class ComparadorPessoaNomeDaMaeNome implements Comparator<Pessoa> {
	
	@Override
	//Metodo que compara(Recebendo duas pessoas)
	public int compare(Pessoa o1, Pessoa o2) {
		//A variavel resultado recebe o valor da comparacao da pessoa1 nomeDaMae por pessoa2.
		int resultado = o1.getNomeMae().compareTo(o2.getNomeMae());
		//quando for 0 ele ordena por nome da pessoa.
		if(resultado== 0) {
			resultado = o1.getNome().compareTo(o2.getNome());
		}
		//Retorna o resultado da comparacao da pessoa1 pela 2 obedecendo os criterios de nomeDaMae e nome.
		return resultado;
	}

}
