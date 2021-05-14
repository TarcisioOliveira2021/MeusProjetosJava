package br.ucsal.fundamentos.AULA02;

public interface ILivro {
	Livro livroCria(String titulo,String autor,String genero, int ano);
	String getGenero();
	String getAutor();
	String getTitulo();
	int gerAno();
	int  verificaOmodernismo();	
}
