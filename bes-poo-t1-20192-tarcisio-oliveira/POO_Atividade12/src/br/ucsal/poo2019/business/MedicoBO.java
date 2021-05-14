package br.ucsal.poo2019.business;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.ucsal.poo2019.domain.Medico;
import br.ucsal.poo2019.exception.BusinessExceptions;
import br.ucsal.poo2019.persistence.FuncionarioDAO;

public class MedicoBO {
	// Constantes
	// Atributos
	// Construtores
	// Métodos públicos
	// Métodos privados

	public static List<Medico> medicos = new ArrayList<>();
	public static Set<String> medicosEspecialidades = new HashSet<>();

	public static void inserir(Medico medico) throws BusinessExceptions {
		validarMedico(medico);
		medicos.add(medico);
		pegaEspecialidade(medico.getEspecialidades());
		FuncionarioDAO.incluir(medico);

	}

	public static Set<String> listaEspecialidades() {
		return medicosEspecialidades;
	}

	private static Set<String> pegaEspecialidade(List<String> especialidades) {
		for (int i = 0; i < especialidades.size(); i++) {
			medicosEspecialidades.add(especialidades.get(i));
		}
		return medicosEspecialidades;
	}

	private static void validarMedico(Medico medico) throws BusinessExceptions {
		if (medico.getNome() == null || medico.getNome().equals("")) {
			throw new BusinessExceptions("Impossivel registrar o medico.\nMotivo: O nome do medico é obrigatorio.");
		}
		if (medico.getCrm() == null) {
			throw new BusinessExceptions("Impossivel registrar o medico.\nMotivo: O CRM do medico é obrigatorio.");
		}
		for (int i = 0; i < medicos.size(); i++) {
			if (medicos.get(i).getCrm().equals(medico.getCrm())
					&& medicos.get(i).getMatricula() != medico.getMatricula()) {
				throw new BusinessExceptions("Impossivel registrar o medioco.\nMotivo: O CRM do medico já existe.");
			}
		}
	}

}
