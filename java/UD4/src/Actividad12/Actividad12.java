package Actividad12;

import java.util.Scanner;

public class Actividad12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {12, 5, 8, 21, 4, 16, 8};
        int posicion = 0;
        System.out.println("Que numero deseas buscar?");
        int numElegido = sc.nextInt();
        boolean encontrado = true;

        while (posicion < numeros.length && encontrado == true) {
            if (numeros[posicion] == numElegido) {
                System.out.println("El numero elegido esta en la posicion " + posicion);
                encontrado = false;
            }
            ++posicion;
        }
    }
}
