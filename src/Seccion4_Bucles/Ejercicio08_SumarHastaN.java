/* Ejercicio 8: Pedir un nuemro N, y mostrar todos los numeros de 1 al N.
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio08_SumarHastaN {
    
    public static void main (String[] args){
        
        int numero, i = 1;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (i <= numero){
            System.out.println(i);
            i++;
                    
        }   
    } 
}
