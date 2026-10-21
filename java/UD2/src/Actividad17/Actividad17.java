
package Actividad17;

import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija una opcion");
        System.out.println("1 Mostrar saldo");
        System.out.println("2 Retirar dinero");
        System.out.println("3 Salir");
        int op = sc.nextInt();
        
        while (true) { 
            if (op == 1) {System.out.println("Mostrando Saldo");}
            else if (op == 2) {System.out.println("Retirando dinero");}
            else if (op == 3) {System.out.println("Saliendo"); break;}
            else {System.out.println("Opcion incorrecta, elija bien");}
        }
    }
}
