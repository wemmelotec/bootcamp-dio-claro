package edu.basico;

public class RunTimeExceprionsTest {

	public static void main(String[] args) {

		try {
			System.out.println(dividir(50, 0));
		} catch (ArithmeticException e) {
			// Tratamento da exceção
			System.out.println("Erro: " + e.getMessage());
		}

		// O programa continua após tratar a exceção
		System.out.println("Programa continua executando normalmente.");
	}

	private static int dividir(int dividendo, int divisor) throws ArithmeticException {
		if (divisor == 0) {
			throw new ArithmeticException("Não é possível dividir por 0");
		}
		return dividendo / divisor;
	}

}
