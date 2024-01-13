package lambdas;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ExemploMethodReference {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

		// sem method reference
		lista.stream().forEach(e -> System.out.println(e));

		// method reference
		lista.stream().forEach(System.out::println);

		System.out.println("---------------------------------------");

		// metodo estatico
		lista.stream().map((e) -> multipliquePorDois(e)).forEach(System.out::println);

		// usando method reference
		lista.stream().map(ExemploMethodReference::multipliquePorDois).forEach(System.out::println);

		System.out.println("---------------------------------------");

		// construtores
		lista.stream().map((e) -> new BigDecimal(e)).forEach(System.out::println);

		lista.stream().map(BigDecimal::new).forEach(System.out::println);

		System.out.println("---------------------------------------");

		// varias instancia

		lista.stream().map((e) -> e.doubleValue()).forEach(System.out::println);

		lista.stream().map(Integer::doubleValue).forEach(System.out::println);

		System.out.println("---------------------------------------");

		// unica instancia

		BigDecimal dois = new BigDecimal(2);
		lista.stream().map(BigDecimal::new).map((b) -> dois.multiply(b)).forEach(System.out::println);

		lista.stream().map(BigDecimal::new).map(dois::multiply).forEach(System.out::println);

	}

	public static Integer multipliquePorDois(Integer numero) {
		return numero * 2;
	}

}
