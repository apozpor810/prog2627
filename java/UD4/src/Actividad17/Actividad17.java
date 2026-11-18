package Actividad17;

import java.util.Scanner;

public class Actividad17 {

    public static void main(String[] args) {
        int[] numeros = {5, 2, 7, 1, 6};

        mostrar(numeros);
        System.out.println("El array sumado da " + sumar(numeros));
        System.out.println("La media de la suma del array es " + calcularMedia(numeros));
        System.out.println("El numero mas alto del array es " + obtenerMaximo(numeros));
        contarPares(numeros);
        buscarPrimero(numeros);
    }

    public static void mostrar(int[] numeros) {
        System.out.println("Empezando a contar los numeros");
        for (int numero : numeros) {
            System.out.println(numero);

        }
        System.out.println("Fin de contar");
    }

    public static int sumar(int[] numeros) {
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        return total;
    }

    public static int calcularMedia(int[] numeros) {
        int media = 0;
        int contador = 0;
        for (int numero : numeros) {
            media += numero;
            ++contador;
        }
        media = media / contador;
        return media;

    }

    public static int obtenerMaximo(int[] numeros) {
        int numMax = 0;
        for (int numero : numeros) {
            if (numMax < numero) {
                numMax = numero;
            }
        }
        return numMax;
    }

    public static void contarPares(int[] numeros) {
        System.out.println("Empezando a mostrar los pares");
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {

                System.out.println(numero + " es par");
                ++contador;
            }

        }
        System.out.println("Hay " + contador + " pares");
        System.out.println("Fin de mostrar los pares");
    }

    public static void buscarPrimero(int[] numeros) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Que numero deseas buscar?");
        int numElegido = sc.nextInt();
        boolean encontrado = false;
        int posicion = 0;
        while (posicion < numeros.length && encontrado == false) {
            if (numeros[posicion] == numElegido) {
                System.out.println("El numero elegido esta en la posicion " + posicion);
                encontrado = true;
            }
            ++posicion;
        }
        if (encontrado == false) {
            int noEncontrado = -1;
            System.out.println("El numero elegido esta en la posicion " + noEncontrado);
        }
    }
}
      
    

