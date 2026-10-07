
package Actividad21;

import java.util.Scanner;

public class Actividad21 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Inserta el radio");
    
    double radio = sc.nextDouble();
    double area = Math.PI * radio * radio;
    
    System.out.println("El area es " + area);
    }
}
