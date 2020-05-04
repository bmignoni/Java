/* Ejercicio Mayusculas y Minusculas: Comprobar si una palabra esta escrita en 
mayuscula, minuscula o combinada entre ambas.
 */
package Sección3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio_Mayuscula {
    
    public static void main (String[] args){
        String palabra;
        palabra = JOptionPane.showInputDialog("Escriba una palabra: "); 
        
         if (palabra.equals(palabra.toUpperCase())){ 
            JOptionPane.showMessageDialog(null, "La palabra esta en mayuscula");
        }
        else if (palabra.equals(palabra.toLowerCase())){
            JOptionPane.showMessageDialog(null, "La palabra esta en minuscula");
        }
        else
            JOptionPane.showMessageDialog(null, "La palabra combina mayusculas y minusculas");      
    } 
}
