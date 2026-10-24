
package Actividad16;

import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el numero hasta el que quieres contar: ");
        int limite = sc.nextInt();

        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }
    }
}