package Actividad10;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir lo que miden los lados
        System.out.println("Ingrese lado a ");
        int ladoA = sc.nextInt();
        System.out.println("Ingrese lado b ");
        int ladoB = sc.nextInt();
        System.out.println("Ingrese lado c ");
        int ladoC = sc.nextInt();

        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoC + ladoB > ladoA)) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Es un triangulo Equilatero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Es un triangulo Isosceles");
            } else {
                System.out.println("Es un triangulo Escaleno");
            }
        } else {
            System.out.println("No se puede crear un triangulo con estas medidas");
        }
    }
}