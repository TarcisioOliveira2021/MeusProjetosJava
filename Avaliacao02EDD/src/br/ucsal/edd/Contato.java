package br.ucsal.edd;

import java.util.Date;

public class Contato implements IContato {

	private String cpf;
	
	private String nome;

	private String email;

	private String telefone;

	private String logradouro;

	private int numero;

	private String bairro;

	private String cidade;

	private Date data;

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String getCpf() {
		return cpf;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String getTelefone() {
		return telefone;
	}

	@Override
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Override
	public String getLogradouro() {
		return logradouro;
	}

	@Override
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String getNumero() {
		return Integer.toString(numero);
	}

	@Override
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String getBairro() {
		return bairro;
	}

	@Override
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String getCidade() {
		return cidade;
	}

	@Override
	public void setDataDeNascimento(Date data) {
		this.data = data;
	}

	@Override
	public Date getDataDeNascimento() {
		return data;
	}

}
