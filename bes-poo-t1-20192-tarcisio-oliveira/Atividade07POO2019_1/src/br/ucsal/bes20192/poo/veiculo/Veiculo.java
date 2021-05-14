package br.ucsal.bes20192.poo.veiculo;

import java.util.Date;

public class Veiculo extends Dono {

	private String placa;

	private Date anoDeFabricacao;

	private Integer valor;

	public Veiculo(String nome, String cpf, String estado, String placa, Integer valor) {
		super(nome, cpf, estado);
		this.placa = placa;
		this.valor = valor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(Date anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

}
