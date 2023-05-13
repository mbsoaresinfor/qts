package testeintegracao;
/*
 * 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import integracao.BancoDados;
import integracao.Pessoa;


/**
 *
 * @author marcelo.soares
 */
public class BancoDadosIntegracaoTest {
    
    private static BancoDados banco;
    
    @BeforeAll
    public static void init(){
        banco = new BancoDados();
    }
    
    
    @Test
    public void testInsert(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(60);
        pessoa.setNome("joao");
        banco.insertPessoa(pessoa);
        int id = pessoa.getId();
        assertNotNull(banco.buscaPessoa(id));
        
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
