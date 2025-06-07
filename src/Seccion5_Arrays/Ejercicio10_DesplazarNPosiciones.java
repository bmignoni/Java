/* Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 numeros 
enteros y desplace N posiciones en el arreglo (N es digitado por el usuario)

*/

package Seccion5_Arrays;

import java.util.Scanner;

public class Ejercicio10_DesplazarNPosiciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; // creamos el arreglo con 10 elementos enteros
        int n_posicion, ultimo;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("\nDigite la cantidad de posiciones a desplazar: ");
        n_posicion = entrada.nextInt();

        for(int vuelta = 1; vuelta <= n_posicion; vuelta++){
            ultimo = arreglo[9]; // guardamos el ultimo elemento del arreglo
            for(int i = 8; i >= 0; i--){ // desplazamos una posicion en el arreglo
                arreglo [i+1] = arreglo[i];
            }
            arreglo[0] = ultimo; // ponemos el ultimo elemento primero
        }
        System.out.println("\nEl arreglo resultante es: ");
        for(int i = 0; i < 10; i++){
            System.out.println(i + ". Elemento: " + arreglo[i]);
        }
    }
}