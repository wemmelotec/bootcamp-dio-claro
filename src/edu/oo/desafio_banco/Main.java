package edu.oo.desafio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente wellington = new Cliente("wellington");
		
		Conta cc = new ContaCorrente(wellington);
		cc.depositar(150);
		Conta poupanca = new ContaPoupanca(wellington);
		cc.transferir(50, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
