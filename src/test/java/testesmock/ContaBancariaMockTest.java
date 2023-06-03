package testesmock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyFloat;
import static org.mockito.Mockito.when;

import mock.ContaBancaria;

public class ContaBancariaMockTest {

	
	@Test
	public void testNomeCorrentista() {
		
		// arrange
		ContaBancaria conta = Mockito.mock(ContaBancaria.class);
		when(conta.getNomeCorrentista())
		.thenReturn("João da Silva");			
		
		// act
		String resultado = conta.getNomeCorrentista();
		
		// assert
		Assertions.assertEquals("João da Silva", resultado);		
		
	}
	
	@Test
	public void testDepositaDinheiro0() {
		// arrange
		ContaBancaria conta = Mockito.mock(ContaBancaria.class);
		when(conta.depositaDinheiro(50f))
		.thenReturn(200f);
		
		// act
		float resultado= conta.depositaDinheiro(50f);
		
		// assert
		Assertions.assertEquals(200f,resultado);
	}
	
	@Test
	public void testDepositaDinheiro1() {
		// arrange
		ContaBancaria conta = Mockito.mock(ContaBancaria.class);
		when(conta.depositaDinheiro(anyFloat()))
		.thenReturn(1000f);
		
		// act
		float resultado1= conta.depositaDinheiro(50f);
		float resultado2= conta.depositaDinheiro(30f);
		
		// assert
		Assertions.assertEquals(1000f,resultado1);
		Assertions.assertEquals(1000f,resultado2);
	}
	
	@Test
	public void testsacarDinheiro() {
		// arrange
		ContaBancaria conta = Mockito.mock(ContaBancaria.class);
		when(conta.sacarDinheiro(10f))
		.thenReturn(30f);
		
		// act
		float resultado1= conta.sacarDinheiro(10f);		
		
		// assert
		Assertions.assertEquals(30f,resultado1);		
	}
	
}
