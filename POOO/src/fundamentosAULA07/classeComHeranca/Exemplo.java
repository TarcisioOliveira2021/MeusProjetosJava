package fundamentosAULA07.classeComHeranca;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {

	public static void main(String[] args) {
		//Lista de veiculos.
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		Veiculo veiculo1 = new Veiculo();
		veiculo1.placa = "asadadsa";
		veiculo1.anoFabricacao = 2001;
		//Adicionando um veiculo a lista.
		veiculos.add(veiculo1);
		//Foreach varre o vetor.
		//Aqui escreve o entedereço de memoria
		for (Veiculo veiculo : veiculos) {
		System.out.println(veiculo.toString());	
		}
		
	}
}
