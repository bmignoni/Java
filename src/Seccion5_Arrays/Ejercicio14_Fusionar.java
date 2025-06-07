/*
Ejercicio 14: Leer dos series de 10 enteros, que estaran ordenados crecientemente.
Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
*/

package Seccion5_Arrays;

import java.util.Scanner;

public class Ejercicio14_Fusionar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        boolean creciente = true;

        a = new int[10]; // 10 elementos para el arreglo a
        b = new int[10]; // 10 elementos para el arreglo b
        c = new int[20]; // 10 elementos para el arreglo c

        System.out.println("Digite el primer arreglo: ");
        do {
            //Pedimos el arreglo
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un numero: ");
                a[i] = entrada.nextInt();
            }

            //Comprobamos si el arreglo 'a' esta ordenado
            for (int i = 0; i < 9; i++) {
                if (a[i] < a[i + 1]) { // Creciente 1-2-3
                    creciente = true;
                }
                if (a[i] > a[i + 1]) { // Decreciente 3-2-1
                    creciente = false;
                    break;
                }
            }
            if (!creciente) {
                System.out.println("\nEl arreglo 'a' esta desordenado, vuelva a digitar: ");
            }
        } while (!creciente);
        System.out.println("Digite el segundo arreglo: ");
        do {
            //Pedimos el arreglo
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un numero: ");
                b[i] = entrada.nextInt();
            }
            //Comprobamos si el arreglo 'b' esta ordenado
            for (int i = 0; i < 9; i++) {
                if (b[i] < b[i + 1]) { // Creciente 1-2-3
                    creciente = true;
                }
                if (b[i] > b[i + 1]) { // Decreciente 3-2-1
                    creciente = false;
                    break;
                }
            }
            if (!creciente) {
                System.out.println("\nEl arreglo 'b' esta desordenado, vuelva a digitar: ");
            }
        } while (!creciente);
        int i =0; // iterador i sera para el arreglo a
        int j =0; // iterador j sera para el arreglo b
        int k =0; // iterador k sera para el arreglo c

        while(i<10 && j<10){
            if(a[i] < b[j]){ //Si el elemento de 'a' es mejor de 'b'
                c[k] = a[i]; //copiamos el elemento de 'a'
                i++; //Avanzamos una posicion en 'a'
            }else{
                c[k] = b[j]; //copiamos el elemento de 'b'
                j++; //avanzamos una posicion mas en 'b'
            }
            k++; // avanzamos una posicion en 'c'
        }
        // Cuando salimos del while es porque un arreglo ('a' o 'b'), se ha copaido completamente
        if(i==10){ //significa que ya copiamos todo el arreglo 'a', falta el 'b'
            while(j<10){  //mientras el iterador sea menor a 10
                c[k] = b[j]; //copiamos el elemento de 'b' en 'c'
                j++; //avanzamos una posicion mas en 'b'
                k++; // avanzamos una posicion en 'c'
            }
        }else{ //significa que ya copiamos todo el arreglo de 'b', falta el 'a'
            while(i<10){
                c[k] = a[i];
                i++;
                k++;
            }
        }
        System.out.println("\nEl arreglo 'C' completo es: ");
        for(k=0;k<20;k++){
            System.out.print((c[k]+" - "));
        }
        System.out.println("");
    }
}