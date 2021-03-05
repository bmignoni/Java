/* Ejercicio 4: En MegaPlaza se hace un 20% de descuento a los clientes cuya 
compra supere los $300. ¿Cual sera la cantidad que pagara una persona por su 
compra.?
 */
package Seccion3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio04_CompraDescuento {
    
    public static void main (String[] args){
        float precioCompra, descuento;
        
        
        precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero: "));
       
        
        if (precioCompra > 300){
            descuento = precioCompra * 0.20f;
            precioCompra -= descuento;
            JOptionPane.showMessageDialog(null, "El precio de compra es: " + precioCompra);
        }
        else {
            JOptionPane.showMessageDialog(null, "El precio de compra es: " + precioCompra);
        }
    }  
}

