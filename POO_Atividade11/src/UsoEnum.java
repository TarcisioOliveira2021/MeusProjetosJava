
public enum UsoEnum {
	MINHA(1, "Essa � minha"), SUA(2, "Essa � sua");

	private Integer codigo;
	private String descricao;

	private UsoEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static UsoEnum valueOfCodigo(Integer codigo) {
		for (UsoEnum item : values()) {
			if (item.codigo.equals(codigo)) {
				return item;
			}
		}
		throw new IllegalArgumentException("O codigo " + codigo + " n�o existe na enum");
	}

}
