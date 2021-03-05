/* Ejercicio 3: Programa que lea un caracter por teclado y compruebe si es una letra mayuscula.
 */
package Seccion3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio03_LetraMayuscula {
    
    public static void main (String[] args){
        
        char letra;
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0); // el charAt captura un solo caracter, el primero de la palabra.
        
         if (Character.isUpperCase(letra))
            {JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }  
    } 
}

