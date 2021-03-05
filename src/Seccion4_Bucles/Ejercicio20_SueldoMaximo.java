/* Ejercicio 20: Pedir un numero N, introducir N sueldos y mostrar el sueldo
maximo.
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio20_SueldoMaximo {
    public static void main (String [] args){
        int numeroSueldos;
        float sueldo, sueldo_max=0;
        
        numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de sueldos que desea introducir: "));
        
        for (int i=1; i<=numeroSueldos; i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite uel sueldo N°: " +i+ ": "));
            
            if (sueldo > sueldo_max){
                sueldo_max = sueldo;
            }
        }
        
        System.out.println("El sueldo maximo es: " + sueldo_max);
    }
}
