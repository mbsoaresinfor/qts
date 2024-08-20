package aula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RepositorioListaPessoaTest {

	private RepositorioListaPessoa repositorio;
	
	@BeforeEach
	public void inicio() {
		repositorio = new RepositorioListaPessoa();	
	}
	
	@Test
	public void listarPrimeiroPessoas() {
		// arrange
		Pessoa p1 = new Pessoa();
		p1.setNome("marcelo soares");
		Pessoa p2 = new Pessoa();
		p2.setNome("joão da silva");
		repositorio.lista.add(p1);
		repositorio.lista.add(p2);
		String resultadoEsperado = "marcelo\njoão\n";
		
		// ack
		String resultado = repositorio
				.listarPrimeiroPessoas();
		
		// assert
		Assertions
		.assertEquals(resultadoEsperado, 
				resultado);
	}
}
