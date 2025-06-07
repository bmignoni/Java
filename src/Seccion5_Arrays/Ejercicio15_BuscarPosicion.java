/*
Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
Se debe mostrar la posicion en que se encuentra. Si no esta, indicarlo con un mensaje.
*/

package Seccion5_Arrays;

import java.util.Scanner;

public class Ejercicio15_BuscarPosicion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], numero;
        Boolean creciente = true;

        arreglo = new int[10]; //creamos el arreglo de 10 posiciones

        do {
            //pedimos el arreglo
            System.out.println("Rellene el arreglo: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + ". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //verificar si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if (arreglo[i] < arreglo[i + 1]) { //Creciente: 1-2-3...
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) { //Decreciente: 3-2-1
                    creciente = false;
                    break;
                }
            }
            if (!creciente) {
                System.out.print("\nEl arreglo esta desordenado, digite nuevamente: \n");
            }
        } while (!creciente);

        //Pedimos el numero a buscar
        System.out.print("\nDigite el numero a buscar en el arreglo: ");
        numero = entrada.nextInt();

        // Buscamos el numero en el arreglo
        int i = 0;
        //4
        //1-2-3-5..-10
        while (i < 10 && arreglo[i] < numero) {
            i++;
        }

        if (i == 10) {  //Hemos recorrido el arreglo y no hemos encontrado nada
            System.out.println("\nNumero no encontrado");
        } else {
            if (arreglo[i] == numero) {
                System.out.println("\nNumero encontrado en la posicion: " + i);
            } else {
                System.out.println("\nNumero no encontrado");
            }
        }
    }
}