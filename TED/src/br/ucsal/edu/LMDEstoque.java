package br.ucsal.edu;

public class LMDEstoque implements ILMDEstoque {
	Noc inicio = null;

	public void insereCater(String caterDescricao,Integer codigo) {
		Noc novo = new Noc();
		novo.caterDescricao = caterDescricao;
		novo.codigo = codigo;
		if(inicio==null) {
			inicio = novo;
		}else {
			Noc aux = inicio;
			while(aux.proximo != null) {
				aux = aux.proximo;
			}
			aux.proximo = novo;
		}
	}

	public void insereNo(String prodDescricao, Integer codigo, Double valor, Integer quantidade) {
		if(inicio == null) {
			System.out.println("    ...Vazio...");
		}else {
			Noc aux = inicio;
			while(aux.proximo != null && aux.codigo != null) {
				aux = aux.proximo;
			}
			if(aux.codigo==codigo) {
				No novo = new No();
				novo.prodDescricao = prodDescricao;
				novo.quantidade =quantidade;
				novo.valor = valor;
				
				if(aux.ini==null) {
					aux.ini = novo;
				}else {
					No auxIni = aux.ini;
					while(auxIni.proximo != null) {
						auxIni = auxIni.proximo;
					}
					auxIni.proximo = novo;
				}
			}else {
				System.out.println("  ...Catergoria nao encontrada...");
				System.exit(0);
			}
		}
	}

	public void exibirEstoque() {
		if(inicio==null) {	
			System.out.println(" ...Estoque vazio... \n");
		}else {
			Noc aux = inicio;
			while(aux != null) {
				System.out.println("=================================");
				System.out.println("Catergoria: "+ aux.caterDescricao);
				System.out.println("Codigo da catergoria: "+aux.codigo);
				No auxIni = aux.ini;
				while(auxIni != null) {
					System.out.println("Produto: "+auxIni.prodDescricao);
					System.out.println("Codigo do produto: "+auxIni.codigo);
					System.out.println("Quantidade: "+auxIni.quantidade);
					System.out.println("Valor: "+auxIni.valor+"\n");
					auxIni = auxIni.proximo;
				}
				aux = aux.proximo;
				System.out.println();
			}
			System.out.println();
		}
	}

	public Noc consultarCater(Integer codigoCater) {
		if(inicio == null) {
			System.out.println("... Catergoria nao encontrada ...\n");
		}else {
			Noc aux = inicio;
			while(aux.proximo != null && aux.codigo != codigoCater) {
				aux = aux.proximo;
			}
			if(aux.codigo==codigoCater) {
				return aux;
			}
		}
		return null;
	}

	public Noc consultarProd(Integer codigoProd) {
		if(inicio==null) {
			System.out.println("... Produto nao encontrado ... \n");
		}else {
			Noc aux = inicio;
			No auxIni = aux.ini;
			while(aux.proximo != null) {
				while(auxIni.proximo!=null&& auxIni.codigo!= codigoProd) {
					auxIni = auxIni.proximo;
				}
				if(auxIni.codigo==codigoProd) {
					return aux;
				}
				aux = aux.proximo;
			}
		}
		return null;
	}
}
