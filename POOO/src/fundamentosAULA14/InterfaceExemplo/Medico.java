package fundamentosAULA14.InterfaceExemplo;

import java.util.List;

//Medico é uma pessoa que tambem é um funcionario e é um profissional especializado.
public class Medico extends Pessoa implements Funcionario,ProfissionalEspecializado{
//Atributos de um medico.
//Privado só é permitido o acesso nesta classe.
	private String crm;
//Getter e setter do crm.
	public String getCrm() {
		return crm;
	}
	
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	
	public Double calcularSalario() {
		return 10000d;
	}


//Metodo toString
	@Override
	public String toString() {
		//Esse tipo de retorno, retorna os elementos da super classe e os elementos dessa classe.
		//(pessoa e medico respectivamente).
		return super.toString()+"Medico [crm=" + crm + "]";
	}
//Metodo que contem uma lista de especialides.
	public List<String> obterEspecialidades(){
		return null;
	}

//Metodo de aprensetacao.
	public String apresentar() {
		//Retorno com o pronome de tratamento mais o nome do medico.
		return "Dr. "+ getNome();
	}

}
