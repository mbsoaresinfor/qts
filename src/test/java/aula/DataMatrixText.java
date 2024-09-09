package aula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DataMatrixText {

	DataMatrix dataMatrix = new DataMatrix();
	
	@Test
	void testValidarOk() {
		// arrange
		String dado = "17898XY0660559260124ABCDE123459";
		Boolean resultaEsperado = true;
		
		// ack
		boolean resultado = dataMatrix.validar(dado);
		
		// assert
		Assert.assertEquals(resultaEsperado, resultado);
	}
	
	@Test
	void testValidarError1() {
		// arrange
		String dado = "17A98560660559260124ABCDE12345A";
		Boolean resultaEsperado = false;
		
		// ack
		boolean resultado = dataMatrix.validar(dado);
		
		// assert
		Assert.assertEquals(resultaEsperado, resultado);
	}
	
	@Test
	void testValidarError2() {
		// arrange
		String dado = "1789X560660559AB0124ABCDE123459";
		Boolean resultaEsperado = false;
		
		// ack
		boolean resultado = dataMatrix.validar(dado);
		
		// assert
		Assert.assertEquals(resultaEsperado, resultado);
	}
	
	@Test
	void testValidarError3() {
		// arrange
		String dado = "1789Y560660559AB0124ABCDE1234598";
		Boolean resultaEsperado = false;
		
		// ack
		boolean resultado = dataMatrix.validar(dado);
		
		// assert
		Assert.assertEquals(resultaEsperado, resultado);
	}

}
