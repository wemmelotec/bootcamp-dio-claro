package edu.oo.desafio_banco;

public interface IConta {
	//Importante! Uma interface nada mais é que uma classe abastrata com todos seus métodos abstratos
	//Como toda interface é abastract e tem métodos públicos por padrão, não faz sentido eu deixar o public nos métodos
	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
