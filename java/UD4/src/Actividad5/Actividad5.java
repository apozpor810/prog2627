package Actividad5;

import java.util.Scanner;

public class Actividad5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array:");
        int tamanio = Integer.parseInt(sc.nextLine());

        String[] elementos = new String[tamanio];

        System.out.println("Rellenando el array");
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Introduce el elemento para la posición " + i + ":");
            elementos[i] = sc.nextLine();
        }

        System.out.println("Introduce la posición del array que quiere consultar:");
        int posicion = Integer.parseInt(sc.nextLine());

        if (posicion >= 0 && posicion < elementos.length) {
            System.out.println("El valor almacenado en la posición " + posicion + " es: " + elementos[posicion]);
        } else {
            System.out.println("Error: No has introducido una posición válida (debe estar entre 0 y " + (elementos.length - 1) + ").");
        }
    }
}