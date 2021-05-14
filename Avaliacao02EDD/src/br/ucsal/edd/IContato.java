package br.ucsal.edd;

import java.util.Date;

public interface IContato {
	void setCpf(String cpf);
	String getCpf();
	void setNome(String nome);
	String getNome();
	void setEmail(String email);
	String getEmail();
	void setTelefone(String telefone);
	String getTelefone();
	void setLogradouro(String logradouro);
	String getLogradouro();
	void setNumero(int numero);
	String getNumero();
	void setBairro(String bairro);
	String getBairro();
	void setCidade(String cidade);
	String getCidade();
	void setDataDeNascimento(Date data);
	Date getDataDeNascimento();
}
