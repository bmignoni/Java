/* VECTORES: se definen de la siguiente manera
int[] nombreVector = new int [cantidad de posiciones];
int[] edad = new int [4];
 */
package Seccion5_Arrays;

public class Arrays {
    public static void main (String[] args){
    
        // Modo A de declarar un Vector y luego Asignar
        int[]numeros = new int[3];
        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;
        
        // Imprimir un Vector:
        // System.out.println(numeros[0]);
       
        
        // Modo B de declarar y Asignar un Vector
        String[] nombres = {"Barbara", "Agustina", "Paula"};
        
        for(int i=0; i<3;i++)
            System.out.println(nombres[i]);
    }
}
