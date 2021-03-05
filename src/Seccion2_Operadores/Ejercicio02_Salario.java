/* Ejercicio 2:  Hacer un programa que calcule e imprima el salario
semanal de un empleado a partir de sus horas semanales trabajadas
y de su salario por hora*/

package Seccion2_Operadores;

import java.util.Scanner;

public class Ejercicio02_Salario {
    public static void main (String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int horasSemanales;
        float salarioHora, salarioTotal;
        
        System.out.println("Digite las horas semanales trabajadas: ");
        horasSemanales = entrada.nextInt();
        System.out.println("Digite el salario que gana por hora: ");
        salarioHora = entrada.nextFloat();
        
        salarioTotal = horasSemanales * salarioHora;
        
        System.out.println("\n El salario semanal es: " + salarioTotal);
        
    }
    
}
