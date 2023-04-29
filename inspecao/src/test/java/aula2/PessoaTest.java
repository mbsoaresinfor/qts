package aula2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import aula2.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fatec.senai
 */
public class PessoaTest {
    
    public PessoaTest() {
    }
    
    @Test
    public void testConcatenaNomeSobreNome(){
        String nome = "Pedro";
        String sobreNome = "Silva";
        Pessoa pessoa = new Pessoa();
        String resultadoPrograma = pessoa.concatenaNomeSobreNome(nome, sobreNome);
        assertEquals("PedroSilva", resultadoPrograma);
    }
    
    @Test
    public void testConcatenaNomeSobreNome2(){
        String nome = "marcelo ";
        String sobreNome = "Soares";
        Pessoa pessoa = new Pessoa();
        String resultadoPrograma = pessoa.concatenaNomeSobreNome(nome, sobreNome);
        assertEquals("marcelo Soares", resultadoPrograma);
    }
    
     @Test
    public void testConcatenaNomeSobreNome3(){
        String nome = "";
        String sobreNome = "";
        Pessoa pessoa = new Pessoa();
        String resultadoPrograma = pessoa.concatenaNomeSobreNome(nome, sobreNome);
        assertEquals("", resultadoPrograma);
    }
    
    
    
     @Test
    public void testRetornaDadosPessoa(){     
        Pessoa pessoa = new Pessoa();
        String resultadoPrograma = pessoa.retornaDadosPessoa();
        String resulExperado = "pedro da silva;10;porto alegre";
        assertEquals(resulExperado, resultadoPrograma);
    }
    


}
