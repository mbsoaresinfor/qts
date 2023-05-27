package testesmock;
/*
 * 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import integracao.BancoDados;
import integracao.Pessoa;


/**
 *
 * @author marcelo.soares
 */

public class BancoDadosMockTest {
    
    private static BancoDados banco;
    
    @BeforeAll
    public static void init(){
       
    }
    
    
    @Test
    public void testInsert(){
    	// arrange
    	Pessoa pessoa = new Pessoa();
    	BancoDados bancoDados = 
    			Mockito.mock(BancoDados.class);
    	when(bancoDados.insertPessoa(pessoa)).
    		thenReturn(15);
        pessoa.setIdade(60);
        pessoa.setNome("joao");
        
        // act
        int id = bancoDados.insertPessoa(pessoa);
        
        // assert
        assertTrue(id > 0);
        
    }
    
     @Test
    public void testDelete(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(80);
        pessoa.setNome("pedro");
        banco.insertPessoa(pessoa);
        int id = pessoa.getId();
        banco.deletePessoa(id);
        assertNull(banco.buscaPessoa(id));
    }
    
     @Test
    public void testUpdate(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(100);
        pessoa.setNome("maria");
        int id = banco.insertPessoa(pessoa);
        // altero a idade 
        pessoa.setIdade(120);
        banco.updatePessoa(pessoa);
        pessoa = banco.buscaPessoa(id);
        
         assertEquals(120, pessoa.getIdade());
    }
    
    @Test
    public void testListPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(70);
        pessoa.setNome("jesus");
        banco.insertPessoa(pessoa);
        
        assertTrue(banco.listPessoa().size() > 0);
    }
}
