package edu.basico.contabanco;

public class ContaTerminal {
	
	private int numeroDaConta;
	
	private String agenciaBancaria;
	
	private String nomeDoCliente;
	
	private Double saldo;
	
	

	public ContaTerminal() {
	}

	public ContaTerminal(int numeroDaConta, String agenciaBancaria, String nomeDoCliente, Double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.agenciaBancaria = agenciaBancaria;
		this.nomeDoCliente = nomeDoCliente;
		this.saldo = saldo;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getAgenciaBancaria() {
		return agenciaBancaria;
	}

	public void setAgenciaBancaria(String agenciaBancaria) {
		this.agenciaBancaria = agenciaBancaria;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaTerminal [numeroDaConta=" + numeroDaConta + ", agenciaBancaria=" + agenciaBancaria
				+ ", nomeDoCliente=" + nomeDoCliente + ", saldo=" + saldo + "]";
	}
	
	

}
