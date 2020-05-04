/* Ejericio 10: Pedri el dia, mes y año de una fecha e indicar si la fecha es 
correcta. Con meses de 28, 30 y 31 dias. Sin años bisiestos.
 */
package Sección3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio10_FechaMeses {
    
    public static void main (String[] args){
        int dia, mes , año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
    
        if (año == 0){               // si el año es correcto
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta ");
        }
        else if ((mes==2) && (dia >= 1 && dia <=28)){
            JOptionPane.showMessageDialog(null, "La fecha es correcta ");
        }
        else if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia >= 1 && dia <=30)){ 
            JOptionPane.showMessageDialog(null, "La fecha es correcta ");
        }
        else if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 ||mes==12) && (dia >= 1 && dia <=31)){ 
            JOptionPane.showMessageDialog(null, "La fecha es correcta ");
        }
        else{
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta ");
        }
    }
}
