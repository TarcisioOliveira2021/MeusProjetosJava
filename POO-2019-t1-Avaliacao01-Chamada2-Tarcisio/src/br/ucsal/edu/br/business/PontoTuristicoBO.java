package br.ucsal.edu.br.business;

import java.util.List;

import br.ucsal.edu.br.domain.ChefeCozinha;
import br.ucsal.edu.br.domain.Igreja;
import br.ucsal.edu.br.domain.PontoTuristico;
import br.ucsal.edu.br.domain.Restaurante;
import br.ucsal.edu.br.domain.TiposArquiteturaIgreja;
import br.ucsal.edu.br.persistence.PontoTuristicoDAO;

public class PontoTuristicoBO {

	public static void cadastrarIgreja(String logradouro, String bairro, String nome,
			TiposArquiteturaIgreja arquitetura, Integer anoCostrucao) {
		Igreja igreja = new Igreja(logradouro, bairro, nome, arquitetura, anoCostrucao);
		PontoTuristicoDAO.salvar(igreja);

	}

	public static void cadastrarRestaurante(String logradouro, String bairro, String nome, List<String> tiposComidas,
			ChefeCozinha masterchef) {
		Restaurante restaurante = new Restaurante(logradouro, bairro, nome, tiposComidas, masterchef);
		PontoTuristicoDAO.salvar(restaurante);

	}

	public static List<PontoTuristico> obterPontos(List<PontoTuristico> pontosTuristicos) {
		return pontosTuristicos;
	}
	

}
