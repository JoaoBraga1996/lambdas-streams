package lambdas;

public class ExemploFuncaoTradicional {

	public static void main(String[] args) {

		Duplicador duplicador = new Duplicador() {
			@Override
			public int duplicar(int num) {
				return num * 2;
			}
		};

		System.out.println(duplicador.duplicar(5)); // Saída: 10

	}
}
