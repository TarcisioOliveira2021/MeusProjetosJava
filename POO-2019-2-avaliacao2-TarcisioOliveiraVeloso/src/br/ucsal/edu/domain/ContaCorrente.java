package br.ucsal.edu.domain;

public class ContaCorrente {

	private String nomeTitular;
	public Integer codigoAgencia;
	public Integer codigoConta;
	public Double saldo;

	public ContaCorrente(String nomeTitular, Integer codigoAgencia, Integer codigoConta, Double saldo) {
		this.nomeTitular = nomeTitular;
		this.codigoAgencia = codigoAgencia;
		this.codigoConta = codigoConta;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Integer getCodigoAgencia() {
		return codigoAgencia;
	}

	public void setCodigoAgencia(Integer codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
	}

	public Integer getCodigoConta() {
		return codigoConta;
	}

	public void setCodigoConta(Integer codigoConta) {
		this.codigoConta = codigoConta;
	}

	public Double sacar(Double valorSaque) {
		Double saldoAtual = saldo;
		saldoAtual -= valorSaque;
		return saldoAtual; 
	}

	public static Double depositar(Double valorDeposito) {
		
	}

	public static Double consultarSaldo() {
		// Double saldoAtual = saldo;
		return saldoAtual;
	}

	@Override
	public String toString() {
		return "ContaCorrente [nomeTitular=" + nomeTitular + ", codigoAgencia=" + codigoAgencia + ", codigoConta="
				+ codigoConta + ", saldo=" + saldo + "]";
	}

}
