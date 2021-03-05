/* Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de medida de 
masa, mostrar en pantalla un menu con las opciones posibles.
 */
package Seccion3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio14_UnidadesMedida {
    
    public static void main (String [] args){
        float medida, medidaActual;
        int opcion;
        
        medida = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de Kilogramos que desea convertir: "));
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú Opciones de Medida: \n"
        + "1. Hectogramos\n"
        + "2. Decogramos\n"
        + "3. Gramos\n"
        + "4. Decigramos\n"
        + "5. Centigramos\n"
        + "6. Miligramos"));
        
        switch (opcion){
            case 1: medidaActual = medida * 10;
                    JOptionPane.showMessageDialog(null, medida+" Kg equivale a: "+medidaActual+" Hectogramos");
                    break;
            case 2: medidaActual = medida * 100;
                    JOptionPane.showMessageDialog(null, medida+" Kg equivale a: "+medidaActual+" Hectogramos");
                    break;
            case 3: medidaActual = medida * 1000;
                    JOptionPane.showMessageDialog(null, medida+" Kg equivale a: "+medidaActual+" Hectogramos");
                    break;
            case 4: medidaActual = medida * 10000;
                    JOptionPane.showMessageDialog(null, medida+" Kg equivale a: "+medidaActual+" Hectogramos");
                    break;
            case 5: medidaActual = medida * 100000;
                    JOptionPane.showMessageDialog(null, medida+" Kg equivale a: "+medidaActual+" Hectogramos");
                    break;
            case 6: medidaActual = medida * 1000000;
                    JOptionPane.showMessageDialog(null, medida+" Kg equivale a: "+medidaActual+" Hectogramos");
                    break;
            default: JOptionPane.showMessageDialog(null, "La opción es incorrecta");
                    break;
        }
    }
    
}
