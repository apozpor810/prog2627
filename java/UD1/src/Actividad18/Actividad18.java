
package Actividad18;

import java.util.Scanner;

public class Actividad18 {
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("¿Que año es?");
    int añoActual = sc.nextInt();
    
    System.out.println("¿En que año naciste?");
    int añoNacido = sc.nextInt();
    int años = añoActual - añoNacido;
        
     System.out.println("Tienes " + años + " años");
       
    }
}
