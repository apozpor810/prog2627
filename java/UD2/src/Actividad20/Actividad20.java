package Actividad20;

import java.util.Scanner;

public class Actividad20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su contraseña pin");
        int suma = 0;
        int numero;

        do {
            System.out.println("Introduzca un numero: ");
            numero = sc.nextInt();
            suma = numero + suma;
            System.out.println("La Suma es " + suma);} 
        while (numero != 0);
        {
            System.out.println("Se acabo la suma");

        }
    }
}
