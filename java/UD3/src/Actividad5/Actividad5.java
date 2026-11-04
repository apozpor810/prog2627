package Actividad5;

import java.util.Scanner;

public class Actividad5 {

    public static void main(String[] args) {

        int seleccionarMenu = 0;

        // Pedir los datos al usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");

        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero:");

        double num2 = sc.nextDouble();

        System.out.println("Opcion 1 suma");
        System.out.println("Opcion 2 resta");
        System.out.println("Opcion 3 multiplicacion");
        System.out.println("Opcion 4 division");
        
        seleccionarMenu = sc.nextInt();

        if (num2 == 0 && seleccionarMenu == 4) {

            System.out.println("No se puede dividir entre 0");

        }

        // Menu calculadora
        switch (seleccionarMenu) {

            case 1:

                System.out.println("Has seleccionado la suma");

                double suma = sumarNumeros(num1, num2);

                System.out.println(num1 + " + " + num2 + " : " + suma);

                break;

            case 2:

                System.out.println("Has seleccionado la resta");

                double resta = restarNumeros(num1, num2);

                System.out.println(num1 + " - " + num2 + " : " + resta);

                break;

            case 3:
                System.out.println("Opcion 1 (Multiplicacion normal)");
                System.out.println("Opcion 2 (Multiplicacion normal con 3 numeros)");
                System.out.println("Opcion 3 (Multiplicacion pasandolo a entero)");
                int opcion = sc.nextInt();
                switch (opcion) {

                    case 1:
                        System.out.println("Has seleccionado la multiplicacion caso 1");

                        double multiplicacion = multiplicarNumeros(num1, num2);

                        System.out.println(num1 + " * " + num2 + " : " + multiplicacion);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la multiplicacion caso 2, elija el tercer numero");
                        double num3 = sc.nextDouble();
                        double multiplicacion2 = multiplicarNumeros(num1, num2, num3);

                        System.out.println(num1 + " * " + num2 + " * " + num3 + " : " + multiplicacion2);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la multiplicacion caso 3");

                        double multiplicacion3 = multiplicarNumeros(num1, num2);

                        System.out.println(num1 + " * " + num2 + " : " + multiplicacion3);
                        break;
                    default:
                        System.out.println("Error, opcion no valida");
                        break;
                }
                break;

            case 4:

                System.out.println("Has seleccionado la division caso 1");

                double division = dividirNumeros(num1, num2);

                System.out.println(num1 + " / " + num2 + " : " + division);

                break;

            default:

                System.out.println("No has seleccionado una operacion valida");

                break;

        }
    }

    public static double sumarNumeros(double num1, double num2) {

        double suma = num1 + num2;

        return suma;

    }

    public static double restarNumeros(double num1, double num2) {

        double resta = num1 - num2;

        return resta;

    }

    public static double multiplicarNumeros(int num1, int num2) {

        double multiplicacion = num1 * num2;

        return multiplicacion;

    }

    public static double multiplicarNumeros(double num1, double num2, double num3) {

        double multiplicacion2 = num1 * num2 * num3;

        return multiplicacion2;

    }

    public static double multiplicarNumeros(double num1, double num2) {

        double multiplicacion3 = (int) (num1 * num2);

        return multiplicacion3;

    }

    public static double dividirNumeros(double num1, double num2) {

        double division = num1 / num2;

        return division;

    }

}
