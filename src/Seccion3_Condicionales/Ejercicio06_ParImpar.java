/* Ejercicio 6: Hacer un programa que tome dos numeros y diga si ambos son 
pares o impares
 */
package Seccion3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio06_ParImpar {
    
     public static void main (String[] args){
     
        int  numero1, numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        
        if((numero1%2 ==0) && (numero2%2==0)){
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares: ");
        }
        else if ((numero1%2 != 0) && (numero2%2 != 0)){
            JOptionPane.showMessageDialog(null, "Ambos numeros son impares: ");    
        }
        else{
            JOptionPane.showMessageDialog(null, "Uno es Par y el otro es Impar: ");    
        }
     }
}
