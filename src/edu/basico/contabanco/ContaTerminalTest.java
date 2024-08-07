package edu.basico.contabanco;

import java.util.Scanner;

public class ContaTerminalTest {
	
	public static void main(String [] args) {
		ContaTerminal contaTerminal = new ContaTerminal();
		//TODO: Conhecer e importar a classe scanner
		Scanner scanner = new Scanner(System.in);
		//TODO: Exibir as mensagens para o nosso usuário
		//TODO: Obter pelo scanner os valores digitados no terminal
		System.out.println("Por favor, digite o número da Conta !");
		contaTerminal.setNumeroDaConta(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Por favor, digite o número da Agência no formato 123-4 !");
		contaTerminal.setAgenciaBancaria(scanner.nextLine());
		System.out.println("Por favor, digite o seu nome !");
		contaTerminal.setNomeDoCliente(scanner.nextLine());
		System.out.println("Por favor, digite o seu saldo !");
		contaTerminal.setSaldo(scanner.nextDouble());
		scanner.nextLine();
		//TODO: Exibir a mensagem conta criada
		System.out.println("Olá " + contaTerminal.getNomeDoCliente() +", obrigado por criar uma conta em nosso banco,"
				+ " sua agência é "+contaTerminal.getAgenciaBancaria()+","
				+ " conta "+contaTerminal.getNumeroDaConta()+" e seu"
				+ " saldo "+contaTerminal.getSaldo()+" já está disponível para saque");
	}

}
