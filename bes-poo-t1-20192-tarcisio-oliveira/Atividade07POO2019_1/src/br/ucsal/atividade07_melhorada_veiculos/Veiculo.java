package br.ucsal.atividade07_melhorada_veiculos;

public class Veiculo {

	// Este atributo não faz parte do requisito.
	private static Integer seq = 0;

	// Este atributo não faz parte do requisito.
	private Integer id;

	private String placa;

	private Integer anoFabricacao;

	private Double valor;

	private Pessoa proprietario;

	public Veiculo(String placa, Integer anoFabricacao, Double valor, Pessoa proprietario) {
		super();

		// Este comportamento não faz parte do requisito.
		seq++;
		this.id = seq;

		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.valor = valor;
		this.proprietario = proprietario;
	}

	public Integer getId() {
		return id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

}
