package fundamentosAULA07.classeComInstancia;

public class Exemplo {
	public static void main(String[] args) {
		// Gera o objeto com os campos ditos pelo construtor.
		Pessoa pessoa1 = new Pessoa("Tarcisio", 1234151, 123131, "71-2313012");
		Pessoa pessoa2 = new Pessoa("Tao", 1231111151, 12313331, "71-1113012");
		// Aqui ha o endereco de memoria do objeto.
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		
		// Aqui ja com o toString na classe pessoa e escrito os atributos
		// do objeto pessoa1. 
		//System.out.println(pessoa1);
	}
}
