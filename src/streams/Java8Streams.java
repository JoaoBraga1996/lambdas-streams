package streams;

import java.util.Arrays;
import java.util.List;

public class Java8Streams {
//operaçoes intermediarias 
	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

		lista.stream().skip(2) // pula ou ignora os dois primeiros elementos
				.forEach(e -> System.out.println(e));

		System.out.println("---------------------------------------------");

		lista.stream().skip(2) // limite o stream a processar dois elementos
				.forEach(e -> System.out.println(e));

		System.out.println("---------------------------------------------");

		lista.stream().distinct() // ele não permite que o stream processe elemento repetido, ele usa equals e
									// hashcode pra comparar.
				.forEach(e -> System.out.println(e));

		System.out.println("---------------------------------------------");

		lista.stream().skip(2).limit(3).distinct().forEach(e -> System.out.println(e));

		System.out.println("---------------------------------------------");

		// filtros mais especificos
		lista.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

		System.out.println("---------------------------------------------");

		// transformar uma lista, a lista original não é modificada
		lista.stream().map(e -> e * 2).forEach(e -> System.out.println(e));

	}
}
