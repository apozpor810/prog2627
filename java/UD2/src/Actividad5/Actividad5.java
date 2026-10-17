package Actividad5;

import java.util.Scanner;

public class Actividad5 {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
 //Pedir numero 1
 System.out.println("Ingrese el pirmer numero ");
 int numero1 = sc.nextInt();
//Pedir numero 2
 System.out.println("Ingrese el segundo numero ");
 int numero2 = sc.nextInt();
 
 //Dependiendo de si es mayor, menor o igual sale un resultado diferente
 if (numero1 > numero2){System.out.println("El numero " + numero1 + " es mayor que " + numero2);}
 else if (numero1 == numero2){System.out.println("El numero " + numero1 + " es igual que " + numero2);}
 else {System.out.println("El numero " + numero2 + " es mayor que " + numero1);}
            
  }
}
