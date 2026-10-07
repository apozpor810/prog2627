
package Actividad21;

import java.util.Scanner;

public class Actividad21 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    //Preguntamos el radio
    System.out.println("Inserta el radio");
    double radio = sc.nextDouble();
    
    //Calculamos el Area
    double area = Math.PI * radio * radio;
    
    //Calculamos La longitud
    double longitud = 2 * Math.PI * radio;
    
    System.out.println("El area es " + area + " y la longitud es " + longitud);
    }
}
