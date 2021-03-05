/* Ejercicio 3: Leer numeros hasta que se introduzca un 0. Para cada uno 
indicar si es par o impar.
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio03_ParImpar {
    
    public static void main (String []args){
        
        int numero;
        
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            while (numero != 0){
                if (numero%2 == 0){
                    System.out.println("El numero: "+numero+" es PAR");
                }
                else{
                    System.out.println("El numero: "+numero+" es IMPAR");
                }
                
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro nuemro: "));
        }
    }
    
}
