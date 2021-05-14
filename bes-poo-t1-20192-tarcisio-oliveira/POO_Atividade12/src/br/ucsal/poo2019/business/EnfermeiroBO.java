package br.ucsal.poo2019.business;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.poo2019.domain.Enfermeiro;
import br.ucsal.poo2019.domain.TipoAtuacaoEnum;
import br.ucsal.poo2019.exception.BusinessExceptions;
import br.ucsal.poo2019.persistence.FuncionarioDAO;

public class EnfermeiroBO {
	// Constantes
	// Atributos
	// Construtores
	// Métodos públicos
	// Métodos privados
	public static List<Enfermeiro> enfermeiros = new ArrayList<>();
	
	public static void inserir(Enfermeiro enfermeiro) throws BusinessExceptions {
		enfermeiros.add(enfermeiro);
		validarEnfermeiro(enfermeiro);
		FuncionarioDAO.incluir(enfermeiro);
	}

	private static void validarEnfermeiro(Enfermeiro enfermeiro) throws BusinessExceptions {

		if (enfermeiro.getAtuacao().equals(TipoAtuacaoEnum.ASSISTENCIA) && enfermeiro.getCargaHoraria() < 12) {
			throw new BusinessExceptions(
					"Impossivel registrar o enfermeiro.\nMotivo: Enfermeiros com atuacao na assistencia devem ter no minimo 12 horas de carga horaria.");
		}
		if (enfermeiro.getNome() == null || enfermeiro.getNome().equals("")) {
			throw new BusinessExceptions(
					"Impossivel registrar o enfermeiro.\nMotivo: O nome do enfermeiro é obrigatorio.");
		}
		if (enfermeiro.getCoren() == null) {
			throw new BusinessExceptions(
					"Impossivel registrar o enfermeiro.\nMotivo: O COREN do enfermeiro é obrigatorio.");
		}
		for (int i = 0; i < enfermeiros.size(); i++) {
			if (enfermeiros.get(i).getCoren().equals(enfermeiro.getCoren())
					&& enfermeiros.get(i).getMatricula() != enfermeiro.getMatricula()) {
				throw new BusinessExceptions(
						"Impossivel registrar o enfermeiro.\nMotivo: O COREN do enfermeiro já existe.");
			}
		}
	}
}
