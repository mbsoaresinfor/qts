package aula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainInspecaoTest {

	private MainInspecao mainInspecao;
	
	@BeforeEach
	public void inicio() {
		System.out.println("INICIO");
		mainInspecao = new MainInspecao();
	}
	
	@Test
	public void testValidaPessoaOk() {
		// arrange		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("TESTE");
		pessoa.setSalario(5000);
		boolean resultadoEsperado = true;
		
		// ack
		boolean resultado = mainInspecao
				.validaPessoa(pessoa);
		
		// assert
		Assertions.assertEquals(resultadoEsperado, 
				resultado);
		
		
	}
	
	@Test
	public void testValidaPessoaNomeNaoPreenchido() {
		// arrange		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("");
		pessoa.setSalario(5000);
		boolean resultadoEsperado = false;
		
		// ack
		boolean resultado = mainInspecao
				.validaPessoa(pessoa);
		
		// assert
		Assertions.assertEquals(resultadoEsperado, 
				resultado);
				
	}
	
	@Test
	public void testValidaPessoaSalarioNegativo() {
		// arrange		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("pedro");
		pessoa.setSalario(-1);
		boolean resultadoEsperado = false;
		
		// ack
		boolean resultado = mainInspecao
				.validaPessoa(pessoa);
		
		// assert
		Assertions.assertEquals(resultadoEsperado, 
				resultado);
				
	}

}
