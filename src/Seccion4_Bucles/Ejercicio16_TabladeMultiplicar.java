/* Ejercicio 16: Pide un numero, que debe estar entre 0 y 10 y mostrar la tabla
de multiplicar de dicho numero
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio16_TabladeMultiplicar {
    
    public static void main (String [] args){
        int numero;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }while (numero<0 || numero>10);
        
        System.out.println("La tabla de multiplicar del numero " +numero+ " es: ");
        
        for (int i=1; i<=12; i++){
            System.out.println(numero + " * " +i+ " = " + numero*i);
        }
    }
}
