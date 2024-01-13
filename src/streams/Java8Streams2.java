package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Streams2 {
//operaçoes finais
	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

		Long cont = lista.stream().filter(e -> e % 2 == 0).count();

		System.out.println(cont);

		System.out.println("---------------------------------------");

		// min ele vc tem que passar um comparator nele

		Optional<Integer> min = lista.stream().min(Comparator.naturalOrder());

		System.out.println(min.get());

		System.out.println("---------------------------------------");

		// max é do mesmo jeito
		Optional<Integer> min2 = lista.stream().max(Comparator.naturalOrder());

		System.out.println(min2.get());

		System.out.println("---------------------------------------");

		// collertorsto list ele pega todo o resultado e armazena é uma nova lista
		List<Integer> novaLista = lista.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

		System.out.println(novaLista);

		System.out.println("---------------------------------------");

		/*
		 * Coleta os elementos do stream em um mapa, onde as chaves são valores
		 * booleanos (true ou false). Essa operação utiliza Collectors.groupingBy, que
		 * agrupa os elementos do stream de acordo com a função de agrupamento fornecida
		 */
		Map<Boolean, List<Integer>> novaLista1 = lista.stream().map(e -> e * 3)
				.collect(Collectors.groupingBy(e -> e % 2 == 0));

		System.out.println(novaLista1);

		System.out.println("---------------------------------------");

		// mapa que está agrupado pelo resto da divisão por três
		Map<Integer, List<Integer>> novaLista2 = lista.stream().collect(Collectors.groupingBy(e -> e % 3));

		System.out.println(novaLista2);

		System.out.println("---------------------------------------");

		// joining basicamente é pra agrupar strings, ele só trabalha com string
		String lista3 = lista.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(";"));

		System.out.println(lista3);

	}

}
