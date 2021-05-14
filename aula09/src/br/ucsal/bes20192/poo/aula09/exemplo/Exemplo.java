package br.ucsal.bes20192.poo.aula09.exemplo;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.bes20192.poo.aula09.domain.Moto;
import br.ucsal.bes20192.poo.aula09.domain.Pessoa;
import br.ucsal.bes20192.poo.aula09.domain.Veiculo;
import br.ucsal.bes20192.poo.aula09.domain.VeiculoCarga;
import br.ucsal.bes20192.poo.aula09.domain.VeiculoPasseio;

public class Exemplo {

	public static void main(String[] args) {

		Moto moto1 = new Moto();
		VeiculoCarga veiculoCarga1 = new VeiculoCarga();
		VeiculoPasseio veiculoPasseio1 = new VeiculoPasseio();

		Pessoa pessoa1 = new Pessoa();

		List<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(moto1);
		veiculos.add(veiculoCarga1);
		veiculos.add(veiculoPasseio1);

		// UPCAST: � uma convers�o para a superclasse (em qualquer n�vel)
		// Pode ser impl�cito
		Veiculo veiculo1 = moto1;
		Veiculo veiculo2 = new Moto();
		Veiculo veiculo3 = veiculoCarga1;
		Veiculo veiculo4 = veiculoPasseio1;

		// N�o � poss�vel instanciar ve�culo, pois o mesmo foi definido como
		// abstrato.
		// Veiculo veiculo3 = new Veiculo();

		System.out.println(moto1.getQtdCilindradas());
		System.out.println(moto1.getPlaca());

		// System.out.println(veiculo1.getQtdCilindradas());
		System.out.println(veiculo1.getPlaca());

		// DOWNCAST: � uma convers�o para a subclasse (em qualquer n�vel)
		// DEVE ser expl�cito.
		// E NEM SEMPRE FUNCIONA!
		Moto moto2 = (Moto) veiculo2;
		
		// O cast de veiculo3 para Moto n�o funciona, pois veiculo3 � do tipo
		// VeiculoCarga
		// Ocorrer� um ClassCastException
		// Moto moto3 = (Moto) veiculo3;

		// CAST n�o qualquer convers�o , tem que respeitar a hierarquia.
		// Um cast de Pessoa pra Moto n�o � aceito nem em tempo de compila��o.
		// Moto moto4 = (Moto) pessoa1;

		// A apresenta��o da lista utiliza o princ�pio do polimorfismo para o
		// m�todo toString;
		System.out.println("Lista de ve�culos:");
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.toString());
			// Mesmo que n�o seja expl�cita a chamada ao toString , a mesma
			// ocorrer� via m�todo println.
			// System.out.println(veiculo);
		}

		List<Object> coisas = new ArrayList<>();
		coisas.add(veiculo2);
		coisas.add("Claduio");
		coisas.add(123);

	}

}
