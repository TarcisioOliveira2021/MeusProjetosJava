package br.ucsal.bes20192.poo.atividade07.veiculo;

public class Moto extends Veiculo {

	// FIXME Refatorar a categoria da Moto para uma enumeração.
	private CategoriaMotoEnum categoria;

	private Integer qtdCilindradas;

	public Moto(String placa, Integer anoFabricacao, Double valor, Pessoa proprietario, CategoriaMotoEnum categoria,
			Integer qtdCilindradas) {
		super(placa, anoFabricacao, valor, proprietario);
		this.categoria = categoria;
		this.qtdCilindradas = qtdCilindradas;
	}

	public CategoriaMotoEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaMotoEnum categoria) {
		this.categoria = categoria;
	}

	public Integer getQtdCilindradas() {
		return qtdCilindradas;
	}

	public void setQtdCilindradas(Integer qtdCilindradas) {
		this.qtdCilindradas = qtdCilindradas;
	}

	@Override
	public String toString() {
		return "Moto [categoria=" + categoria + ", qtdCilindradas=" + qtdCilindradas + "]";
	}

}
