package aula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		// arrange
		Double valor1 = 5d;
		Double valor2= 7d;
		Double resultadoEsperado = 12d;
		Calculadora calculadora = new Calculadora();
		
		// ack
		Double resultado = calculadora
				.somar(valor1, valor2);
		
		// assert
		Assertions.assertEquals(resultadoEsperado,
				resultado);
	}
	
}
