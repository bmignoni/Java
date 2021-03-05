/* La sentencia If:

if (condicion){
    Instruccion1;
}
else{
    Instruccion2;
}
 */
package Seccion3_Condicionales;

import javax.swing.JOptionPane;

public class A_Ifelse {
    
    public static void main (String[] args){
        
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
        /* OPERADORES:
        ==  igualdad
        != desigualdad
        < menor
        > mayor
        <= menor igual
        >= mayor o igual
        */
        
        if (numero==dato){   
            
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }
 
    }
}
