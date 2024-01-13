package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

//collect é pra objetos mutaveis, exemplos lista, map, etc
public class ExemploCollect {
	public static void main(String[] args) {

		List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5, 6, 6);

		List<Integer> lista2 = lista1.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

		System.out.println(lista2);

		System.out.println("---------------------------------------------");

		Set<Integer> lista3 = lista1.stream().filter(e -> e % 2 == 0).collect(Collectors.toSet());

		System.out.println(lista3);

		System.out.println("---------------------------------------------");

		// você escolhe qual collections vocÊ quer
		Set<Integer> lista4 = lista1.stream().filter(e -> e % 2 == 0)
				.collect(Collectors.toCollection(() -> new TreeSet<>()));

		System.err.println(lista4);

		System.out.println("---------------------------------------------");

		// joining serve pra unir strings
		String join = lista1.stream().map(e -> e.toString()).collect(Collectors.joining(" "));

		System.out.println(join);

		System.out.println("---------------------------------------------");

		// averaging - media - ma tem que passar um função que conversa o elemento da
		// lista em um int
		Double media = lista1.stream().collect(Collectors.averagingInt(e -> e.intValue()));
		System.out.println(media);

		System.out.println("---------------------------------------------");

		// summing
		Integer soma = lista1.stream().collect(Collectors.summingInt(e -> e.intValue()));
		System.out.println(soma);

		System.out.println("---------------------------------------------");

		// summarizing - faz varias contas como menor, valor, soma, quantidade
		IntSummaryStatistics stats = lista1.stream().collect(Collectors.summarizingInt(e -> e.intValue()));
		System.out.println(stats);

		System.out.println("---------------------------------------------");

		// counting
		Long count = lista1.stream().collect(Collectors.counting());
		System.out.println(count);
		
		System.out.println("---------------------------------------------");

		// max - retorna o maior, o 6 nesse caso
	    lista1.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).ifPresent(System.out::println);
		

	}

}
