package br.ucsal.edu.TUI;

import br.ucsal.edu.business.ContaCorrenteBO;

public class ContaCorrenteTUI {
	public static void sacar() {
		Integer codigoAgencia;
		Integer codigoConta;
		Double valorSaque;

		codigoAgencia = UtilTUI.inteiro("Informe o codigo da agencia: ");
		codigoConta = UtilTUI.inteiro("Informe o codigo da conta: ");
		valorSaque = UtilTUI.valorDouble("Informe o valor a ser sacado.");
		ContaCorrenteBO.sacar(valorSaque, codigoAgencia, codigoConta);
	}
}
