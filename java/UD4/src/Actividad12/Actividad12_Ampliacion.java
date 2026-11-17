
package Actividad12;

import java.util.Scanner;

public class Actividad12_Ampliacion {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {12, 5, 8, 21, 4, 16, 8};
        int contador = 0;
        System.out.println("Que numero deseas buscar?");
        int numElegido = sc.nextInt();
        
        for (int numero : numeros){
        if (numero == numElegido){
        System.out.println("El numero elegido esta en la posicion " + contador);
        }
        ++contador;
        }
    }
}


