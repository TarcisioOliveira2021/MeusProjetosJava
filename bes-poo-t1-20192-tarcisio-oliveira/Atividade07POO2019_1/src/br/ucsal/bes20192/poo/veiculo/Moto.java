package br.ucsal.bes20192.poo.veiculo;

public class Moto extends Veiculo {

	private String categoria;

	private Integer quantCilindradas;

	public Moto(String nome, String cpf, String estado, String placa, Integer valor, String categoria) {
		super(nome, cpf, estado, placa, valor);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getQuantCilindradas() {
		return quantCilindradas;
	}

	public void setQuantCilindradas(Integer quantCilindradas) {
		this.quantCilindradas = quantCilindradas;
	}

}
