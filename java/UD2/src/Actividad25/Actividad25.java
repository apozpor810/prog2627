package Actividad25;

import java.util.Scanner;

public class Actividad25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero");
        int numero = sc.nextInt();
        int multi = 1;
        while (numero > 1) {
            multi = multi * numero;
            --numero;
        }
        System.out.println("La Multiplicacion es " + multi);
    }
}
