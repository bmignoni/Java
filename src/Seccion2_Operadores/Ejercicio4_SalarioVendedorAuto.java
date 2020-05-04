/* Ejercicio 4: Una compañia de venta de autos usados, paga a su 
personal de ventas un salario de $1000 mensuales, mas una comisión
de $ 150 por cada auto vendido, mas el 5% del valor de la venta del
auto. Cada mes el capturista de la empresa ingresa en la computadora
los datos pertinentes. Hacer un programa que calcule e impima el
salario mensual de un vendedor dado. */

package Seccion2_Operadores;

import java.util.Scanner;


public class Ejercicio4_SalarioVendedorAuto {
    
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        
        final int salario = 1000;
        int nAutosVendidos;
        float costoAuto, salarioTotal;
        
        System.out.println("Digite el total de autos vendidos: ");
        nAutosVendidos = entrada.nextInt();
        System.out.println("Digite el costo del auto: ");
        costoAuto = entrada.nextFloat();
        
        salarioTotal= salario + (nAutosVendidos*150) + (0.05f * costoAuto*nAutosVendidos);
        
        System.out.println("\nEl salario del empleado es: " + salarioTotal);
    
    }  
}
