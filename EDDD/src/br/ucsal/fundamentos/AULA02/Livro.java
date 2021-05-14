package br.ucsal.fundamentos.AULA02;

public class Livro implements ILivro{
	//Atributos do objeto livro.
	public String titulo;
	public String autor;
	public String genero;
	public Integer ano;
	
	//Metodos que exibem.
	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public String getGenero() {
		return this.genero;
	}

	//Metodo que exibe o ano.
	public int gerAno() {
		return this.ano;
	}
	//Verifica se o livro é modernista.
	public int verificaOmodernismo() {
		if(ano<1930) {
			return -1;
		} else if(ano<=1945){
			return 0;
		} else {
			return 1;
		}
	}
	//Metodo que cria um objeto livro.
	public Livro livroCria(String titulo, String autor, String genero, int ano) {
		Livro livro = new Livro();
		livro.titulo = titulo;
		livro.autor = autor;
		livro.genero = genero;
		livro.ano = ano;
		return livro;
	}
	
}
