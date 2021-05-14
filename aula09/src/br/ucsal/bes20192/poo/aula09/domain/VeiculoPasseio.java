package br.ucsal.bes20192.poo.aula09.domain;

public class VeiculoPasseio extends Veiculo {

	private Integer qtdMaxPassageiros;

	private Integer capacidadePortaMalas;

	public VeiculoPasseio() {
	}

	public VeiculoPasseio(String placa, Integer anoFabricacao, Double valor, Pessoa proprietario,
			Integer qtdMaxPassageiros, Integer capacidadePortaMalas) {
		super(placa, anoFabricacao, valor, proprietario);
		this.qtdMaxPassageiros = qtdMaxPassageiros;
		this.capacidadePortaMalas = capacidadePortaMalas;
	}

	public Integer getQtdMaxPassageiros() {
		return qtdMaxPassageiros;
	}

	public void setQtdMaxPassageiros(Integer qtdMaxPassageiros) {
		this.qtdMaxPassageiros = qtdMaxPassageiros;
	}

	public Integer getCapacidadePortaMalas() {
		return capacidadePortaMalas;
	}

	public void setCapacidadePortaMalas(Integer capacidadePortaMalas) {
		this.capacidadePortaMalas = capacidadePortaMalas;
	}

	@Override
	public String toString() {
		return "VeiculoPasseio [qtdMaxPassageiros=" + qtdMaxPassageiros + ", capacidadePortaMalas="
				+ capacidadePortaMalas + ", toString()=" + super.toString() + "]";
	}

}
