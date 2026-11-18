package Actividad18;

import java.util.Scanner;

public class Actividad18 {

    public static void main(String[] args) {
        int[] numeros = {5, 2, 7, 1, 6};
        int[] copiado1 = copiar(numeros);
        int[] copiado2 = copiar(numeros);
        int[] copiado3 = copiar(numeros);
        int[] copiado4 = copiar(numeros);

        sumar(copiado2);
        multiplicar(copiado3);
        rellenar(copiado4);
        mostrar(copiado1);
        mostrar(copiado2);
        mostrar(copiado3);
        mostrar(copiado4);

    }

    public static void mostrar(int[] copiado) {
        System.out.println("Empezando a contar los numeros del array");
        for (int numero : copiado) {
            System.out.println(numero);

        }
        System.out.println("Fin de contar");
    }

    public static void sumar(int[] copiado2) {
        for (int i = 0; i < copiado2.length; i++) {
            copiado2[i] += 1;
        }

    }

    public static void multiplicar(int[] copiado3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero por el cual multiplicar");
        int factor = sc.nextInt();
        for (int i = 0; i < copiado3.length; i++) {
            copiado3[i] *= factor;
        }

    }

    public static void rellenar(int[] copiado4) {
        for (int i = 0; i < copiado4.length; i++) {
            copiado4[i] = 0;
        }
    }

    public static int[] copiar(int[] numeros) {
        int[] copia = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            copia[i] = numeros[i];
        }
        return copia;
    }
}
