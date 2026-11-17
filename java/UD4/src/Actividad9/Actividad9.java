
package Actividad9;

import java.util.Scanner;

public class Actividad9 {
    
        public static void main(String[] args) {
        
        double[] notasAlumnos = new double[10];
        
        int contador, contadorSuspensos;
        
        double porcentaje;

        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<notasAlumnos.length; i++) {
            
            System.out.println("Introduce el valor:");
            
            notasAlumnos[i] = sc.nextDouble();
            
        }

        contadorSuspensos = arrayEntreValores(notasAlumnos, 0.0, 5.0);
        
        System.out.println("El numero de alumnos suspensos es: " + contadorSuspensos);

        contador = arrayEntreValores(notasAlumnos, 5.0, 7.0);
        
        System.out.println("El numero de alumnos aprobados es: " + contador);
        
        contador = arrayEntreValores(notasAlumnos, 7.0, 9.0);
        
        System.out.println("El numero de alumnos notables es: " + contador);

        contador = arrayEntreValores(notasAlumnos, 9.0, 10.0);
        
        System.out.println("El numero de alumnos sobresalientes es: " + contador);

        porcentaje = ((notasAlumnos.length - contadorSuspensos) * 100) / notasAlumnos.length;
        
        System.out.println("El porcentaje de alumnos aprobados es: " + porcentaje + "%");
        
    }

    public static int arrayEntreValores(double[] numerosArray, double valorMinimo, double valorMaximo) {
        
      int contador = 0;
      
      for (int i=0; i<numerosArray.length; i++) {
          
          if(numerosArray[i] >= valorMinimo && numerosArray[i] < valorMaximo) contador++;
          
      }
      
      return contador;
        
    }
    
}

