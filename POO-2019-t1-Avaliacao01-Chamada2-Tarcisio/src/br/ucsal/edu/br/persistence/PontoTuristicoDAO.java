package br.ucsal.edu.br.persistence;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.edu.br.business.PontoTuristicoBO;
import br.ucsal.edu.br.domain.PontoTuristico;

public class PontoTuristicoDAO {
	private static List<PontoTuristico> pontosTuristicos = new ArrayList<>();

	public static void salvar(PontoTuristico ponto) {
		pontosTuristicos.add(ponto);
	}

	public List<PontoTuristico> obterPontos() {
		return PontoTuristicoBO.obterPontos(pontosTuristicos);
	}

}
