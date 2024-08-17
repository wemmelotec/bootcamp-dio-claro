package edu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

	public static void main(String[] args) {
		// Criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		// Usar a Function com expressão lambda para dobrar todos os números
		// Function<Integer, Integer> dobrar = numero -> numero * 2;
		// // Usar a função para dobrar todos os números no Stream e armazená-los em
		// outra
		// // lista
		// List<Integer> numerosDobrados =
		// numeros.stream().map(dobrar).collect(Collectors.toList());
		// // Imprimir a lista de números dobrados
		// numerosDobrados.forEach(System.out::println);

		// segunda forma de utilizar o map com a interface Function
		// List<Integer> numerosDobrados = numeros.stream().map(new Function<Integer,
		// Integer>() {
		//
		// @Override
		// public Integer apply(Integer t) {
		// return t * 2;
		// }
		// }).collect(Collectors.toList());
		// numerosDobrados.forEach(System.out::println);

		// terceira forma de utilizar a interface Function
		List<Integer> numerosDobrados = numeros.stream()
				.map(n -> n * 2)
				.collect(Collectors.toList());
		numerosDobrados.forEach(System.out::println);
	}
}
