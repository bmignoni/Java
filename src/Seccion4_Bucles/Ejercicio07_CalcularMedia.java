/* Ejercicio 7: Pedir numeros hasta que se introduzca uno negativo y calcular
la media.
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio07_CalcularMedia {
    
     public static void main (String [] args){
    
        int numero, elementos = 0,suma = 0;
        float media;
    
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (numero >= 0){

            suma += numero;   // suma = suma + numero;
            elementos++; // aumentamos uno a elementos
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        
        if (elementos == 0){
            System.out.println("\n Error! La division entre 0 no existe");    
        }
        else{
            media = (float)suma / elementos;
            System.out.println("\n La Media o el Promedio es: " + media);  
        }
    } 
}
