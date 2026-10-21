
package Actividad9;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================");
        System.out.println(" CALCULADORA BASICA ");
        System.out.println("====================");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        
        
        //Para elegir que operacion quieres hacer
        System.out.print("\nElige una opción (1-4): ");
        int opcion = sc.nextInt();
        
        //Primer numero
        System.out.print("Introduce el primer numero: ");
        double num1 = sc.nextDouble();
        
        //Segundo numero
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        
        //Variable resultado
        double resultado;
        
        switch (opcion) {
            case 1:
                //Aqui ponemos para que resultado funcione con este case
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break; //break para evitar que continúe ejecutando los siguientes casos
            case 2:
                //Aqui ponemos para que resultado funcione con este case
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                //Aqui ponemos para que resultado funcione con este case
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    //Aqui ponemos para que resultado funcione con este case
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                }
                break;
            default:
                System.out.println("Opción no válida. Selecciona un numero del 1 al 4.");
                break;
        }
    }
}