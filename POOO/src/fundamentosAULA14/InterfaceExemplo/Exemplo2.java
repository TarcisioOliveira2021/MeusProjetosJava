package fundamentosAULA14.InterfaceExemplo;

public class Exemplo2 {
public static void main(String[] args) {
//Criacao de um Medico.
	Medico medico1 = new Medico();
//Criacao de um Enfermeiro.
	Enfermeiro enfermeiro1 = new Enfermeiro();
//Criacao de um Auxiliar.
	Auxiliar auxiliar1 = new Auxiliar();
	
//Definindo um nome para o medico1.
	medico1.setNome("A");
	System.out.println("Apresentacao medico1" +medico1.apresentar());
	//Metodo que exibe o salario de um medico
	exibirSalario(medico1);
	//Metodo que exibe o salario de um enfermeiro
	exibirSalario(enfermeiro1);
	//Metodo que exibe o salario de um auxiliar
	exibirSalario(auxiliar1);
	
	//Exibe a especialidade.
	exibirEspecialidades(medico1);
	exibirEspecialidades(enfermeiro1);
}


//Com esse metodo surge a necessidade de criar 3 metodos iguais para os 3 objetos.
/*
 * private static void exibirSalario(Medico medico1) {		
	}
	
 */
//Com esse metodo podemos exibir o salario de cada um sem especificando apenas por parametro.
public static void exibirSalario(Funcionario funcionario) {
	System.out.println("salário=" + funcionario.calcularSalario());
	// System.out.println("especialidades=" + funcionario.obterEspecialidades());
}
//Esse exibe a especilalidade da cada um.
public static void exibirEspecialidades(ProfissionalEspecializado profissinonalEspecializado) {
	// System.out.println("salário=" +
	// profissinonalEspecializado.calcularSalario());
	System.out.println("especialidades=" + profissinonalEspecializado.obterEspecialidades());
}
}
