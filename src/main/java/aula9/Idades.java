/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula9;

/**
 *
 * @author fatec.senai
 */
public class Idades {
    
    public boolean validaIdadeComException(int idade) 
                throws Exception{
        if(idade >= 0 && idade <= 130){
            throw new Exception("Error na idade");
        }	
        return true;
    }
    public boolean validaIdadeSemException(int idade) {
        // 0,130
        return (idade >= 0 && idade <= 130);
    }
    
}
