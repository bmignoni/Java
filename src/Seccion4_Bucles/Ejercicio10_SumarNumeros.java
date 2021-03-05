/* Ejercicio 10: Pedir 10 numeros y escribir la suma total.
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio10_SumarNumeros {
    
    public static void main (String [] args){
        int suma =0, numero;
        
        
        for (int i=1 ; i<= 10 ; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma+= numero;
        }
        System.out.println("La suma total de los numeros introducidos es: " + suma);
    } 
}
