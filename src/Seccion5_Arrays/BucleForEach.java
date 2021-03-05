/* Bucle For Each
 */
package Seccion5_Arrays;

public class BucleForEach {
    public static void main (String[]args){
        String[] nombres = {"Alejandro", "Maria", "Luisa", "Juan", "Paula", "Luis", "Roberto", "Flor", "Jessica"};
        
        // Esto deberiamos hacer si no usamos el bucle For Each
        // for(int i=0; i<nombres.length; i++){      // nombreVector.length te dice cuantos elementos hay en un arreglo
            // System.out.println(nombres[i]);
            
        for (String i:nombres){
            System.out.println("Nombre: "+ i);
        }
            
    }
}
