/* Ejercicio 3: Guillermo tiene N dólares. Luis tiene la mitad 
de lo que posee Guillermo. Juan tiene la mitad de lo que poseen Luis 
y Guillermo juntos. Hacer un programa que calcule e imprima la 
cantidad de dinero que tienen entre los tres. */

package Seccion2_Operadores;

import java.util.Scanner;


public class Ejercicio03_nDineroPersonas {
    
    public static void main (String [] args){
        
        Scanner entrada = new Scanner(System.in);
        double guillermo, luis, juan, total;
        
        System.out.println("Digite el sueldo de Guillermo: ");
        guillermo = entrada.nextFloat();
        // guillermo = x;
        
        luis = guillermo / 2;
        juan = (guillermo + luis) /2;
        
        total = guillermo + luis + juan;
        
        System.out.println("\nEl sueldo de Luis es: " + luis);
        System.out.println("El sueldo de Juan es: " + juan);
        System.out.println("\nEl sueldo de los tres es : " + total);
    
  
            
    }   
}
