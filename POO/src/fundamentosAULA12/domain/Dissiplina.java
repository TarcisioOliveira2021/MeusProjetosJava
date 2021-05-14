package fundamentosAULA12.domain;

public class Dissiplina {
	private String codigo;
	private String nome;
	private TipoDissiplinaEnum tipoDissiplina;
	

	public Dissiplina(String codigo, String nome, TipoDissiplinaEnum tipoDissiplina) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipoDissiplina = tipoDissiplina;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipoDissiplinaEnum getTipoDissiplina() {
		return tipoDissiplina;
	}
	
	public void setTipoDissiplina(TipoDissiplinaEnum tipoDissiplina) {
		this.tipoDissiplina = tipoDissiplina;
	}
	
	
}
