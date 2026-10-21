package Actividad9;

import java.util.Scanner;

public class Actividad9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================");
        System.out.println(" CALCULADORA BASICA ");
        System.out.println("=================");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        // Para elegir que operacion quieres hacer
        System.out.print("\nElige una opción (1-4): ");
        int opcion = sc.nextInt();

        // Primer numero
        System.out.print("Introduce el primer numero: ");
        double num1 = sc.nextDouble();

        // Segundo numero
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = 0; 

        switch (opcion) {
            case 1 -> resultado = num1 + num2;
            case 2 -> resultado = num1 - num2;
            case 3 -> resultado = num1 * num2;
            case 4 -> resultado = num1 / num2;
            default -> System.out.println("Opción no válida. Selecciona un numero del 1 al 4.");
        }
    }
}