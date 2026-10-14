
package Actividad1;

import java.util.Scanner;

public class Actividad1 {
        public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Ingresa su nombre de usuario ");
 String usuario = sc.nextLine();
            
 if (usuario.equals("Alex")){System.out.println("¡Bienvenido " + usuario + "!");}
 else {System.out.println("Usuario denegado");};
  }
}
