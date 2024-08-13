package aula;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws CalculadoraException {
		// Execucao da calculadora.
		
		var calculadora = new Calculadora();
		System.out.println("CALCULADORA");
		System.out.println(calculadora.somar(1d, 2d));
		System.out.println(calculadora.somar(new Double[] {1d,3d,5d,10d,18d}));
		System.out.println(calculadora.somar(Arrays.asList(5d,6d)));
		System.out.println(calculadora.divisao(5d, 5d));
		
		


	}

}
