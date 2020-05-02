
package Seccion2_Operadores;


public class C_incrementar {
    
    public static void main (String [] args){
        int z = 5;
        
        z++; // z = z + 1;  // z += 1;
        // tambien se puede decrementar z--;
        
        System.out.println(z);
        
        int x = 5, y;
        
        y = x++;
        
        
        System.out.println(y); // vale 5 porque asigna el valor de x a y
        System.out.println(x); // vale 6 porque le incremento en el mismo momento que asigno a y
        
        
    }
}
