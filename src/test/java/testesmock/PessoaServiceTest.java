package testesmock;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import integracao.BancoDados;
import integracao.Pessoa;
import junit.framework.Assert;
import mock.PessoaService;

public class PessoaServiceTest {

	
	@Test
	public void testSalvarPessoaSucesso() {
		// arrange
		BancoDados bancoDados = Mockito.mock(BancoDados.class);
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("pedro");
		when(bancoDados.insertPessoa(pessoa)).
			thenReturn(3);
		
		PessoaService pessoaService = 
				new PessoaService(bancoDados);
		
		// act
		int resultadoPrograma = 
					pessoaService.salvarPessoa(pessoa);

		// assert
		Assert.assertTrue(resultadoPrograma != -1);
	}
	
	@Test
	public void testSalvarPessoaError() {
		// arrange
		BancoDados bancoDados = Mockito.mock(BancoDados.class);
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("pedro");
		when(bancoDados.insertPessoa(pessoa)).
			thenReturn(-1);
		
		PessoaService pessoaService = 
				new PessoaService(bancoDados);
		
		// act
		int resultadoPrograma = 
					pessoaService.salvarPessoa(pessoa);

		// assert
		Assert.assertTrue(resultadoPrograma == -1);
	}
}
