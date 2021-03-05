/* Ejercicio 1:  Hacer un programa que calcule e imprima la suma de
tres calificaciones*/

package Seccion2_Operadores;

import java.util.Scanner;


public class Ejercicio01_SumarCalificaciones {
    
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        float nota1, nota2, nota3, suma;
        
        System.out.println("Digite las tres calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1 + nota2 + nota3;
        System.out.println("\nLa suma es: " + suma);
        
    }
    
    
}
