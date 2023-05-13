package integracao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;

public class TesteMinhaConsumer {

	
	public static void mostraNome(int ind) {
		if(ind == 0) {
			return;
		}
		mostraNome(ind-1);
		System.out.println("marcelo"+ind);
	}
	
	public static int fatorial (int valor) {
		if(valor == 0) { // condicao base, trivial.
			return 1;
		}
		
		int valorTmp = fatorial(valor - 1); // chamada recursiva.
		int calculo = valor * valorTmp;
		return calculo;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(fatorial(50));
		mostraNome(10);
//		MinhaConsumer<String> minhaConsumer = new MinhaConsumer();
//		testConsumer(minhaConsumer::accept);
//		
//		testFunction(myFunction);
		
//		List<String> listaNome = Arrays.asList("marcelo","pedro",
//				"maria","joao","leandro","ines","jesus");
//		
//		for(int i = 0; i < listaNome.size(); i++) {
//			int numeroAletorio = new Random().
//					nextInt(listaNome.size());
//			System.out.println(listaNome.get(numeroAletorio));
//		}
//		
//		
//		for(int i=0; i < 10; i++) {
//			System.out.println("marcelo-"+i);
//		}
//		
//		
//		listaNome.add("teste");
//		
		
	}
	
	static Function<String, Integer> myFunction = (s) -> s.length();
	
	public static void testFunction(Function<String, Integer> function) {
		System.out.println(function.apply("marcelo"));
	}
	
	public static void testConsumer(Consumer<String> consumer) {
		consumer.accept("testando consumer");
	}

}
