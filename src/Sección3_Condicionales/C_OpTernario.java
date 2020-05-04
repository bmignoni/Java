/* Operador Ternario '?'

    valor = (condicion) ? valor1 : valor2
 */
package Sección3_Condicionales;

import javax.swing.JOptionPane;

public class C_OpTernario {
    
    public static void main (String[] args){
        
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        JOptionPane.showMessageDialog(null, (numero % 2 == 0) ? "Es par" : "Es impar");
        
        /* MANERA DETALLADA DE HACERLO
        int numero;
        String mensaje;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        mensaje = (numero % 2 == 0) ? "Es par" : "Es impar";
        JOptionPane.showMessageDialog(null, mensaje);
        */
    }   
}
