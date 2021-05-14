package fundamentosAULA14.InterfaceExemplo;

public interface Funcionario {
	
	//Metodo abstrato que calcula o salario de um funcionario.
	//Esta presente em todas as classes que se comprometem a implementar
	//Em cada classe esse metodo pode ter um comportamento diferente evitando o que 
	//acontece no toString com o Override.
	public abstract Double calcularSalario();
}
