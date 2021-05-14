package br.ucsal.bes20192.poo.aula09.domain;

public enum CategoriaMotoEnum {

	URBANA(1), TRILHA(5), ESTRADA(10);

	private Integer codigo;

	private CategoriaMotoEnum(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public static CategoriaMotoEnum valueOfCodigo(Integer codigo) {
		for (CategoriaMotoEnum categoriaMoto : values()) {
			if (categoriaMoto.codigo.equals(codigo)) {
				return categoriaMoto;
			}
		}
		throw new IllegalArgumentException("O código " + codigo + " não exite na enumeração");
		// return null;
	}

}
