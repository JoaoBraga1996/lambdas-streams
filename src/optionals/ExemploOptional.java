package optionals;

import java.util.Optional;
import java.util.stream.Stream;

public class ExemploOptional {
	public static void main(String[] args) {

		String s = "1";
		converteEmNumero(s).ifPresent(n -> System.out.println(n));

		System.out.println("----------------------------------");

		// se ele não conseguir converter vai retornar o 2, orElse é uma especie de
		// valor default
		String s1 = "uma string";
		Integer numero = converteEmNumero(s1).orElse(2);
		System.out.println(numero);

		System.out.println("----------------------------------");

		// mesmo coisa do outra metodo, mas recebe uma expressão lambda, porém é mais
		// pesado
		String s2 = "dá uma olhada no meu git ai ! ";
		Integer integer = converteEmNumero(s2).orElseGet(() -> 5);
		System.out.println(integer);

		System.out.println("----------------------------------");

		// ele lança uma excessão caso o optional estejá vazio, ele recebe uma expressão
		// lambda
		String s3 = "1";
		Integer integer2 = converteEmNumero(s3).orElseThrow(() -> new NullPointerException("valor vazio"));
		System.out.println(integer2);

		System.out.println("===================");

		Optional<Integer> exemplo1 = Stream.of(1, 2, 3).findFirst();
		System.out.println(exemplo1.get());

		// for mais legivel

		Stream.of(1, 2, 3).findFirst().ifPresent(n -> System.out.println(n));

	}

	public static Optional<Integer> converteEmNumero(String numero) {
		try {
			Integer integer = Integer.valueOf(numero);
			return Optional.of(integer);
		} catch (Exception e) {
			return Optional.empty();

		}

	}
}
