package edu.oo.desafio_banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("***Extrato Conta Corrente***");
		imprimirInfosComuns();
		
	}



}
