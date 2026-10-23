package Actividad21;

import java.util.Scanner;

public class Actividad21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de la tabla de multiplicar que desees");
        int numero = sc.nextInt();
        System.out.println();
        int multi = 1;

        while (multi <= 10) {
            System.out.println(numero + " * " + multi + " = " + numero * multi);
            ++multi;
        }
    }
}
