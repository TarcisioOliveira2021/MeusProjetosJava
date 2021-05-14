package br.ucsal.edd.edu;

public class ArvoreBinaria implements IArvoreBinaria {
	int maior;
	int menor = 1;
	double media = 0;
	int somaNos = 0;
	int qtdElementos = 0;

	public No inserir(No aux, int valor) {
		qtdElementos++;
		if (aux == null) {
			aux = new No();
			aux.valor = valor;
		}
		if (valor < aux.valor) {
			aux.esq = inserir(aux.esq, valor);
			qtdElementos--;
		} else if (valor > aux.valor) {
			aux.dir = inserir(aux.dir, valor);
			qtdElementos--;
		}
		return aux;
	}

	public No remover(No aux, int valor) {
		if (aux != null) {
			if (aux.valor == valor) {
				if (aux.esq == aux.dir) {
					return null;
				} else if (aux.esq == null) {
					return aux.dir;
				} else if (aux.dir == null) {
					return aux.esq;
				} else {
					No p = aux.dir;
					No pp = aux.dir;
					while (p.esq != null) {
						p = p.esq;
					}
					p.esq = aux.esq;
					return pp;
				}
			} else if (valor < aux.valor) {
				aux.esq = remover(aux.esq, valor);
			} else if (valor > aux.valor) {
				aux.dir = remover(aux.dir, valor);
			}
		}
		return aux;
	}

	public boolean buscar(No aux, boolean encontrou, int valor) {
		if (aux != null && !encontrou) {
			if (aux.valor == valor) {
				encontrou = true;
			} else if (valor < aux.valor) {
				encontrou = buscar(aux.esq, encontrou, valor);
			} else if (valor > aux.valor) {
				encontrou = buscar(aux.dir, encontrou, valor);
			}
		}
		return encontrou;
	}

	public void preOrdem(No aux) {
		if (aux != null) {
			System.out.print(aux.valor + " ");
			preOrdem(aux.esq);
			preOrdem(aux.dir);
		}
	}

	public void emOrdem(No aux) {
		if (aux != null) {
			emOrdem(aux.esq);
			System.out.print(aux.valor + " ");
			emOrdem(aux.dir);
		}
	}

	public void posOrdem(No aux) {
		if (aux != null) {
			posOrdem(aux.esq);
			posOrdem(aux.dir);
			System.out.print(aux.valor + " ");
		}
	}

	public int exibirMaior(No aux) {
		if (aux != null) {
			exibirMaior(aux.esq);
			exibirMaior(aux.dir);
			if (aux.valor > maior) {
				maior = aux.valor;
			}
		}
		return maior;

	}

	public int exibirMenor(No aux) {
		if (aux != null) {
			exibirMenor(aux.dir);
			exibirMenor(aux.esq);
			if (aux.valor < menor) {
				menor = aux.valor;
			}
		}
		return menor;

	}

	public double exibirMediaDaArvore(No aux) {
		if (aux != null) {
			exibirMediaDaArvore(aux.esq);
			exibirMediaDaArvore(aux.dir);
			somaNos += aux.valor;
		}
		return media = somaNos / qtdElementos;
	}

	public void exibirFolhas(No aux) {
		if (aux != null) {
			exibirFolhas(aux.esq);
			if (aux.esq == null && aux.dir == null) {
				System.out.print(aux.valor + " ");
			}
			exibirFolhas(aux.dir);

		}
	}

	public void exibirSubArvoreEsq(No aux) {
		if (aux != null) {
			exibirSubArvoreEsq(aux.esq);
			System.out.print(aux.valor + " ");
		}
	}

	public int qtdNos() {
		return qtdElementos;
	}

}
