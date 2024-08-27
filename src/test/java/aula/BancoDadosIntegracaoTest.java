package aula;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BancoDadosIntegracaoTest {

	
	private static BancoDados banco;
    
	
    @BeforeAll
    public static void init(){
        banco = new BancoDados();
    }
    
    @BeforeEach
    public void antesDeCadaMetod() {
    	banco.deletarTudo();
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
    
    @Test
    public void testDelete(){
        // arrange
    	Pessoa pessoa = new Pessoa();
        pessoa.setIdade(60);
        pessoa.setNome("joao");
        banco.insertPessoa(pessoa);
        int id = pessoa.getId();
        
        // ack
        banco.deletePessoa(id);        
        
        // assert
        Pessoa pessoaSalva = banco.buscaPessoa(id);
        assertNull(pessoaSalva);
        
    }
    
    @Test
    public void testListPessoa() {
    	// arrange
    	int totalPessoas = 50;
    	for(int i=0; i < totalPessoas; i++) {
    		Pessoa p = new Pessoa();
    		banco.insertPessoa(p);    		
    	}
    	
    	// ack
    	List<Pessoa> lista = banco.listPessoa();
    	
    	// assert
    	assertEquals(totalPessoas, lista.size());
    }
    
    @Test
    public void testUpdate() {
    	// arrange
    	Pessoa p = new Pessoa();
    	p.setNome("maria");
    	p.setIdade(50);
    	int id = banco.insertPessoa(p);
    	
    	p.setNome("maria_alterada");
    	p.setIdade(100);
    	
    	// ack
    	banco.updatePessoa(p);
    	Pessoa pessoaBanco = banco.buscaPessoa(id);
    	
    	// assert
    	assertEquals(pessoaBanco.getNome(),
    			"maria_alterada");
    	assertEquals(pessoaBanco.getIdade(),
    			100);
    	
    }
    
    
	
}
