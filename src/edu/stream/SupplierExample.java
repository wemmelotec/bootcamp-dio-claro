package edu.stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
	public static void main(String[] args) {
		// Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
		// Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
		// // Usar o Supplier para obter uma lista com 5 saudações
		// List<String> listaSaudacoes =
		// Stream.generate(saudacao).limit(5).collect(Collectors.toList());
		// // Imprimir as saudações geradas
		// // lembra que o forEach implementa o Consumer
		// // essa expressão no parâmetro poderia ser um lambda assim: s ->
		// // System.out.println(s),
		// // mas vamos utilizar ao invés do lambda o method reference
		// listaSaudacoes.forEach(System.out::println);

		// abaixo outra forma de implementar o Supplier direto como parâmetros
		// List<String> listaSaudacoes = Stream.generate(new Supplier<String>() {
		//
		// @Override
		// public String get() {
		// return "Olá, seja bem-vindo(a)!";
		// }
		// }).limit(5).collect(Collectors.toList());
		//
		// listaSaudacoes.forEach(System.out::println);

		// abaixo uma terceira versão utilizando o lambda, dado que o generate já espera
		// uma interface Supplier
		List<String> listaSaudacoes = Stream.generate(() -> {
			return "Olá, seja bem-vindo(a)!";
		}).limit(5).collect(Collectors.toList());
		
		listaSaudacoes.forEach(System.out::println);
	}
}
