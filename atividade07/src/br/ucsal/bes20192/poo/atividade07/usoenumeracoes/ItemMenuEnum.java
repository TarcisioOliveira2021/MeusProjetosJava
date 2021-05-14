package br.ucsal.bes20192.poo.atividade07.usoenumeracoes;

//Esta enumera��o n�o faz parte da atividade, e foi construida apenas para ilustrar a import�ncia das enumera��es
public enum ItemMenuEnum {

	INCLUIR(1, "Incluir"),

	EXCLUIR(2, "Excluir"),

	PESQUISAR_POR_NOME(3, "Pesquisar por nome"),

	SAIR(4, "Sair");

	private Integer codigo;

	private String descricao;

	private ItemMenuEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static ItemMenuEnum valueOfCodigo(Integer codigo) {
		for (ItemMenuEnum itemMenu : values()) {
			if (itemMenu.codigo.equals(codigo)) {
				return itemMenu;
			}
		}
		throw new IllegalArgumentException("O codigo " + codigo + " n�o existe na enum");
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
