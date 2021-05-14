package br.ucsal.bes20192.poo.avaliacao1.domain;

public class Casa extends Imovel {

	private Float areaTerreno;

	public Casa(String endereco, String bairro, Float valor, SituacaoImovelEnum situacao, Float areaTerreno) {
		super(endereco, bairro, valor, situacao);
		this.areaTerreno = areaTerreno;
	}

	public Float getAreaTerreno() {
		return areaTerreno;
	}

	public void setAreaTerreno(Float areaTerreno) {
		this.areaTerreno = areaTerreno;
	}

	@Override
	public String obterDetalhes() {
		return super.obterDetalhes() + "; Área do terreno=" + areaTerreno;
	}

}
