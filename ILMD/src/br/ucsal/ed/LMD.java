package br.ucsal.ed;

public class LMD implements ILMD {

	Noc inicio = null;

	public void insere(int codigo, String descricao) {
		Noc novo = new Noc();
		novo.codigo = codigo;
		novo.descricao = descricao;
		if (inicio == null) {
			inicio = novo;
		} else {
			Noc aux = inicio;
			while (aux.proximo != null) {
				aux = aux.proximo;
			}
			aux.proximo = novo;
		}

	}

	public void remove(int codigo) {
		if (inicio == null) {
			System.out.println("Lista vazia!");
		} else {
			Noc aux = inicio;
			Noc anterior = null;
			while (aux.proximo != null && aux.codigo != codigo) {
				anterior = aux;
				aux = aux.proximo;
			}
			if (aux.codigo == codigo) {
				if (anterior == null) {
					inicio = inicio.proximo;
					if (inicio != null) {
						anterior = null;
					}
					aux.proximo = null;
					aux = null;
				} else if (aux.proximo == null) {
					anterior.proximo = null;
					aux = null;
				} else {
					anterior.proximo = aux.proximo;
					aux = null;
				}
			} else {
				System.out.println("Elemento nao encontrado !");
			}
		}
	}

	public Noc buscar(int codigo) {
		if (inicio == null) {
			System.out.println("Lista vazia!");
		} else {
			Noc aux = inicio;
			while (aux.proximo != null && aux.codigo != codigo) {
				aux = aux.proximo;
			}
			if (aux.codigo == codigo) {
				return aux;
			}
		}
		return null;
	}

	public void alterar(int codigo, String descricao) {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			Noc aux = inicio;
			while (aux.proximo != null && aux.codigo != codigo) {
				aux = aux.proximo;
			}
			if (aux.codigo == codigo) {
				aux.descricao = descricao;
			} else {
				System.out.println("Catergoria nao encontrada.");
			}
		}
	}

	public void imprimeTudo() {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			Noc aux = inicio;		
			while (aux != null) {
				System.out.println("Codigo: " + aux.codigo);
				System.out.println("Descricao: " + aux.descricao);				
				No auxIni = aux.ini;
				while(auxIni != null) {
					System.out.println("Elemento: " + auxIni.valor);
					auxIni = auxIni.proximo;
				}
				aux = aux.proximo;
				System.out.println();
			}		
		
			System.out.println();
		}
	}

	public void imprimeCategoria(int codigo) {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			Noc aux = inicio;		
			while (aux.proximo != null && aux.codigo != codigo) {
				aux = aux.proximo;
			}
			
			if (aux.codigo == codigo) {
				System.out.println("Codigo: " + aux.codigo);
				System.out.println("Descricao: " + aux.descricao);				
				No auxIni = aux.ini;
				while(auxIni!= null) {
					System.out.println("Elemento: " + auxIni.valor);
					auxIni = auxIni.proximo;
				}
			} else {
				System.out.println("Categoria não encontrada");
			}
			System.out.println();
		}
	}

	public void insereNo(int valor, int codigo) {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			Noc aux = inicio;
			while (aux.proximo != null && aux.codigo != codigo) {
				aux = aux.proximo;
			}
			if (aux.codigo == codigo) {
				No novo = new No();
				novo.valor = valor;
				
				if (aux.ini == null) {
					aux.ini = novo;
				} else {
					No auxIni = aux.ini;
					while (auxIni.proximo != null) {
						auxIni = auxIni.proximo;
					}
					auxIni.proximo = novo;
				}			
			} else {
				System.out.println("Categoria nao encontrada");
			}
		}
	}

	public void removeNo(int valor, int codigo) {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			Noc aux = inicio;
			while (aux.proximo != null && aux.codigo != codigo) {
				aux = aux.proximo;
			}
			if (aux.codigo == codigo) {
				No auxIni = aux.ini;
				No anterior = null;
				while (auxIni.proximo != null && auxIni.valor != valor) {
					anterior = auxIni;
					auxIni = auxIni.proximo;
				}
				if (auxIni.valor == valor) {
					if (anterior == null) {
						aux.ini = aux.ini.proximo;
					} else if (auxIni.proximo == null) {
						anterior.proximo = null;
						auxIni = null;
					} else {
						anterior.proximo = auxIni.proximo;
						auxIni = null;
					}
				} else {
					System.out.println("Elemento nao encontrado");
				}
			} else {
				System.out.println("Categoria nao encontrada");
			}
		}
	}

	public No burcarNo(int codigo, int valor) {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			Noc aux = inicio;
			while (aux.proximo != null && aux.codigo != codigo) {
				aux = aux.proximo;
			}
			if (aux.codigo == codigo) {
				No auxIni = aux.ini;
				while (auxIni.proximo != null && auxIni.valor != valor) {
					auxIni = auxIni.proximo;
				}
				if(auxIni.valor==valor) {
					return auxIni;
				}else {
					System.out.println("Elemento nao encontrado");
				}
			} else {
				System.out.println("Categoria nao encontrada");
			}
		}
		return null;
	}

	public void alterar(int codigo, int valor, int novoValor) {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			Noc aux = inicio;
			while (aux.proximo != null && aux.codigo != codigo) {
				aux = aux.proximo;
			}
			if (aux.codigo == codigo) {
				No auxIni = aux.ini;
				while (auxIni.proximo != null && auxIni.valor != valor) {
					auxIni = auxIni.proximo;
				}
				if(auxIni.valor==valor) {
					auxIni.valor = novoValor;
				}else {
					System.out.println("Elemento nao encontrado");
				}
			} else {
				System.out.println("Categoria nao encontrada");
			}
		}
	}

}
