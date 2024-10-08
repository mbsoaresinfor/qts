package aula;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class MainBancoDadosTest {

	private BancoDados bancoDadosMock;	 
    private MainBancoDados mainBancoDados;
    
    @BeforeEach
    public void init(){
    	bancoDadosMock = Mockito.mock(BancoDados.class);
    	mainBancoDados = new MainBancoDados(bancoDadosMock);
    }
    
    @BeforeEach
    public void beforeEach() {
    	
    }
    
    @Test
    public void testInserirPessoa(){
    	// arrange
    	Pessoa pessoa = new Pessoa();     	
    	
    	// configura o mock
    	when(bancoDadosMock.insertPessoa(pessoa))
    	.thenReturn(15);
        pessoa.setIdade(60);
        pessoa.setNome("joao");
        
        // act
        boolean resultado = mainBancoDados.inserirPessoa(pessoa);
        
        // assert
        assertTrue(resultado);
        
    }
    
    @Test
    public void testInserirPessoaComError(){
    	// arrange
    	Pessoa pessoa = new Pessoa();     	
    	
    	// configura o mock
    	when(bancoDadosMock.insertPessoa(pessoa))
    		.thenReturn(-1);
        pessoa.setIdade(60);
        pessoa.setNome("joao");
        
        // act
        boolean resultado = mainBancoDados
        		.inserirPessoa(pessoa);
        
        // assert
        assertFalse(resultado);
        
    }
}
