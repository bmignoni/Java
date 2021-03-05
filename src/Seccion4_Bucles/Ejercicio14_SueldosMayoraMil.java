/* Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuantos son mayores a 
$ 1000
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio14_SueldosMayoraMil {
    public static void main (String [] args){
    float sueldo, suma =0;
    int contador = 0;
    
        for (int i=1 ; i <= 10 ; i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite un sueldo: "));    
            
            if (sueldo > 1000){
                contador++;
            }
            
            suma += sueldo;
        }
        
        System.out.println("La suma de todos los sueldos es: $" + suma);
        System.out.println("La cantidad de sueldos mayores a $1000 es: " + contador);
    }
    
}
