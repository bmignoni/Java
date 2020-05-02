/* Ejercicio 5: La calificacion final de un estudiante de informatica se calcula 
en base a las calificaciones de su rendiemiento academico: participación, 
primer examen parcial, segudo examen parcial y examen final. Sabiendo que las 
calificaciones anteriores entran a la calficación final con ponderaciones del
10%, 25%, 25% y 40%. Hacer una programa que calcule e imprima la calificacion 
final obtenida por un estudiante.
 */
package Seccion2_Operadores;

import java.util.Scanner;


public class Ejercicio_5 {
    
    public static void main (String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        
        // Pedir los datos necesarios
        System.out.println("Digite la nota de participación");
        participacion = entrada.nextFloat();
        
        System.out.println("Digite la nota del Primer examen  parcial");
        primerExamen = entrada.nextFloat();
        
        System.out.println("Digite la nota del Segundo examen  parcial");
        segundoExamen = entrada.nextFloat();
        
        System.out.println("Digite la nota del examen  final");
        examenFinal = entrada.nextFloat();
        
        participacion *= 0.10f;  // participacion = participacion *0.10
        primerExamen *= 0.25f;   // primerExamen = primerExamen *0.25f;
        segundoExamen *= 0.25f;  // segundoExamen = segundoExamen * 0.25f;
        examenFinal *= 0.40f;    // examenFinal = examenFinal * 0.40f;
        
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        
        System.out.println("\nLa nota final del alumno es: " + notaFinal);
        
        
        
    }
}
