package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemploTiposLambdas {
	public static void main(String[] args) {

		// Se tiver só uma variavel não precisa usar o parenteses
		IntStream.range(0, 5).filter(e -> e % 2 == 0).reduce((n1, n2) -> n1 + n2).ifPresent(System.out::println);
		// é opcional
		IntStream.range(0, 5).filter((e) -> e % 2 == 0).reduce((n1, n2) -> n1 + n2).ifPresent(System.out::println);

		// obrigatorio quando vc quer informar o tipo
		IntStream.range(0, 5).filter((int e) -> e % 2 == 0).reduce((n1, n2) -> n1 + n2).ifPresent(System.out::println);

		// obrigatorio quando tem mais de um parametro igual na parte do reduce
		IntStream.range(0, 5).filter((int e) -> e % 2 == 0).reduce((n1, n2) -> n1 + n2).ifPresent(System.out::println);

		// obrigatorio quando tem mais de um parametro igual na parte do reduce e quiser
		// colocar o tipo é obrgiado a colocar nos dois
		IntStream.range(0, 5).filter((int e) -> e % 2 == 0).reduce((int n1, int n2) -> n1 + n2)
				.ifPresent(System.out::println);

		// chaves - se retornar algo é obrigado a colocar o return
		IntStream.range(0, 5).filter(e -> {
			return e % 2 == 0;
		}).forEach(System.out::println);

		// chaves - se retornar algo é obrigado a colocar o return
		IntStream.range(0, 5).filter(e -> {
			System.out.println("pode ter mais de uma expressão");
			return e % 2 == 0;
		}).forEach(System.out::println);

	}

}
