  // Ejercicio Barbara:
  // Math.sqrt(numero) --> da la raiz del numero que esta entre parentesis.
  // Math.pow(numero , npotencia) --> eleva el numero a la npotencia

package Seccion2_Operadores;

import java.util.Scanner;

public class Ejercicio_PotenciayRaiz {
    
    public static void main (String[] args){
    
    Scanner entrada = new Scanner(System.in);
    
    double x, y;
        
    System.out.print("Digite el valor de x: ");
    x = entrada.nextDouble();
        
    y = Math.sqrt(x) + Math.pow(x, 2);
        
    System.out.print("El valor de 'Y' es: " + y);
    
    }
}
