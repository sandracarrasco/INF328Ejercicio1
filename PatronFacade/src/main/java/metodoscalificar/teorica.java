/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoscalificar;
import java.util.Scanner;
/**
 *
 * @author sady2
 */
public class teorica {

    /**
     * @param args the command line arguments
     */
    int num;
    int num2;
    int num3;
    int nota;
    Scanner leer= new Scanner(System.in);
    public void buscarTeorica(String nombre,String apellido){
        
        String nom = "rosio";
        String ap= "calliconde";
        
        if (nom == nombre && ap==apellido){
            
            System.out.print("Introduzca Primer Parcial");
            num = leer.nextInt();
            System.out.print("Introduzca Segundo Parcial");
            num2 = leer.nextInt();
            System.out.print("Introduzca Tercer Parcial");
            num3 = leer.nextInt();
           
            nota = num + num2+num3;
            System.out.println("nombre"+nombre+"apellido"+apellido);
            System.out.println("Primer Parcial  "+num);
            System.out.println("Segundo Parcial"+num2);
            System.out.println("Tercer Parcial  "+num3);
            System.out.println("Nota Final"+nota);
            
           
            
            
            
            
        }
        
        
    }
    
    
}
