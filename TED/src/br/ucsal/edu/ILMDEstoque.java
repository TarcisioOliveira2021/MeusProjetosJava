package br.ucsal.edu;

public interface ILMDEstoque {
	void insereCater(String caterDescricao,Integer codigo);
	void insereNo(String prodDescricao, Integer codigo, Double valor, Integer quantidade);
	Noc consultarCater(Integer codigoCater);
	Noc consultarProd(Integer codigoProd);
	void exibirEstoque();
	
}
