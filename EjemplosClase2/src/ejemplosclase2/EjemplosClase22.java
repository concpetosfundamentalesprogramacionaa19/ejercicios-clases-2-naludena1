/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class EjemplosClase22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       String nombre; 
       String apellido;
       int edad;
       String ciudad;
       
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Por favor ingrese su nombre");
       nombre = entrada.nextLine();
       
        System.out.println("Por favor ingrese su apellido");
       apellido = entrada.nextLine();
       
        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine(); //limpieza del buffer de entrada de datos
        
        System.out.println("Ingrese la ciudad de origen");
        ciudad = entrada.nextLine();
       
     
        System.out.println("Su nombre es: "+nombre+ "\n\n\t"+"Su apellido" 
                + "es: "  +apellido+ ", edad: "+edad  );
    
        System.out.println("ciudad: "+ciudad);
      
    }
    
}
