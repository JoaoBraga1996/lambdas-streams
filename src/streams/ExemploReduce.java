package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExemploReduce {

	public static void main(String[] args) {
		// reduce é pegar todos os elementos de e transformar em uma coisa só
		// tem que ser uma funcão assosiativa

		String s = "Dê uma olhada no meu git";
		String[] split = s.split(" ");
		List<String> listStr = Arrays.asList(split);

		// reduce - soma
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

		Optional<Integer> soma = lista.stream().reduce((n1, n2) -> n1 + n2);

		System.out.println(soma.get());

		System.out.println("--------------------------------");

		// reduce multiplicação
		Optional<Integer> multiplicacao = lista.stream().reduce((n1, n2) -> n1 * n2);

		System.out.println(multiplicacao.get());

		System.out.println("--------------------------------");

		// reduce concatenando
		Optional<String> concatenando = listStr.stream().reduce((n1, n2) -> n1.concat(n2));

		System.out.println(concatenando.get());

		System.out.println("--------------------------------");

		// subtração no reduce e porque vc não deve usar, ela não é função assosiativa -
		// NÂO FAÇA
		Optional<Integer> subtracao = lista.stream().reduce((n1, n2) -> n1 - n2);

		System.out.println(subtracao.get()); // vai sair -19

		System.out.println("--------------------------------");

		//reduce soma com identificador
		Integer soma2 = lista.stream().reduce(0, (n1, n2) -> n1 + n2); //valor de identidade para soma é zero

		System.out.println(soma2);
		
		System.out.println("--------------------------------");

		//reduce multiplicao com identificador
		Integer multiplicacao2 = lista.stream().reduce(1, (n1, n2) -> n1 * n2); //valor de identidade para multiplicação é 1

		System.out.println(multiplicacao2);
		
		System.out.println("--------------------------------");

		// reduce concatenando com identificador
		String concatenando2 = listStr.stream().reduce("", (n1, n2) -> n1.concat(n2));

		System.out.println(concatenando2);

		System.out.println("--------------------------------");
		
		//se a lista estiver nula, ele vai receber o valor de identificação.
		
		

	}

}
