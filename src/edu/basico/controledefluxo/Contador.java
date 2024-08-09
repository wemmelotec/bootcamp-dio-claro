package edu.basico.controledefluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {

			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {

			exception.getMessage();
		}
	}

	private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (!(parametroUm > parametroDois)) {
			int contagem = parametroDois - parametroUm;
			for (int i = 0; i < contagem; i++) {
				System.out.printf("Imprimindo o número %d\n", i + 1);
			}

		} else {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

	}

}
