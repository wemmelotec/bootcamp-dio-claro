package edu.oo.desafio_banco;

import java.util.List;

public class Banco {
	private String nome;
	//Num contexto em que o Banco é formado por contas, então as contas compõe o Banco
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
