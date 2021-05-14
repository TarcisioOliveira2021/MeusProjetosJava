package fundamentosAULA07.Enum;

public enum ItensMenuEnum {
	// so pode ser definido com maiusculo
	//Priorizar sempre atributos private.
	INCLUIR(1,"Incluir"),
	EXCLUIR(2,"Excluir"),
	PESQUISAR_NOME(3,"Pesquisar por nome"),
	SAIR(4,"Sair");
	
	private Integer codigo;
	private String  descricao;
	
	public static ItensMenuEnum valueOfCodigo(Integer codigo) {
		//preferencias ao foreach quando so for 
		//varrer vetor.
		for (ItensMenuEnum itemMenu : values()) {
			//Caso o codigo passado seja igual ao
			//da enum retorna o item pedido.
			if(itemMenu.codigo.equals(codigo)) {
				return itemMenu;
			}
		}
		//Trata um erro de ecessao
		throw new IllegalArgumentException("O codigo nao existe");
	}
	
	//Construtor que recebe os valores direto.
	private ItensMenuEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
