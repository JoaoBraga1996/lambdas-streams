package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemplosMaisFaceis {
	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);

		// removeIf
		lista.removeIf(e -> e % 2 == 0);
		lista.forEach(System.out::println);

		// replaceAll
		lista.replaceAll(e -> e * 2);
		lista.forEach(System.out::println);

		Map<Integer, String> map = new HashMap<>();
		map.put(0, "João");
		map.put(1, "felipe");
		map.put(2, "braga");

		//forEach
		map.forEach((k, v) -> System.out.println(k + v));

	}

}
