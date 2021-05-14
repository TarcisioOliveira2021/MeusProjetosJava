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

		// UPCAST: é uma conversão para a superclasse (em qualquer nível)
		// Pode ser implícito
		Veiculo veiculo1 = moto1;
		Veiculo veiculo2 = new Moto();
		Veiculo veiculo3 = veiculoCarga1;
		Veiculo veiculo4 = veiculoPasseio1;

		// Não é possível instanciar veículo, pois o mesmo foi definido como
		// abstrato.
		// Veiculo veiculo3 = new Veiculo();

		System.out.println(moto1.getQtdCilindradas());
		System.out.println(moto1.getPlaca());

		// System.out.println(veiculo1.getQtdCilindradas());
		System.out.println(veiculo1.getPlaca());

		// DOWNCAST: é uma conversão para a subclasse (em qualquer nível)
		// DEVE ser explícito.
		// E NEM SEMPRE FUNCIONA!
		Moto moto2 = (Moto) veiculo2;
		
		// O cast de veiculo3 para Moto não funciona, pois veiculo3 é do tipo
		// VeiculoCarga
		// Ocorrerá um ClassCastException
		// Moto moto3 = (Moto) veiculo3;

		// CAST não qualquer conversão , tem que respeitar a hierarquia.
		// Um cast de Pessoa pra Moto não é aceito nem em tempo de compilação.
		// Moto moto4 = (Moto) pessoa1;

		// A apresentação da lista utiliza o princípio do polimorfismo para o
		// método toString;
		System.out.println("Lista de veículos:");
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.toString());
			// Mesmo que não seja explícita a chamada ao toString , a mesma
			// ocorrerá via método println.
			// System.out.println(veiculo);
		}

		List<Object> coisas = new ArrayList<>();
		coisas.add(veiculo2);
		coisas.add("Claduio");
		coisas.add(123);

	}

}
