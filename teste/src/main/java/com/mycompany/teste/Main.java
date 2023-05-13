/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author fatec.senai
 */
public class Main {
    
    public static void main(String[] args){
        
        Supplier<String> s = () -> "marcelo";
        Consumer<String> c = (x) -> x.concat("");
        ArrayList<String> lista = new ArrayList<>();
        lista.stream().forEach((u)-> System.out.println(u));
    }
    
    
}
