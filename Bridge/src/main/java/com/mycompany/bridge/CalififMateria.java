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
public abstract class CalififMateria {
    protected Notas notas;
    public CalififMateria(Notas notas){
        
        this.notas = notas;
        
        
        
    }
    
    public abstract void AgregarEM();
   
    
}
