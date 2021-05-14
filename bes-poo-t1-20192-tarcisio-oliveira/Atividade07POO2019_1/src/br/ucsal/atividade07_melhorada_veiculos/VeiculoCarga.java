package br.ucsal.atividade07_melhorada_veiculos;

public class VeiculoCarga extends Veiculo {

	private Integer capacidadeCarga;

	private Integer capacidadeCombustivel;

	public VeiculoCarga(String placa, Integer anoFabricacao, Double valor, Pessoa proprietario, Integer capacidadeCarga,
			Integer capacidadeCombustivel) {
		super(placa, anoFabricacao, valor, proprietario);
		this.capacidadeCarga = capacidadeCarga;
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	public Integer getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(Integer capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public Integer getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(Integer capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

}
