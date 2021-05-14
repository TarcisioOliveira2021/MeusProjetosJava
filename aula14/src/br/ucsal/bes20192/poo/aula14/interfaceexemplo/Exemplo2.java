package br.ucsal.bes20192.poo.aula14.interfaceexemplo;

public class Exemplo2 {

	public static void main(String[] args) {

		// Pessoa pessoa1 = new Pessoa();
		// System.out.println("pessoa1="+pessoa1.apresentar());

		Medico medico1 = new Medico();
		Enfermeiro enfermeiro1 = new Enfermeiro();
		Auxiliar auxiliar1 = new Auxiliar();

		medico1.setNome("Claudio Neiva");
		System.out.println("medico1=" + medico1.apresentar());

		exibirSalario(medico1);
		exibirSalario(enfermeiro1);
		exibirSalario(auxiliar1);

		exibirEspecialidades(medico1);
		exibirEspecialidades(enfermeiro1);
		// exibirEspecialidades(auxiliar1);
	}

	public static void exibirSalario(Medico medico) {
		System.out.println("sal�rio=" + medico.calcularSalario());
		System.out.println("especialidades=" + medico.obterEspecialidades());
	}

	public static void exibirSalario(Funcionario funcionario) {
		System.out.println("sal�rio=" + funcionario.calcularSalario());
		// System.out.println("especialidades=" + funcionario.obterEspecialidades());
	}

	public static void exibirEspecialidades(ProfissinonalEspecializado profissinonalEspecializado) {
		// System.out.println("sal�rio=" +
		// profissinonalEspecializado.calcularSalario());
		System.out.println("especialidades=" + profissinonalEspecializado.obterEspecialidades());
	}

}
