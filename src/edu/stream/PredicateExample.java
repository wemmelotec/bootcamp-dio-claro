package edu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("java", "kotli", "python", "javascript", "go", "c");

		// primeira forma de aplicar o predicate
		Predicate<String> maisDeCincoCarecteres = palavra -> palavra.length() > 5;

		palavras.stream().filter(maisDeCincoCarecteres).forEach(System.out::println);

		// segunda forma de aplicar o predicate
		palavras.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() > 5;
			}
		}).forEach(System.out::println);

		// terceira forma de aplicar o predicate
		palavras.stream().filter(t -> t.length() > 5).forEach(System.out::println);
	}
}
