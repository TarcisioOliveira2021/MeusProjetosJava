package fundamentosAULA04;

public class Exemplo {

	public static void main(String[] args) {
		//Criando novos alunos..
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		//Aqui o nome do aluno1 é trocado pelo nome do aluno4 pois 1=4 e 4=1
		Aluno aluno4 = aluno1;
		
		//Instancia dos objetos alunos na memoria.
		System.out.println(aluno1);
		System.out.println(aluno2);
		System.out.println(aluno3);
		System.out.println(aluno4);
		
		//Caso troque a posicao do aluno1 por 4 o nome vai ser o que esta abaixo.
		aluno1.nome = "To";
		aluno2.nome = "Keiko";
		aluno3.nome = "Mizuki";
		aluno4.nome = "Tarcisio";
		
		System.out.println(aluno1.nome);
		System.out.println(aluno4.nome);
		
		//== aponta para a instancia(local na memoria) do objeto.
		if(aluno1==aluno2) {
			System.out.println("aluno1 é igual ao aluno2");
		}else {
			System.out.println("aluno1 NAO é igual a aluno2");
		}
		
		if(aluno1==aluno3) {
			System.out.println("aluno1 é igual ao aluno3");
		}else {
			System.out.println("aluno1 NAO é igual a aluno3");
		}
		
		//Vai executar igual pois aluno1==aluno4
		if(aluno1==aluno4) {
			System.out.println("aluno1 é igual ao aluno4");
		}else {
			System.out.println("aluno1 NAO é igual a aluno4");
		}
		
		
		// .equals testa o conteudo da variavel
		if(aluno1.equals(aluno2)) {
			System.out.println("aluno1 é igual ao aluno2");
		}else {
			System.out.println("aluno1 NAO é igual a aluno2");
		}
		
		if(aluno1.equals(aluno3)) {
			System.out.println("aluno1 é igual ao aluno3");
		}else {
			System.out.println("aluno1 NAO é igual a aluno3");
		}
		
		if(aluno1.equals(aluno4)) {
			System.out.println("aluno1 é igual ao aluno4");
		}else {
			System.out.println("aluno1 NAO é igual a aluno4");
		}
		
	}

}
