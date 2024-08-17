package edu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// Criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

		// Usar o Consumer com expressão lambda para imprimir números pares
		// Essa é uma forma de implementação de uma Interface Consumer, mas ela pode ser
		// implementada direto no parâmetro da stream.
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		};

		//// Usar o Consumer para imprimir números pares no Stream
		numeros.stream().forEach(imprimirNumeroPar);

		// Essa é a segunda forma de implementar o Consumer
		numeros.stream().forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				if (t % 2 == 0) {
					System.out.println(t);
				}
			}
		});

		// Mas ainda dá para melhorar ainda mais com o lambda
		// Isso funcionar sem eu precisar declarar a Consumer, pois o forEach espera
		// receber uma Consumer.
		numeros.stream().forEach(t -> {
			if (t % 2 == 0) {
				System.out.println(t);
			}
		});

		// melhorando este Consumer com a utilização do Predicate e do filter
		numeros.stream().filter(t -> t % 2 == 0).forEach(System.out::println);
	}

}
