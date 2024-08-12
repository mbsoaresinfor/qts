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
	
	@Test
	public void testSomarValoresNull0() {
		// arrange
		Double valor1 = null;
		Double valor2= null;
		Double resultadoEsperado = -1d;
		Calculadora calculadora = new Calculadora();
		
		// ack
		Double resultado = calculadora
				.somar(valor1, valor2);
		
		// assert
		Assertions.assertEquals(resultadoEsperado,
				resultado);
	}
	
	@Test
	public void testSomarValoresNull1() {
		// arrange
		Double valor1 = null;
		Double valor2= 2d;
		Double resultadoEsperado = -1d;
		Calculadora calculadora = new Calculadora();
		
		// ack
		Double resultado = calculadora
				.somar(valor1, valor2);
		
		// assert
		Assertions.assertEquals(resultadoEsperado,
				resultado);
	}
	
	@Test
	public void testSomarValoresNull2() {
		// arrange
		Double valor1 = 2d;
		Double valor2= null;
		Double resultadoEsperado = -1d;
		Calculadora calculadora = new Calculadora();
		
		// ack
		Double resultado = calculadora
				.somar(valor1, valor2);
		
		// assert
		Assertions.assertEquals(resultadoEsperado,
				resultado);
	}
	
	@Test
	public void testSomarComValoresNegativo() {
		// arrange
		Double valor1 = 20d;
		Double valor2= -30d;
		Double resultadoEsperado = -10d;
		Calculadora calculadora = new Calculadora();
		
		// ack
		Double resultado = calculadora
				.somar(valor1, valor2);
		
		// assert
		Assertions.assertEquals(resultadoEsperado,
				resultado);
	}
}
