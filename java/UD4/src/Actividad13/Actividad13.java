
package Actividad13;

import java.util.Scanner;

public class Actividad13 {
            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {12, 5, 8, 21, 4, 16, 8};
        int contador = 0;
        System.out.println("Que numero deseas buscar?");
        int numElegido = sc.nextInt();
        boolean hay = false;
        
        for (int numero : numeros){
        if (numero == numElegido){
        System.out.println("El numero elegido esta en la posicion " + contador);
        hay = true;
        }
        ++contador;
        }
        if (hay == false){
        System.out.println("No existe ese numero en la array");
        }
    }
}

