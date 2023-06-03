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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import integracao.BancoDados;
import integracao.Pessoa;


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
    
     @Test
    public void testDelete(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(80);
        pessoa.setNome("pedro");
        bancoDados.insertPessoa(pessoa);
        int id = pessoa.getId();
        bancoDados.deletePessoa(id);
        assertNull(bancoDados.buscaPessoa(id));
    }
    
     @Test
    public void testUpdate(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(100);
        pessoa.setNome("maria");
        int id = bancoDados.insertPessoa(pessoa);
        // altero a idade 
        pessoa.setIdade(120);
        bancoDados.updatePessoa(pessoa);
        pessoa = bancoDados.buscaPessoa(id);
        
         assertEquals(120, pessoa.getIdade());
    }
    
    @Test
    public void testListPessoa(){
        // arrange
    	when(bancoDados.listPessoa())
    		.thenReturn(Arrays.asList(new Pessoa()));
    	
    	// act
    	int total = bancoDados.listPessoa().size();
    	
    	// assert  
        assertTrue(total > 0);
    }
}
