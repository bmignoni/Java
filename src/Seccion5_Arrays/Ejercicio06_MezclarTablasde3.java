/* Leer los datos correspondiente a dos tablas de 12 elementos numericos, y 
mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la tabla B, otros
3 de la tabla a, otros 3 de la tabla B, etc.
 */
package Seccion5_Arrays;

import java.util.Scanner;

public class Ejercicio06_MezclarTablasde3 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        
        a = new int[12];
        b = new int[12];
        c = new int[24]; // la suma de los arreglos A y B
        
        // Pedimosel arreglo A
        System.out.println("Digite el primer arreglo: ");
        for(int i =0; i<12; i++){
            System.out.print((i+1)+ ". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        // Pedimosel arreglo B
        System.out.println("Digite el segundo arreglo: ");
        for(int i =0; i<12; i++){
            System.out.print((i+1)+ ". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        // Aqui se mezclan los arreglos
        // i para el arreglo A y j para el arreglo Bc y l k es para poder hacerlo de 3 en 3
        
        int i =0;
        int j =0;
        
        while(i<12){
            for(int k =0; k<3; k++){
            c[j]= a[i+k];  // 1° de A
            j++;
            }
            for(int k =0; k<3; k++){
                c[j]= b[i+k];  // 1° de B
                j++;
            }
            i+=3;
        }
        
        System.out.print("\nEl tercer arreglo es: ");
        for(i =0; i<24; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println(" ");
    }  
}
