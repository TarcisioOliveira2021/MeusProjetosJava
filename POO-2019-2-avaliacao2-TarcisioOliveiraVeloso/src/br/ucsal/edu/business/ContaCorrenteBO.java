package br.ucsal.edu.business;

import java.awt.List;
import java.util.Set;

import br.ucsal.edu.domain.ContaCorrente;
import br.ucsal.edu.domain.ContaCorrenteEspecial;
import br.ucsal.edu.exception.ContaCorrenteNaoEncontradaException;
import br.ucsal.edu.exception.SaldoInsuficienteException;
import br.ucsal.edu.persistence.ContaCorrenteDAO;

public class ContaCorrenteBO {
	public static void cadastrarContaCorrenteEspecial(ContaCorrenteEspecial contaCorrenteEspecial) {
		ContaCorrenteDAO.salvar(contaCorrenteEspecial);
	}

	public static void sacar(Double valorSaque,Integer codigoAgencia,Integer codigoConta) throws ContaCorrenteNaoEncontradaException, SaldoInsuficienteException {
		if(valorSaque > ContaCorrenteDAO.pesquisar(codigoAgencia,codigoConta).saldo) {
			throw new SaldoInsuficienteException("Saldo Insuficiente.");
		}
		if(valorSaque > ContaCorrenteDAO.pesquisar(codigoAgencia,codigoConta).saldo && valorSaque > ContaCorrenteDAO.pesquisar(codigoAgencia, codigoConta).){
			
		}
	}

	public static Integer obterCodigosAgencia(){
		//Ultilizar Set<Integer>codigosAgencia = new HashSet<>();
		
		return null;

	}

	public static List<ContaCorrente> obterContasOrdemSaldo() {
		//Retorna uma lista de contas corrente e especiais por ordem de salario: sort.Comparator.Comparing.
		return null;

	}

	public static List<ContaCorrente> obterContasOrdemNomeTitular() {
		//retorna uma lista de contas correntes e especiais por ordem de nome do titular ^^
		
	}
}
