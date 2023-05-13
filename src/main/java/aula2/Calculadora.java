/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

/**
 *
 * @author fatec.senai
 */
public class Calculadora {
    
    public int somar(int a,int b) {
		return a + b ;
	}
	
	public int subtrair(int a,int b) {
		return a - b;
	}
	
	public int dividir(int a,int b) {
                if(b == 0){
                    throw new 
                      IllegalArgumentException("divisao por zero");
                }
		return a / b;
	}
	
	public int multiplicar(int a,int b) {
		return a * b;
	}

}
