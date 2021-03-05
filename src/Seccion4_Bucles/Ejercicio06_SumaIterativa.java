/* Ejercicio 6: Pedir numeros has ta que se teclee un 0, mostrar la suma de 
todos los numeros introducidos.
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio06_SumaIterativa {
    public static void main (String [] args){
    
    int numero, suma = 0;
    
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            suma += numero;   // suma = suma + numero;
            
        }while(numero != 0);
        
        System.out.println("\n La suma de los numeros introducidos es : " +suma);
    }
    
}
