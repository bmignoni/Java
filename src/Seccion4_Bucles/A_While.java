/*  WHILE (mientras) : verifica (si cunple la condicion) y se ejecuta.

    while (condicion){
            Instrucciones;
    }
 */
package Seccion4_Bucles;

import java.util.Scanner;

public class A_While {
    
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int contador, i = 1;
        
        System.out.println("Digite cuantos numeros quiere imprimir en pantalla: ");
        contador = entrada.nextInt();
        
        while (i <= contador){
           System.out.println(i);
           i++; // i+= 2 (suma dos cada vez que da la vuelta el bucle)
        }
    }
}
