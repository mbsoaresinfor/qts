package aula;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class BancoDadosIntegracaoTest {

	
	private static BancoDados banco;
    
	
    @BeforeAll
    public static void init(){
        banco = new BancoDados();
    }
    
    @Test
    public void testInsert(){
        // arrange
    	Pessoa pessoa = new Pessoa();
        pessoa.setIdade(60);
        pessoa.setNome("joao");
        
        // ack
        banco.insertPessoa(pessoa);
        int id = pessoa.getId();
        
        // assert
        Pessoa pessoaSalva = banco.buscaPessoa(id);
        assertNotNull(pessoaSalva);
        assertEquals("joao", pessoaSalva.getNome());
        assertEquals(60, pessoaSalva.getIdade());
    }
	
}
