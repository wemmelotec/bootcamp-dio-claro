package edu.oo.desafio_banco;

//Por ela ser abastrata, não faz sentindo dar um new nessa classe sem falar se ela é corrente ou poupança
public abstract class Conta implements IConta {
	// como esse atributo pertence a classe e não ao objeto pelo static
	// cada objeto dessa ContaCorrente ou ContaPoupanca terá o seu sequêncial
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;

	// Como eu preciso que esses atribustos estejam acessíveis no construtor das
	// minhas classes filhas
	// faz mais sentido utilizar o protect
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Agencia: %.2f", this.saldo));
	}
	
	//Como essa classe é abstrata a implementação dos métodos da interface é opcional
	//Mas se eu não implementar aqui, precisarei implementar nas suas classes filhas que vai ser o caso do Imprimir Extrato que personalizado
	//para a conta corrente e para a poupanca
	@Override
	public void sacar(double valor) {
		//saldo = saldo - valor;
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
