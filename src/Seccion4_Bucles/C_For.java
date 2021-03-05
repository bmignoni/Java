/* FOR: 
for (inicializacion variabe aum/dec; condicion; aum/dec variable iteracion){
    Instrucciones;
}
 */
package Seccion4_Bucles;

import java.util.Scanner;

public class C_For {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int contador;
        
        System.out.println("Digite cuantos de terminos: ");
        contador = entrada.nextInt();
        
        for (int i = 1; i<= contador; i++)
            System.out.println(i);
        }
    
}
