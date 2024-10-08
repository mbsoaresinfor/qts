package aula;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IPVATest {

	private IPVA ipva;
	
	@BeforeEach
	public void iniciar() {
		ipva = new IPVA();
	}
	
	@Test
	public void testIdadeMaior60BomCondutor() {
		// arrange 
		float ipva = 1000;
		boolean bomCondutor = true;
		int idade = 60;
		float resultadoEsperado = 700;
		
		// ack
		float resultado = this.ipva.calcular(ipva, idade, bomCondutor);
		
		
		// asssert
		Assertions.assertEquals(resultadoEsperado, resultado,2);
	}
	
	@Test
	public void testIdadeMaior40BomCondutor() {
		// arrange 
		float ipva = 1000;
		boolean bomCondutor = true;
		int idade = 40;
		float resultadoEsperado = 750;
		
		// ack
		float resultado = this.ipva.calcular(ipva, idade, bomCondutor);
		
		
		// asssert
		Assertions.assertEquals(resultadoEsperado, resultado,2);
	}
	
	@Test
	public void testIdadeMenor40BomCondutor() {
		// arrange 
		float ipva = 1000;
		boolean bomCondutor = true;
		int idade = 39;
		float resultadoEsperado = 850;
		
		// ack
		float resultado = this.ipva.calcular(ipva, idade, bomCondutor);
		
		
		// asssert
		Assertions.assertEquals(resultadoEsperado, resultado,2);
	}
	
	@Test
	public void testMalCondutor() {
		// arrange 
		float ipva = 1000;
		boolean bomCondutor = false;
		int idade = 60;
		float resultadoEsperado = 1000;
		
		// ack
		float resultado = this.ipva.calcular(ipva, idade, bomCondutor);
		
		
		// asssert
		Assertions.assertEquals(resultadoEsperado, resultado,2);
	}
	
	@Test
	public void testComValorNULL() {
		// arrange
		float resultadoEsperado = 0;
		
		// ack
		float resultado = this.
				ipva.calcular(null, null, null);
		
		
		// asssert
		Assertions.assertEquals(resultadoEsperado, resultado,2);
	}


}
