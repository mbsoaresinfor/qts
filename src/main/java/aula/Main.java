package aula;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws CalculadoraException {
		// Execucao da calculadora.
		
		var calculadora = new Calculadora();
		System.out.println("CALCULADORA");
		System.out.println(calculadora.somar(1d, 2d));
		System.out.println(calculadora.somar(new Double[] {1d,3d}));
		System.out.println(calculadora.somar(Arrays.asList(5d,6d)));
		
		
		


	}

}
