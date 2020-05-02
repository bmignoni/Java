
package Seccion1_entradasySalidas;

import javax.swing.JOptionPane;

public class InputOutput {
    
   public static void main(String[] args) {
       String cadena;
       int entero;
       char letra;
       double decimal;
       
       cadena = JOptionPane.showInputDialog("Digite una cadena: ");
       entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
       letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
       decimal = Double.parseDouble(JOptionPane.showInputDialog("Difite un decimal: "));
       
       JOptionPane.showMessageDialog(null, "Lacdena es: "+cadena);
       JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
       JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
       JOptionPane.showMessageDialog(null, "El numero decimal es: "+decimal);
       // con el JOptionPane se pone 14.23 es decir, con "." (punto) no se utiliza la "," (coma)
       
       
       
       
       
    }
    
}
