package fundamentosAULA12.domain;

public class Aluno extends Object {
	//ORDEM 

	// 1ª -> CONSTANTES

	// 2ª -> ATRIBUTOS

	// 3ª -> CONSTRUTORES

	// 4ª -> MÉTODOS PÚBLICOS

	// 5ª -> MÉTODOS PRIVADOS
	
	private Integer matricula;
	private String nome;
	private String email;
	
	//Construtor do aluno.
	public Aluno(Integer matricula, String nome, String email) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
	}
	//Informa a matricula do aluno 
	public Integer getMatricula() {
		return matricula;
	}
	//Obtem a matricula do aluno.
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	//Informa o nome do aluno.
	public String getNome() {
		return nome;
	}
	//Obtem o nome do aluno.
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Informa o email do aluno.
	public String getEmail() {
		return email;
	}
	//Obtem o email do aluno;
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	//Verifica se o aluno existe.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	//To string q escreve os dados do aluno.
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", email=" + email + "]";
	}
	
}
