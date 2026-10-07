
package Actividad22;

import java.util.Scanner;

public class Actividad22 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    //Preguntamos la edad
    System.out.println("¿Cual es tu edad? ");
    int edad = sc.nextInt();
    
    //Comparamos la edad diciendo si la variable edad es mayor o igual a 18
    boolean menor = edad >= 18;
    
    System.out.println("¿Eres mayor de edad? " + menor);
    }
}
