/* Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma.
(a + b)^2 = a^2 + b^2 + 2ab

 */
package Seccion2_Operadores;

import java.util.Scanner;

public class Ejercicio06_Cuadrado {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        double a, b, resultado;
        
        System.out.println("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b: ");
        b = entrada.nextDouble();
        
        resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
        
        System.out.println("\nEl resultado es: " + resultado);
        
    } 
}
