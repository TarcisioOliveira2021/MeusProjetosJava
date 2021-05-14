package br.ucsal.poo2019.TUI;

import br.ucsal.poo2019.business.EnfermeiroBO;
import br.ucsal.poo2019.domain.Enfermeiro;
import br.ucsal.poo2019.exception.BusinessExceptions;

public class EnfermeiroTUI {
	// Constantes
	// Atributos
	// Construtores
	// Métodos públicos
	// Métodos privados
	
	public static void inserir(Enfermeiro enfermeiro) {
		try {
			EnfermeiroBO.inserir(enfermeiro);
		} catch (BusinessExceptions e) {
			System.out.println("Erro: " + e.getMessage());
			System.exit(0);
		} finally {
			System.out.println("Fim da inclusao.");
		}
	}
}
