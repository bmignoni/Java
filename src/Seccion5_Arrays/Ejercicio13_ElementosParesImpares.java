/*
Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera,
y a continuacion los elementos impares.
*/

package Seccion5_Arrays;

import java.util.Scanner;

public class Ejercicio13_ElementosParesImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int conteoPares = 0, conteoImpares = 0;

        // llenando el arreglo
        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();

            //Si el numero es par
            if (arreglo[i] % 2 == 0) {
                conteoPares++;
            } else {
                conteoImpares++;
            }
        }

        //Crear los arreglos siguientes
        int par[] = new int[conteoPares]; // creamos el arreglo para almacenar los numeros pares
        int impar[] = new int[conteoImpares]; // y ahora los numeros impares

        conteoPares = 0;
        conteoImpares = 0;

        //Almacenamos los numeros pares e impares en sus arreglos
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] %2 == 0) { // Si el numero es par
                par[conteoPares] = arreglo[i];
                conteoPares++;
            } else { // Si el numero es impar
                impar[conteoImpares] = arreglo[i];
                conteoImpares++;
            }
        }

        System.out.print("\nArreglo pares: ");
        for (int i = 0; i < conteoPares; i++) {
            System.out.print(par[i] + " - ");
        }
        System.out.println("");

        System.out.print("\nArreglo impares: ");
        for (int i = 0; i < conteoImpares; i++) {
            System.out.print(impar[i] + " - ");
        }
        System.out.println("");
    }
}