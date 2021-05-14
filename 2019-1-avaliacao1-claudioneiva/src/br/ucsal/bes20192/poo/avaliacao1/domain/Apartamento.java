package br.ucsal.bes20192.poo.avaliacao1.domain;

public class Apartamento extends Imovel {

	private Float areaFracaoIdeal;

	private Float areaPrivativa;

	public Apartamento(String endereco, String bairro, Float valor, SituacaoImovelEnum situacao, Float areaFracaoIdeal,
			Float areaPrivativa) {
		super(endereco, bairro, valor, situacao);
		this.areaFracaoIdeal = areaFracaoIdeal;
		this.areaPrivativa = areaPrivativa;
	}

	public Float getAreaFracaoIdeal() {
		return areaFracaoIdeal;
	}

	public void setAreaFracaoIdeal(Float areaFracaoIdeal) {
		this.areaFracaoIdeal = areaFracaoIdeal;
	}

	public Float getAreaPrivativa() {
		return areaPrivativa;
	}

	public void setAreaPrivativa(Float areaPrivativa) {
		this.areaPrivativa = areaPrivativa;
	}

	@Override
	public String obterDetalhes() {
		return super.obterDetalhes() + "; Área privativa=" + areaPrivativa + "; Fração ideal=" + areaFracaoIdeal;
	}

}
