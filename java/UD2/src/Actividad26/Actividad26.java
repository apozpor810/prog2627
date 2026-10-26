
package Actividad26;

import java.util.Scanner;

public class Actividad26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca dos numeros mayores que 0:");
        System.out.print("Introduce a: ");
        int a = sc.nextInt();
        
        System.out.print("Introduce b: ");
        int b = sc.nextInt();
        
        // Es un bucle el cual se repite hasta que b sea 0
       while (b != 0) {
           //Compara si es a es mayor que b o al contrario, el mayor acaba 
           //siendo restado por el menor sin descartar el valor del menor 
           //pero si cambiando el valor del mayor
           
           //Si el mayor es a, se le resta b y el resultado se covierte el nuevo a
            if (a > b) {
                a = a - b;
           //Si el mayor es b, se le resta a y el resultado se covierte el nuevo b
            } else {
                b = b - a;
            }
        }
        
        // Al salir del bucle, 'a' (o 'b') contiene el resultado final
        System.out.println("El resultado es: " + a);
    }
}