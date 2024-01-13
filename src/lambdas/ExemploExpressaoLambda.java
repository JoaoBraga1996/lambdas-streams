package lambdas;

public class ExemploExpressaoLambda {

	public static void main(String[] args) {
		Duplicador duplicador = (num) -> num * 2;

		System.out.println(duplicador.duplicar(5)); // Saída: 10
		
		
		/*Expressões lambda são frequentemente usadas em conjunto com interfaces funcionais, que são interfaces que possuem apenas um
		método abstrato. No exemplo, a interface Duplicador é uma interface funcional, pois contém apenas o método duplicar.*/
	}

}
