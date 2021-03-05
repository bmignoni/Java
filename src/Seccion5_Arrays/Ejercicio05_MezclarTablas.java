/* Ejercicio 05: Leer por teclado dos tablas de 10 numeros enteros y mezclarlas
en una tercera de la forma: el 1° de A, el 1° de B, el 2° de A, el 2° de B, etc.
 */
package Seccion5_Arrays;

import java.util.Scanner;

public class Ejercicio05_MezclarTablas {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        
        a = new int[10];
        b = new int[10];
        c = new int[20]; // la suma de los arreglos A y B
        
        // Pedimosel arreglo A
        System.out.println("Digite el primer arreglo: ");
        for(int i =0; i<10; i++){
            System.out.print((i+1)+ ". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        // Pedimosel arreglo B
        System.out.println("Digite el segundo arreglo: ");
        for(int i =0; i<10; i++){
            System.out.print((i+1)+ ". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        // Aqui se mezclan los arreglos
        // i para el arreglo A y j para el arreglo B
        
        int j =0;
        for(int i =0; i<10; i++){
            c[j]= a[i];  // 1° de A
            j++;
            c[j]= b[i];  // 1° de B
            j++;
        }
        System.out.println("\nEl tercer arreglo es: ");
        for(int i =0; i<20; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println(" ");
    }  
}
