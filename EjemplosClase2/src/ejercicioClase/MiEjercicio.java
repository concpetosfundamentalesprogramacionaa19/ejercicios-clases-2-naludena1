/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioClase;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class MiEjercicio {
    
     public static void main(String[] args) {
    
     String nombre; 
     String apellido;
     int edad;
     String ciudad;
     String pais;
     int nota1;
     int nota2;
     int prom;
     
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Por favor ingrese sus nombres");
       nombre = entrada.nextLine();
       
    System.out.println("Por favor ingrese sus apellidos");
    apellido = entrada.nextLine();
    
    System.out.println("Por favor ingrese su edad");
    edad = entrada.nextInt();
    
    entrada.nextLine(); //Limpieza de buffer
    
    System.out.println("Ingrese su ciudad de origen");
    ciudad = entrada.nextLine();
    
    System.out.println("Ingrese su pais de origen");
    pais = entrada.nextLine();
    
    System.out.println("Digite Nota 1");
    nota1 = entrada.nextInt();
    
    System.out.println("Digite Nota 2");
    nota2 = entrada.nextInt();
    
    prom = ((nota1+nota2)/2);
    
         System.out.printf("Sus nombres y apellidos: %s %s\nEdad: %s\n"
                 + "Ciudad: %s\nPais: %s\nNotas: %s , %s\nPromedio: %s", 
                 nombre, apellido, edad, ciudad, pais, nota1, nota2, prom);
    
    
               
               
            
               
               
               
    
    
    
    
    
    
    

    
    
   
  }  
}
