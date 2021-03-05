/* Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se 
obtiene de la siguiente manera:
- Si trabaja 40 horas o menos se le paga $16 por hora.
- Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras horas
y $20 por cada horas extra.
 */
package Seccion3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio05_SalarioObrero {
    
    public static void main (String[] args){
    
        int horasTrabajadas;
        float salarioSemanal;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas: "));
        
        if (horasTrabajadas > 40){
            salarioSemanal = (40*16) + ((horasTrabajadas - 40) * 20);
            JOptionPane.showMessageDialog(null, "Su salario semanal es: $ " + salarioSemanal);
        }
        else{
            salarioSemanal = (horasTrabajadas * 16);
            JOptionPane.showMessageDialog(null, "Su salario semanal es: $ " + salarioSemanal);
        }
        
    }
    
}
