package br.ucsal.edu.br.domain;

public class Igreja extends PontoTuristico {
	private TiposArquiteturaIgreja arquitetura;
	private Integer anoCostrucao;

	public Igreja(String logradouro, String bairro, String nome, TiposArquiteturaIgreja arquitetura,
			Integer anoCostrucao) {
		super(logradouro, bairro, nome);
		this.arquitetura = arquitetura;
		this.anoCostrucao = anoCostrucao;
	}

	public TiposArquiteturaIgreja getArquitetura() {
		return arquitetura;
	}

	public void setArquitetura(TiposArquiteturaIgreja arquitetura) {
		this.arquitetura = arquitetura;
	}

	public Integer getAnoCostrucao() {
		return anoCostrucao;
	}

	public void setAnoCostrucao(Integer anoCostrucao) {
		this.anoCostrucao = anoCostrucao;
	}

	public String toString() {
		return "Igrejas [arquitetura=" + arquitetura + ", anoCostrucao=" + anoCostrucao + "]";
	}

}
