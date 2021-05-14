package br.ucsal.bes20192.poo.veiculo;

public class VeiculoDeCarga extends Veiculo {

	private Integer capacidadeMaximaCarga;

	private Integer quantEixos;

	private Integer capacidadeCombustivel;

	public VeiculoDeCarga(String nome, String cpf, String estado, String placa, Integer valor,
			Integer capacidadeMaximaCarga) {
		super(nome, cpf, estado, placa, valor);
		this.capacidadeMaximaCarga = capacidadeMaximaCarga;
	}

	public Integer getCapacidadeMaximaCarga() {
		return capacidadeMaximaCarga;
	}

	public void setCapacidadeMaximaCarga(Integer capacidadeMaximaCarga) {
		this.capacidadeMaximaCarga = capacidadeMaximaCarga;
	}

	public Integer getQuantEixos() {
		return quantEixos;
	}

	public void setQuantEixos(Integer quantEixos) {
		this.quantEixos = quantEixos;
	}

	public Integer getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(Integer capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

}
