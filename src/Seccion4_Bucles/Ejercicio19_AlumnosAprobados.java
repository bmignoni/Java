/* Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, 
condicionados (=4) y suspensos.
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio19_AlumnosAprobados {
    public static void main (String [] args){
        float nota;
        int aprobados=0, condicionados=0, suspensos=0;

        for (int i=1; i<=6; i++){
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota: "));
            }while(nota<0 || nota>10);
            
            if(nota==4){
                condicionados++;
            }
            else if(nota>5){
                aprobados++;
            }
            else{
            suspensos++;
            }
        }
        
        System.out.println("Cantidad de Aprobados: " + aprobados);
        System.out.println("Cantidad de Condicionados: " + condicionados);
        System.out.println("Cantidad de Suspensos: " + suspensos);
    }
}
