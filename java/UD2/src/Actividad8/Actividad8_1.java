
package Actividad8;

import java.util.Scanner;

public class Actividad8_1 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
            //Pon tu nota
     System.out.println("Pon tu nota ");
     int nota = sc.nextInt();
           
    if (nota < 5) {System.out.println("Tu nota es Insuficiente");}
    else if (nota == 5) {System.out.println("Tu nota es Suficiente");}
    else if (nota == 6) {System.out.println("Tu nota es Bien");}
    else if (nota == 7) {System.out.println("Tu nota es Notable");}
    else if (nota == 8) {System.out.println("Tu nota es Notable");}
    else if (nota > 8) {System.out.println("Tu nota es Sobresaliente");}
     }
}
