/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package aula9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fatec.senai
 */
public class IdadesTest {
    
    public IdadesTest() {
    }
    
    // -1,0,130,131
    @Test
    public void testValidaIdadevalores(){
        Idades idade = new Idades();
        boolean resulProg = idade.validaIdadeSemException(0);
        boolean resulExp = true;
        assertEquals(resulExp, resulProg);
        
        resulProg = idade.validaIdadeSemException(130);
        resulExp = true;
        assertEquals(resulExp, resulProg);
    }
    
     @Test
    public void testValidaIdadeInvalores(){
        Idades idade = new Idades();
        boolean resulProg = idade.validaIdadeSemException(-1);
        boolean resulExp = false;
        assertEquals(resulExp, resulProg);
        
        resulProg = idade.validaIdadeSemException(131);
        resulExp = false;
        assertEquals(resulExp, resulProg);
    }
    
     @Test
     public void testValidaIdadeComExceptionValoresValidos(){
        Idades idade = new Idades();
         assertThrows(Exception.class,
                 ()-> idade.validaIdadeComException(-1));
     }
    

    
}
