/* Ejercicio 1: Hacer un programa que lea un numero entero y muestre si el 
numero es multiplo de 10.
 */
package Seccion3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio01_Multiplo {
    
    public static void main (String[] args){
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if (numero % 10 == 0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no es multiplo de 10");
        } 
    }  
}
