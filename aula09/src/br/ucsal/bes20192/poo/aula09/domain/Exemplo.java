package br.ucsal.bes20192.poo.aula09.domain;

public class Exemplo {

	public static void main(String[] args) {

		Pessoa proprietario = new Pessoa("Claudio Neiva", "1234234234");

		Moto moto1 = new Moto("ABC-1234", 2018, 35000d, proprietario, CategoriaMotoEnum.ESTRADA, 2);
		Moto moto2 = new Moto("JFH-8958", 2017, 25000d, proprietario, CategoriaMotoEnum.TRILHA, 2);

		System.out.println("moto1.id=" + moto1.getId());
		System.out.println("moto2.id=" + moto2.getId());

	}

}
