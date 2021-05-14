package br.ucsal.bes20192.poo.avaliacao1.domain;

public abstract class Imovel {

	private static Integer seq = 0;

	private Integer codigo;

	private String endereco;

	private String bairro;

	private Float valor;

	private SituacaoImovelEnum situacao;

	public Imovel(String endereco, String bairro, Float valor, SituacaoImovelEnum situacao) {
		super();

		gerarCodigoImovel();

		this.endereco = endereco;
		this.bairro = bairro;
		this.valor = valor;
		this.situacao = situacao;
	}

	private void gerarCodigoImovel() {
		// Pode ser seq++; ou Imovel.seq++;
		Imovel.seq++;
		codigo = Imovel.seq;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public SituacaoImovelEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoImovelEnum situacao) {
		this.situacao = situacao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String obterDetalhes() {
		return "Código: " + codigo + "; Endereço: " + endereco + "; Bairro:" + bairro + "; Valor=" + valor;
	}

}
