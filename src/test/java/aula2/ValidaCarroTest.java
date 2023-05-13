/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package aula2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fatec.senai
 */
public class ValidaCarroTest {
    
    public ValidaCarroTest() {
    }
    
    @Test
    public void testCampoIdAcimaDeZero(){
        ValidaCarro valida = new ValidaCarro();
        boolean resPrograma =valida.validaIdCarro(1);
        boolean resExp = true;
        assertEquals(resPrograma,resExp);
    }
    
    @Test
    public void testCampoIdAbaixoDeZero(){
        ValidaCarro valida = new ValidaCarro();
        boolean resPrograma =valida.validaIdCarro(-1);
        boolean resExp = false;
        assertEquals(resPrograma,resExp);
    }
    
}
