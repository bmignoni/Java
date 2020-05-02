
package Seccion2_Operadores;


public class D_claseMath {
    
    public static void main (String [] args) {
        
        // Ejercicio 1 Raiz
        double raiz = Math.sqrt(9);
        int raiz1 = (int)Math.sqrt(9);
        
        System.out.println("Resultado Ejercicio 1");
        System.out.println(raiz);
        System.out.println(raiz1);
        
        // Ejercicio 2 Potencia
        double base = 5, exponente = 2;
        double  resultado = Math.pow(base, exponente);
        
        System.out.println("Resultado Ejercicio 2");
        System.out.println(resultado);
        
        // Ejercicio 3
        double numero = 4.56;
        long  resultado1 = Math.round(numero);
        
        System.out.println("Resultado Ejercicio 3");
        System.out.println(resultado1);
        
        // Ejercicio 4 Redondear numero
        float numero1 = 7.89f;
        int  resultado2 = Math.round(numero1);
        
        System.out.println("Resultado Ejercicio 4");
        System.out.println(resultado2);
        
        // Ejercicio 5 METODO RANDOM
        double numerorandom = Math.random();
             
        System.out.println("Resultado Ejercicio 5");
        System.out.println(numerorandom);
        
    }
    
}
