/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bridge;

/**
 *
 * @author sady2
 */
public class Laboratorio extends CalififMateria {
    
    
    public Laboratorio(Notas Notas){
        
        super(Notas);
    }
    
    //@override 
    public void agregarEM(){
        System.out.println("agregando estudiante de laboratorio");
        notas.califN();
        
        
        
    }
    
    
    
}
