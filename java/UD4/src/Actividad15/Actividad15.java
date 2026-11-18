
package Actividad15;

import java.util.Scanner;

public class Actividad15 {
    
    public static void main(String[] args) {
        

        int[] notas = {4, 7, 3, 8, 5, 2, 9, 6, 4, 7};
        
        int contadorAprobados = 0;
        
        int contadorSuspensos = 0;
        
        boolean nota10 = false;
        
        int notaBuscar, contadorNota = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la nota a buscar:");
        
        notaBuscar = sc.nextInt();
        
        for (int nota : notas) {
            
            if (nota >= 5) contadorAprobados++; 
            
            if (nota < 5) contadorSuspensos++;
            
            if (nota == 10) nota10 = true;
            
            if (nota == notaBuscar) contadorNota++;
        }
        
        System.out.println("Datos de notas");
        
        System.out.println("Numero alumnos aprobados: " + contadorAprobados);
        
        System.out.println("Numero alumnos suspensos: " + contadorSuspensos);
        
        System.out.println("Hay algun alumno con un 10: " + nota10);
        
        
        System.out.println("Hay " + contadorNota + " alumnos con un " + notaBuscar);
        
    }
    
}