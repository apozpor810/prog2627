
package Actividad24;

import java.util.Scanner;

public class Actividad24 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    //Preguntamos si llueve o no
    System.out.println("¿Esta lloviendo? 1 es si y 0 es no ");
    int lluvia = sc.nextInt();
    
    
    //Preguntamos si hemos hecho la tarea
    System.out.println("¿He hecho la tarea? 1 es si y 0 es no ");
    int tarea = sc.nextInt();
    
    //Le preguntamaos si vamos a la biblioteca
    System.out.println("¿Irás a la biblioteca? 1 es si y 0 es no ");
    int biblioteca = sc.nextInt();
    
    //Si la lluvia es distinto a 0 es verdadero y si tarea es 1 sale verdadero y si tarea es 0 pero biblioteca es 1 es verdadero
    boolean salir = lluvia != 1 && (tarea == 1 || biblioteca == 1);
    
    System.out.println("¿Puedo salir? " + salir);    
        
        
    }
}