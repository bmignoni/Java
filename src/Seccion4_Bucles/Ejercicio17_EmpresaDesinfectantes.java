/* Ejercicio 17: Una emresa que se dedica a la venta de desinfectantes necesita 
un programa para gestionar las facturas. En cada factura figura: el codigo del 
articulo, la cantidad vendida en litros y el precio por litros. Se pide 5 
facturas introducidas: Facturacion total, cantidad en litros vendidos del 
articulo 1 y cuantas facturas se emitieron de mas de $600.-
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio17_EmpresaDesinfectantes {
    public static void main (String [] args){
        int codigo, litros, litrosArticulo1=0, conteoMas600=0;
        float precioLitro, importeFactura, facturacionTotal=0;
        
        for (int i=1; i<=5; i++){
            
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" +i+ "\nDigite el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" +i+ "\nDigite la cantidad en litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N°" +i+ "\nDigite el precio por litro: "));
           
            importeFactura = (float) litros * precioLitro;
            facturacionTotal += importeFactura;
            
            if(codigo == 1){
                litrosArticulo1 += litros;
            }
            if(importeFactura > 600){
                conteoMas600++;
            }
            
        }
        System.out.println("Resumen de Ventas");
        System.out.println("Facturacion Total: " + facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1: " + litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: " + conteoMas600);
    }
}
