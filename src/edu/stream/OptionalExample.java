package edu.stream;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		Optional<String> optionalValue = Optional.ofNullable(null);
		String result = optionalValue.orElse("Default"); 
		System.out.println(result);
		
		
		Optional<String> optionalValue2 = Optional.ofNullable(null);
		String result2 = optionalValue.orElseGet(() -> "Value from Supplier");
		System.out.println(result2);
		
		Optional<String> optionalValue3 = Optional.of("Hello");
		optionalValue3.ifPresent(value -> System.out.println("Valor presente: " + value));
	}

}
