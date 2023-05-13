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
public class MesesTest {
    
    public MesesTest() {
    }
    
    @Test
    public void testMesesValoresValidos(){
        Meses meses = new Meses();
        boolean resultadoPrograma = meses.validaMes(1);
        boolean resultadoExperado = true;
        assertEquals(resultadoExperado,resultadoPrograma);
        
        resultadoPrograma = meses.validaMes(30);
        resultadoExperado = true;
        assertEquals(resultadoExperado,resultadoPrograma);
    }
    
     @Test
    public void testMesesValoresInValidos(){
        Meses meses = new Meses();
        boolean resultadoPrograma = meses.validaMes(0);
        boolean resultadoExperado = false;
        assertEquals(resultadoExperado,resultadoPrograma);
        
        resultadoPrograma = meses.validaMes(31);
        resultadoExperado = false;
        assertEquals(resultadoExperado,resultadoPrograma);
    }
    
}
