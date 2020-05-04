/* Ejercicio 9: Pedir el dia, mes y año de una fecha e indicar si la fecha 
es correcta. Suponiendo que todos los meses son de 30 dias.
 */
package Sección3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio9_FechaCorrecta {
    public static void main (String[] args){
        int dia, mes , año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if ((dia>=1) && (dia<=30)){          // si el dia es correcto
            if ((mes>=1) && (mes<=12)){      // si el mes es correcto
                if (año != 0){               // si el año es correcto
                    JOptionPane.showMessageDialog(null, "La fecha: '"+dia+" / "+mes+" / "+año+"' es correcta ");
                }
                else{
                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta, el año '"+año+"'  es incorrecto");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "La fecha es incorrecta, el mes '"+mes+"' es incorrecto");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, el dia '"+dia+"'  es incorrecto");
        }
    } 
}
