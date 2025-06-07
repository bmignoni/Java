/* Ejercicio 09: Crear un programa que lea por teclado una tabla de 10 numeros 
enteros y la desplace una posicion hacia abajo: el primero pasa a ser el 
segundo,el segundo pasa a ser el tercero y asi sucesivamente. El ultimo pasa a
ser el primero.
 */
package Seccion5_Arrays;

import java.util.Scanner;

public class Ejercicio09_DesplazarPosiciones {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int [10];
        int ultimo;
        
        System.out.println("Llenar el arreglo");
        for(int i =0; i<10; i++){
            System.out.print(i+ ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();   
        }
        ultimo = arreglo[9];                         // Guardamos el ultimo arreglo
        
        for(int i=8; i>=0; i--){                     // Avanzar una posicion hacia abajo en el arreglo
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[0] = ultimo;                         // Ponemos el ultimo elemento como el primero
        
        System.out.println("\nEl nuevo arreglo es: ");
        
        for(int i =0; i<10; i++){
            System.out.println(i+". Numero: "+ arreglo[i]);
        }
        
        
    }
}