/* Ejercicio 13: Hacer un programa que simule un cajero automatico con un saldo
inicial de 1000 Dolares, con el siguiente menu de opciones:
- Ingresar dinero a la cuenta
- Retirar dinero de la cuenta
- Salir
 */
package Seccion3_Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio13_CajeroAutomatico {
    
    public static void main (String[] args){
        final int saldoInicial = 1000;
        int opcion;
        float ingreso, retiro, saldoActual;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su Cajero Automatico\n"
        + "1.Ingresar dinero de la cuenta\n"
        + "2.Retirar dinero de la cuenta\n"
        + "3.Salir"));
        
        switch (opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de dinero que desea ingresar a su cuenta"));
                    saldoActual = saldoInicial + ingreso;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es: " + saldoActual);
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de dinero que desea retirar de su cuenta"));
                    
                    if(retiro > saldoInicial){
                        JOptionPane.showMessageDialog(null, "Su saldo es insuficiente: " + saldoInicial);
                    }
                    else{
                        saldoActual = saldoInicial - retiro;
                        JOptionPane.showMessageDialog(null, "Su saldo actual es: " + saldoActual);
                    }
                    break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null, "La opcion ingresada es invalida");
                    break;
            
        }    
    }
}
