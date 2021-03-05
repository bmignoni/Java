/* DO WHILE (hacer mientras) : ejecuta y luego verifica (si cunple la condicion, continua ejecutando)

    Do {
        Instrucciones
    } while (condicion)
 */
package Seccion4_Bucles;

import java.util.Scanner;

public class B_DoWhile {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int contador, i = 1;
        
        System.out.println("Digite cuantos de terminos: ");
        contador = entrada.nextInt();
        
        do {
            System.out.println(i);
            i+=2;
        } while (i <= contador);
        
    }
}
