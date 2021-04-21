/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoscalificar;

/**
 *
 * @author sady2
 */
import java.util.*;
public class laboratorio {

    /**
     * @param args the command line arguments
     */
    int num;
    int num2;
    int nota;
    int notas;
    Scanner leer= new Scanner(System.in);
   
    public void buscarLaboratorio(String nombre,String apellido){
        
        String nom = "sandra";
        String ap= "calliconde";
        
        if (nom == nombre && ap==apellido){
            
            
            
            System.out.print("Introduzca cantidad de laboratorios");
            
            num = leer.nextInt();
            int numeros [] = new int[num];
            int sum=0;
            
            for(int i = 0; i < numeros.length;i++){
                System.out.print("Introduzca nota"+i);
                numeros[i]=leer.nextInt();
                sum = sum + numeros[i];
                
                
             }
            
            
            
            System.out.println("nombre"+nombre+"apellido"+apellido);
            System.out.println("Notas");
             for(int i = 0; i < numeros.length;i++){
                System.out.print("Nota"+i+numeros[i]);
                
                
                
                
             }
            
            System.out.println("Nota Final"+sum);
          
            
            
            
            
        }
        
    }
    
}
