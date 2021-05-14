package br.ucsal.fundamentos.AULA02;
//Classe de exemplo
public class Biblioteca {

	//Cria um array de livros.
	static Livro[] livros = new Livro[10];
	
	public static void main(String[] args) {
		
		//aqui e criado 4 livros.
		livros[0] = new Livro().livroCria("Novos poemas", "Vinicius de Moraes", "poesia", 1938);
		livros[1] = new Livro().livroCria("Poemas escritos na Índia", "Cecília Meireles", "poesia", 1962);
		livros[2] = new Livro().livroCria("Orfeu da Conceição", "Vinicius de Moraes", "~teatro", 1954);
		livros[3] = new Livro().livroCria("Ariana, a mulher", "Vinicius de Moraes", "poesia", 1936);
		
		System.out.println(busca("Vinicius de Moraes", "poesia").titulo);
	}
	//Metodo que busca o livro.
	public static Livro busca(String autor, String genero) {
	//For each do array de livros , escreve os livros do array.
		for(Livro livro: livros) {
			if(livro.autor.equals(autor)&&livro.genero.equals(genero))
				return livro;
		}
		return null;
	}
}
