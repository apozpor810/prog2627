
package Actividad9;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================");
        System.out.println(" CALCULADORA BÁSICA ");
        System.out.println("====================");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        System.out.print("\nElige una opción (1-4): ");
        int opcion = sc.nextInt();
        
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        
        double resultado;
        
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break; // Regla de oro: break para evitar que continúe ejecutando los siguientes casos
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                }
                break;
            default:
                System.out.println("Opción no válida. Selecciona un número del 1 al 4.");
                break;
        }
    }
}