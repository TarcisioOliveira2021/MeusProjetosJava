package br.ucsal.poo2019.TUI;

import java.util.Set;

import br.ucsal.poo2019.business.MedicoBO;
import br.ucsal.poo2019.domain.Medico;
import br.ucsal.poo2019.exception.BusinessExceptions;

public class MedicoTUI {
	// Constantes
	// Atributos
	// Construtores
	// Métodos públicos
	// Métodos privados
	public static void inserir(Medico medico) {
		try {
			MedicoBO.inserir(medico);
		} catch (BusinessExceptions e) {
			System.out.println("Erro: " + e.getMessage());
			System.exit(0);
		} finally {
			System.out.println("Fim da inclusao.");
		}
	}

	public static void listarEspecialidades() {
		Set<String> especialidades = MedicoBO.listaEspecialidades();
		System.out.println("***************** Lista ***************");
		System.out.println("       Todas as especialidades\n");
		for (String string : especialidades) {
			System.out.println(string);
		}
	}
}
