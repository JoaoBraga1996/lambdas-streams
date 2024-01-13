package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamParallel {

	public static void main(String[] args) {
		// você só usa quando está precisando ter perfomace em um algoritmo especifico/
		// só quando for milagres na sua lista, ai faz sentido usar

		List<Integer> lista = Arrays.asList(1, 2, 3, 4);

		// parallel vs parallelStream
		// lista.parallelStream();
		// IntStream.range(0, 5).parallel();

		// se tiver usando stream paralelo e precisa respeitar a ordem tem que usar o
		// forEachOrdenred, se não tiver usando pararelo, o forEach vai na ordem certa
		lista.parallelStream().forEach(System.out::println); // a lista não sai na lista

		lista.parallelStream().forEachOrdered(System.out::println); // sai na ordem

		System.out.println("---------------------------------------");

		// findnay
		lista.stream().findAny().ifPresent(System.out::println); // vai encontrar o primeiro elemento que estiver pronto
																	// e fazera algo com ele - retornou o 1

		lista.parallelStream().findAny().ifPresent(System.out::println); // são varias threads tratando o stream ao
																			// a thread que terminar preimrio vai
																			// aparecer, não tem como saber qual é

		System.out.println("---------------------------------------");

		//cria pra uma thread pra cada mapa, e vai fazer um merge de um mapa só - operação pesada caso precisar ter muitos elementos
		Map<Integer, Boolean> map = lista.parallelStream().collect(Collectors.toMap(n -> n, n -> n % 2 == 0)); 
		System.out.println(map);
		
		// ele é thread safe, ele é mais lento - ele pode criar um unico mapa, desde de criar varias threads
		Map<Integer, Boolean> map2 =lista.parallelStream().collect(Collectors.toConcurrentMap(n -> n, n -> n % 2 == 0)); 
		System.out.println(map2);
	}

}
