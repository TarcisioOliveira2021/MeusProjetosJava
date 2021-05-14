package fundamentosAULA14.InterfaceExemplo;

import java.util.List;

//Enfermeiro é uma pessoa que tambem é um funcionario e é um profissional especializado.
public class Enfermeiro extends Pessoa implements Funcionario, ProfissionalEspecializado {
//Atributos de um enfermeiro
	private String coren;

//Getter e setter
	public String getCoren() {
		return coren;
	}

	public void setCoren(String coren) {
		this.coren = coren;
	}

//Metodo que calcula o salario de um enfermeiro.
	@Override
	public Double calcularSalario() {
		return 10000d;
	}

//Metodo que lista as especialidades de um enfermeiro.
	@Override
	public List<String> obterEspecialidades() {
		return null;
	}

//Metodo de apresentacao
	public String apresentar() {
		return "Dr. " + getNome();
	}
}
