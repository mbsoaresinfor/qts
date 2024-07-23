package aula;
/*
 * 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


/**
 *
 * @author marcelo.soares
 */

public class BancoDadosMockTest {
    
    private BancoDados bancoDados;
    
    @BeforeAll
    public static void init(){
       
    }
    
    @BeforeEach
    public void beforeEach() {
    	bancoDados = Mockito.mock(BancoDados.class);
    }
    
    @Test
    public void testInsert(){
    	// arrange
    	Pessoa pessoa = new Pessoa();     	
    	
    	when(bancoDados.insertPessoa(pessoa)).
    		thenReturn(15);
        pessoa.setIdade(60);
        pessoa.setNome("joao");
        
        // act
        int id = bancoDados.insertPessoa(pessoa);
        
        // assert
        assertTrue(id > 0);
        
    }
    
   
}
