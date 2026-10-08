
package Actividad27;

import java.util.Scanner;

public class Actividad27_1 {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         
         //Pedimos su nombre
         System.out.println("¿Como te llamas? ");
         String nombre = sc.nextLine();
         
         //Pedimos su edad
         System.out.println("¿Cuantos años tienes? ");
         int edad = sc.nextInt();
         
         double precio = (edad < 12) ? 5 : 8 ;
         
        System.out.println();
        System.out.println("Cliente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Precio de entrada: " + precio + " euros");
    }
}
