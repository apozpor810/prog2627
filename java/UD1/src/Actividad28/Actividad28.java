
package Actividad28;

import java.util.Scanner;

public class Actividad28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        
        //Pedimos la primera nota
        System.out.println("Escriba la nota del primer trimestre ");
        int primerTrimestre = sc.nextInt();
        
        //Pedimos la segunda nota
        System.out.println("Escriba la nota del segundo trimestre ");
        int segundoTrimestre = sc.nextInt();
        
        //Pedimos la tercera nota
        System.out.println("Escriba la nota del tercer trimestre ");
        int tercerTrimestre = sc.nextInt();
        
        //Se suman las notas y se dividen y como es un int de decimal pasa a numero entero
        int notaFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre)/3;
        
        System.out.println("La nota final es " + notaFinal);
    }
}
