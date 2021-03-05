/* Ejercicio 5: Realizar un juego para adivinar un numero aleatorio entre 0-100,
y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea mayor o 
menor con respecto a N. El proceso termina cuando el usuario acierta y por 
ultimo mostrar el numero de intentos.
 */
package Seccion4_Bucles;

import javax.swing.JOptionPane;

public class Ejercicio05_JuegoAdivinaNumero {
    
    public static void main (String [] args){
    
    int numero, aleatorio, contador = 0;
    
    
    aleatorio = (int)(Math.random()*100); //lo multiplica por 100 para convertirlo numero entero y no con 0.13
    
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(aleatorio > numero){
                System.out.println("Digite un numero mayor");
            }
            else{
                System.out.println("Digite un numero menor");
            }
            contador++; // 
            
        }while(numero != aleatorio);
        
        System.out.println("\n Genial!! Adivinaste el numero en : " +contador+" intentos");
    }
}
