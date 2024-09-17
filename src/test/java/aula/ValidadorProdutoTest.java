package aula;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ValidadorProdutoTest {

	@Test
	public void testValidarTextoEntradaNULL() {
		// arrange
		ValidadorProduto validar = new ValidadorProduto();
		
		// ack
		String[] resultado = validar.validarTexto(null);
		
		// assert
		Assert.assertNull(resultado);
	}
	
	@Test
	public void testValidarTextoEntradaInvalida1() {
		// arrange
		ValidadorProduto validar = new ValidadorProduto();
		String entrada = "abc;132";
		// ack

		String[] resultado = validar.validarTexto(entrada);
		
		// assert
		Assert.assertNull(resultado);
	}
	
	@Test
	public void testValidarTextoEntradaInvalida2() {
		// arrange
		ValidadorProduto validar = new ValidadorProduto();
		String entrada = "1;tv;123;5";
		// ack

		String[] resultado = validar.validarTexto(entrada);
		
		// assert
		Assert.assertNull(resultado);
	}
	
	@Test
	public void testValidarTextoEntradaInvalida3() {
		// arrange
		ValidadorProduto validar = new ValidadorProduto();
		String entrada = "som";
		// ack

		String[] resultado = validar.validarTexto(entrada);
		
		// assert
		Assert.assertNull(resultado);
	}
	
	@Test
	public void testValidarTextoEntradaValida() {
		// arrange
		ValidadorProduto validar = new ValidadorProduto();
		String entrada = "1;som;50";
		// ack

		String[] resultado = validar.validarTexto(entrada);
		
		// assert
		Assert.assertNotNull(resultado);
		Assert.assertTrue(resultado.length == 3);
	}
}
