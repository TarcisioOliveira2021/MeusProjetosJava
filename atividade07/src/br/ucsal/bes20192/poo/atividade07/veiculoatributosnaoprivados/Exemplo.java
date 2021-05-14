package br.ucsal.bes20192.poo.atividade07.veiculoatributosnaoprivados;

public class Exemplo {

	public static void main(String[] args) {

		VeiculoCarga veiculoCarga1 = new VeiculoCarga();

		veiculoCarga1.placa = "ABC-1234";
		veiculoCarga1.anoFabricacao = 2019;
		veiculoCarga1.capacidadeCarga = 10;
		veiculoCarga1.capacidadeCombustivel = 300;

		Endereco endereco1 = new Endereco();
		endereco1.logradouro = "Rua A";
		endereco1.numero = "105B";
		endereco1.bairro = "Pituba";
		endereco1.cidade = "Salvador";
		endereco1.estado = "Bahia";

		Pessoa pessoa1 = new Pessoa();
		pessoa1.cpf = "1234982347";
		pessoa1.nome = "Maria da Silva";
		pessoa1.telefone = "34298273423";
		pessoa1.endereco = endereco1;

		veiculoCarga1.proprietario = pessoa1;

		VeiculoCarga veiculoCarga2 = new VeiculoCarga();
		veiculoCarga2.placa = "GHJ-8578";
		veiculoCarga2.anoFabricacao = 2015;
		veiculoCarga2.capacidadeCarga = 20;
		veiculoCarga2.capacidadeCombustivel = 400;
		veiculoCarga2.proprietario = new Pessoa();
		veiculoCarga2.proprietario.cpf = "356546546";
		veiculoCarga2.proprietario.nome = "João da Silva";
		veiculoCarga2.proprietario.telefone = "98462234244";
		veiculoCarga2.proprietario.endereco = new Endereco();
		veiculoCarga2.proprietario.endereco.logradouro = "Rua de Um Lugar";
		veiculoCarga2.proprietario.endereco.numero = "5588B";
		veiculoCarga2.proprietario.endereco.bairro = "Pituaçu";
		veiculoCarga2.proprietario.endereco.cidade = "Salvador";
		veiculoCarga2.proprietario.endereco.estado = "Bahia";

		Pessoa proprietario2 = veiculoCarga2.proprietario;
		System.out.println("proprietario2.nome=" + proprietario2.nome);
		System.out.println("veiculoCarga2.proprietario2.nome=" + veiculoCarga2.proprietario.nome);
	}

}
