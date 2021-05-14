package br.ucsal.edu.br.TUI;

import java.util.List;

import br.ucsal.edu.br.domain.PontoTuristico;

public class PontoTuristicoTUI {

	public static void listar(List<PontoTuristico> pontosTuristicos) {
		for (PontoTuristico pontoTuristico : pontosTuristicos) {
			System.out.println(pontoTuristico);
		}
	}
}
