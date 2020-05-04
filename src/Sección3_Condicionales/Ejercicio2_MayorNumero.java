/* Ejercicio 2: Pedir dos numeros y decir cual es el mayor o si son iguales.
 */
package Sección3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio2_MayorNumero {
    
    public static void main (String[] args){
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        
        if (numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El numero mayor es el primer numero digitado: " + numero1);
        }
        else if (numero2 > numero1){
            JOptionPane.showMessageDialog(null, "El numero mayor es el segundo numero digitado: " + numero2);
        }
        else {
            JOptionPane.showMessageDialog(null, "Ambos numeros digitados son iguales");
        }
    }  
}
