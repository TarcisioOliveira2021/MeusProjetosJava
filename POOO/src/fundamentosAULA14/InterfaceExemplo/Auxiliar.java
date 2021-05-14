package fundamentosAULA14.InterfaceExemplo;

//O auxilar � uma pessoa que tambem � um funcionario.
public class Auxiliar extends Pessoa implements Funcionario{
//Metodo que calcula o Salario de um Auxiliar.
	@Override
	public Double calcularSalario() {
		return 1200d;
	}
//Metodo de apresentacao
	public String apresentar() {
		return "Sr. "+ getNome();
	}

}
