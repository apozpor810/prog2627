
package Actividad27;

import java.util.Scanner;

public class Actividad27_2 {
       public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         
         //Pedimos su nombre
         System.out.println("¿Como te llamas? ");
         String nombre = sc.nextLine();
         
         //Pedimos su edad
         System.out.println("¿Cuantos años tienes? ");
         int edad = sc.nextInt();
         
         //edadA es para que segun edad coja 6 euros (los mayores de 65 años) o
         //8 euros (los de 12 o mas pero menores de 66 años)
         int edadA = edad > 65 ? 6 : 8;
         
          //edadB es para que segun edad coja 8 euros (los mayores de 11 años) o
         //5 euros (para los menores de 12 años)
         int edadB = edad > 11 ? 8 : 5;
         
         //y por ultimo este escoge el valor que haya salido en edadA o edadB 
         int precio = edad >= 12 ? edadA : edadB ;
         
        System.out.println();
        System.out.println("Cliente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Precio de entrada: " + precio + " euros");
    }
}
