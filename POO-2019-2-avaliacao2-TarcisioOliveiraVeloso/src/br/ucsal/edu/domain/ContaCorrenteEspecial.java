package br.ucsal.edu.domain;

public class ContaCorrenteEspecial extends ContaCorrente{

	private Double limiteCredito;

	public ContaCorrenteEspecial(String nomeTitular, Integer codigoAgencia, Integer codigoConta, Double saldo,
			Double limiteCredito) {
		super(nomeTitular, codigoAgencia, codigoConta, saldo);
		this.limiteCredito = limiteCredito;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public Double sacar(Double valorSaque) {
		//Double saldoAtual = // saldo - valorSaque;
		return saldoAtual; 
	}

	public static Double depositar(Double valorDeposito) {
		//Double saldoAtual = valorDeposito + saldo;
	}

	public static Double consultarSaldo() {
		//Double saldoAtual = saldo;
		return saldoAtual;
	}

	@Override
	public String toString() {
		return "ContaCorrenteEspecial [limiteCredito=" + limiteCredito + ", getNomeTitular()=" + getNomeTitular()
				+ ", getCodigoAgencia()=" + getCodigoAgencia() + ", getCodigoConta()=" + getCodigoConta()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
