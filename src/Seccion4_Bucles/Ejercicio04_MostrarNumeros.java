/* Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar 
cuantos numeros se han introducido.
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio04_MostrarNumeros {
    
    public static void main (String [] args){
    
        int numero, contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (numero >= 0){
            contador ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        
        System.out.println("Ha introducido: "+contador+" numeros no negativos");
    }
    
}
