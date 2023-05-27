/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package aula2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

/**
 *
 * @author fatec.senai
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @Test
    public void testSomar1(){
        // entradas do teste.
        int valorA = 5;
        int valorB = 10;
        Calculadora calc = new Calculadora();
        // resultado do programa
        int resultadoPrograma = calc.somar(valorA, valorB);
        
        int resultadoExperado = 15;
        // chama junit para executar o teste.
        assertEquals(resultadoExperado, resultadoPrograma);
                
    }
    
     @Test
    public void testSomar2(){
        // entradas do teste.
        int valorA = -2;
        int valorB = -5;
        Calculadora calc = new Calculadora();
        // resultado do programa
        int resultadoPrograma = calc.somar(valorA, valorB);
        
        int resultadoExperado = -7;
        // chama junit para executar o teste.
        assertEquals(resultadoExperado, resultadoPrograma);
                
    }
    
     @Test
    public void testSomar3(){
        // entradas do teste.
        int valorA = 0;
        int valorB = 0;
        Calculadora calc = new Calculadora();
        // resultado do programa
        int resultadoPrograma = calc.somar(valorA, valorB);
        
        int resultadoExperado = 0;
        // chama junit para executar o teste.
        assertEquals(resultadoExperado, resultadoPrograma);
                
    }
    
      @Test
    public void testSubtrair1(){
        // entradas do teste.
        int valorA = 10;
        int valorB = 5;
        Calculadora calc = new Calculadora();
        // resultado do programa
        int resultadoPrograma = calc.subtrair(valorA, valorB);
        
        int resultadoExperado = 5;
        // chama junit para executar o teste.
        assertEquals(resultadoExperado, resultadoPrograma);
                
    }
    
     @Test
    public void testSubtrair2(){
        // entradas do teste.
        int valorA = 10;
        int valorB = 15;
        Calculadora calc = new Calculadora();
        // resultado do programa
        int resultadoPrograma = calc.subtrair(valorA, valorB);
        
        int resultadoExperado = -5;
        // chama junit para executar o teste.
        assertEquals(resultadoExperado, resultadoPrograma);
                
    }
    
     @Test
    public void testDivisao1(){
        // entradas do teste.
        int valorA = 10;
        int valorB = 2;
        Calculadora calc = new Calculadora();
        // resultado do programa
        int resultadoPrograma = calc.dividir(valorA, valorB);
        
        int resultadoExperado = 5;
        // chama junit para executar o teste.
        assertEquals(resultadoExperado, resultadoPrograma);
                
    }
    
    @Test()
    public void testDivisao2(){
        // entradas do teste.
        int valorA = 10;
        int valorB = 0;
        Calculadora calc = new Calculadora();
        // resultado do programa
                
        assertThrows(IllegalArgumentException.class,                
                ()-> calc.dividir(valorA, valorB));
    }
    
     @Test()
    public void testMultiplicacao1(){
        // entradas do teste.
        int valorA = 2;
        int valorB = 3;
        Calculadora calc = new Calculadora();
                
        // resultado do programa
        int resultadoPrograma = calc.multiplicar(valorA, valorB);
        
        int resultadoExperado = 6;
        // chama junit para executar o teste.
        assertEquals(resultadoExperado, resultadoPrograma);
    }
    
    @Test()
    public void testMultiplicacao2(){
        // entradas do teste.
        int valorA = 2;
        int valorB = 0;
        Calculadora calc = new Calculadora();
                
        // resultado do programa
        int resultadoPrograma = calc.multiplicar(valorA, valorB);
        
        int resultadoExperado = 0;
        // chama junit para executar o teste.
        assertEquals(resultadoExperado, resultadoPrograma);
    }
    
    @Test
    public void testSomarMock(){
    	// arrange
    	Calculadora calculadora = mock(Calculadora.class);
    	when(calculadora.
    			somar(anyInt(),
    					anyInt())).thenReturn(15);
    	
    	// act
    	int resultado = calculadora.somar(0, 133);
    	
    	// assert
    	Assert.assertEquals(15,resultado);
    }
    
    
    
}
