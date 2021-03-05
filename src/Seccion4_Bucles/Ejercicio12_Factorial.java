/* Ejercicio 12: Pedir un numero y calcular su factorial
N! = 1*2*3...*N
*/
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio12_Factorial {
    
    public static void main (String [] args){
        int numero;
        long factorial = 1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        for (int i=1 ; i <=numero ; i++){
            factorial *= i;
        }
        System.out.println("El factorial es: " + factorial);
               
    }
    
}
