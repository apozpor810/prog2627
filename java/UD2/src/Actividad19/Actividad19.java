package Actividad19;

import java.util.Scanner;

public class Actividad19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 0;
        int intentos = 1;
        int numeroIntentos = 3;

        while (intentos <= numeroIntentos && pin != 1717) {
            System.out.println("Ingrese su pin");
            pin = sc.nextInt();
            if (pin == 1717) {
                System.out.println("Bienvenido, se ha intentado entrar " + intentos + " veces");
            } else {
                System.out.println("Pin Incorrecto, intentos restantes " + (numeroIntentos - intentos));
                System.out.println("Ingrese su contraseña pin");
                ++intentos;
            }
        }
    }
}
