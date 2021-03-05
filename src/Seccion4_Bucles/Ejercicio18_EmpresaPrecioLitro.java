/* Ejercicio 18: Una emresa que se dedica a la venta de desinfectantes necesita 
un programa para gestionar las facturas. En cada factura figura: el codigo del 
articulo y la cantidad vendida en litros. Se pide 5 
facturas introducidas: Facturacion total, cantidad en litros vendidos del 
articulo 1 y cuantas facturas se emitieron de mas de $600.- Tener en cuenta que
solo existen tres productos con precios: 
1 - 0.60 $/litro
2 - 3.00 $/litro
3 - 1.25 $/litro

 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio18_EmpresaPrecioLitro {
    public static void main (String [] args){
        int codigo, litros, litrosArticulo1=0, conteoMas600=0;
        float precioLitro=0,importeFactura, facturacionTotal=0;
        
        for (int i=1; i<=5; i++){
            do{
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" +i+ "\nDigite el codigo: "));
            }while (codigo<1 || codigo>3);
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" +i+ "\nDigite la cantidad en litros: "));
            
            switch(codigo){
                case 1: precioLitro = 0.60f; break;
                case 2: precioLitro = 3; break;
                case 3: precioLitro = 1.25f; break;
            }
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
