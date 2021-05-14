package br.ucsal.bes20192.poo.veiculo;

public class VeiculoDePasseio extends Veiculo {

	private Integer quantPassageiros;

	private Integer capacidadePortaMalas;

	public VeiculoDePasseio(String nome, String cpf, String estado, String placa, Integer valor,
			Integer quantPassageiros) {
		super(nome, cpf, estado, placa, valor);
		this.quantPassageiros = quantPassageiros;
	}

	public Integer getQuantPassageiros() {
		return quantPassageiros;
	}

	public void setQuantPassageiros(Integer quantPassageiros) {
		this.quantPassageiros = quantPassageiros;
	}

	public Integer getCapacidadePortaMalas() {
		return capacidadePortaMalas;
	}

	public void setCapacidadePortaMalas(Integer capacidadePortaMalas) {
		this.capacidadePortaMalas = capacidadePortaMalas;
	}

}
