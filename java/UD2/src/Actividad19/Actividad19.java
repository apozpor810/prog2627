package Actividad19;

import java.util.Scanner;

public class Actividad19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su contraseña pin");
        int pin = 0;
        int intentos = 1;

        while (intentos < 3 && pin != 1717) {
            pin = sc.nextInt();
            if (pin == 1717) {
                System.out.println("Bienvenido, se ha intentado entrar " + intentos + " veces");
            } else {
                ++intentos;
                System.out.println("Pin Incorrecto, intentos restantes " + (4 - intentos));
                System.out.println("Ingrese su contraseña pin");
            }
        }
    }
}
