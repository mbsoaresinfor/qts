package aula;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *  @author marcelo.soares
 *  Exemplo de teste de integração
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
}
