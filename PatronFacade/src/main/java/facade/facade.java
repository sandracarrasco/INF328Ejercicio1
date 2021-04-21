/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;
import metodoscalificar.laboratorio;
import metodoscalificar.teorica;

public class facade {
    
    private laboratorio laboratorio;
    private teorica teorica;
    
    
    public facade(){
         laboratorio = new laboratorio();
         teorica = new teorica();
         
    }
    public void buscar(String nombre,String apellido){
        laboratorio.buscarLaboratorio(nombre, apellido);
        teorica.buscarTeorica(nombre, apellido);
        
    }
    
}
