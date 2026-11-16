

import java.util.Scanner;

public class Proyecto {

    //Operacion de suma
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    //Operacion de resta
    public static double restar(double a, double b) {
        return a - b;
    }
    
    //Operacion de multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    //Operacion de multiplicar 3 numeros
    public static double multiplicarTres(double a, double b, double c) {
        return a * b * c;
    }
    
    //Operacion de dividir
    public static double dividir(double a, double b) {
        return a / b;
    }
    
    //Operacion factorial
    public static int factorial(int n) {
        if (n < 0) return 0;
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    //Operacion para saber si es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
    
    
