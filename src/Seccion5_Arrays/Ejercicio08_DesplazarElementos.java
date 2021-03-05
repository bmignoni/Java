/* Ejercicio 08: Diseñar una aplicacion que declare una tabla de 10 elementos 
enteros. Leer mediante el teclado 8 numeros. Despues se debe pedir un numero y 
una posicion, insertarlo en la posicion indicada, desplazando los que estan 
detras.
 */
package Seccion5_Arrays;

import java.util.Scanner;

public class Ejercicio08_DesplazarElementos {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int [10];
        int numero, posicion;
        
        System.out.println("Llenar el arreglo");
        for(int i =0; i<8; i++){
            System.out.print((i)+ ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("\nDigite un numero");
        numero = entrada.nextInt();
        System.out.println("\nDigite una posicion");
        posicion = entrada.nextInt();
        
        // Correr una posicion los elementos detras de la posicion que el usuario quiere
        for(int i =7; i>=posicion; i--){         
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[posicion] = numero;
        System.out.println("\nEl nuevo arreglo es: ");
        for(int i =0; i<9; i++){
            System.out.println("Posicion "+i+": "+ arreglo[i]);
        }
    }
}
