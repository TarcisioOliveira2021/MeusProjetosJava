package fundamentosAULA07.classeComInstancia;

public class Pessoa {
	// Atributos da pessoa
	// Modificador de classe private
	private String nome;
	
	private Integer cpf;
	
	private Integer dataNasc;
	
	private String telefone;
	
	//Caso necessite de um sistema que gere uma matricula 
	//ou um numero de registro basta:
	private Integer registro;
	// Static metodo de classe nao precisam de uma nova instacia (new).
	private static Integer cont = 0;
	
	//Criacao de um construtor:
	//Método construtor é o método onde tem as instrucoes que 
	//serao executadas SEMPRE 
	//que for instanciado um objeto desta class
	//O construtor so enxerga o dataType do atributo nome = String, cpf = Integer
	//caso haja construtores com msm parametros dizemos que ha sobrecarga no construtor
	//e isso é uma má pratica.
	public Pessoa(String nome, Integer cpf, Integer dataNasc, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		//Nao precisa adicionar nos parametros ja que ele so incrementa.
		cont++;
		this.registro = cont;
	}
	
	
	//Metodo que permite a escrita dos atributos.
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + ", telefone=" + telefone + ", registro =" + registro + "]";
	}
	
	//Ao inves do uso do construtor para colocar direto na criacao do obj
	//os seus atributos pode se usar os getter and setters porem ter 
	//cuidado pois nao é uma boa pratica.
		
}
