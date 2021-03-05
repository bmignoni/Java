/* Ejercicio 21: Pedir 10 numeros y mostrar al final si se ha introducido 
alguno negativo.
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio21_ExisteNumNegativo {
    public static void main (String [] args){
        int numero;
        boolean hay_negativos=false;
        
        for (int i=1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(numero < 0){
                hay_negativos = true;
            }
        }
        
        if(hay_negativos == true){
            System.out.println("Existe al menos un numero negativo");
        }
        else{
            System.out.println("No existe ningun numero negativo");
        }
    }
}
