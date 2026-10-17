
package Actividad6;

import java.util.Scanner;

public class Actividad6 {
            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                
 //Pedir numero 1
 System.out.println("Ingrese el pirmer numero ");
 int numero = sc.nextInt();
            
  //Dependiendo de si es mayor, menor o igual sale un resultado diferente
if (numero % 2 == 0) { System.out.println("El número " + numero + " es par");} 
else {System.out.println("El numero " + numero + " es impar");}
            }
}
