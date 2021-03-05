/* Ejercicio 04: Leer 10 numeros enteros, guardarlos en un arreglo. Debemos 
mostrarlos en el siguiente orden: el primero, el ultimo, el segundo, el 
penultimo, el tercero, etc..
 */
package Seccion5_Arrays;

import java.util.Scanner;

public class Ejercicio04_difOrden {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for(int i =0; i<10; i++){
            System.out.print((i+1)+ ". Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("El resultado es: ");
        for(int i =0; i<5; i++){
            System.out.print(numeros[i]+ " ");    // imprime el primer elemento
            System.out.print(numeros[9-i]+ " ");  // imprime el ultimo elemento 
        }
        
        System.out.println();
    }
}
