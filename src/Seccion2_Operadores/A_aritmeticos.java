
package Seccion2_Operadores;

import java.util.Scanner;


public class A_aritmeticos {
    
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, mult, div, resto;
        
        System.out.println("Digite dos números: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + mult);
        System.out.println("La división es: " + div);
        System.out.println("El resto es: " + resto);
    }    
}
