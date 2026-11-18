package Actividad7;

import java.util.Scanner;

public class Actividad7 {

    public static void main(String[] args) {

        double[] temperaturas = new double[7];

        double tempMaxima, tempMinima;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < temperaturas.length; i++) {

            System.out.println("Introduce la temperatura:");

            temperaturas[i] = sc.nextDouble();

        }

        mostrarArray(temperaturas);

        double media = mediaArray(temperaturas);

        System.out.println("La temperatura media es: " + media);

        tempMaxima = maxArray(temperaturas);

        tempMinima = minArray(temperaturas);

        System.out.println("La temperatura maxima es: " + tempMaxima);

        System.out.println("La temperatura minima es: " + tempMinima);

        double tempSuperar = 25;

        int contador = arraySuperaValor(temperaturas, tempSuperar);

        System.out.println("Hay " + contador + " dias que superan la temperatura de " + tempSuperar + " grados");

    }

    public static void mostrarArray(double[] numerosArray) {

        System.out.println("El array es:");

        for (int i = 0; i < numerosArray.length; i++) {

            System.out.println(numerosArray[i]);

        }

    }

    public static double mediaArray(double[] numerosArray) {

        double suma, media;

        suma = 0;

        for (int i = 0; i < numerosArray.length; i++) {

            suma += numerosArray[i];

        }

        media = suma / numerosArray.length;

        return media;

    }

    public static double maxArray(double[] numerosArray) {

        double temp = numerosArray[0];

        for (int i = 0; i < numerosArray.length; i++) {

            if (temp < numerosArray[i]) {
                temp = numerosArray[i];
            }

        }

        return temp;

    }

    public static double minArray(double[] numerosArray) {

        double temp = numerosArray[0];

        for (int i = 0; i < numerosArray.length; i++) {

            if (temp > numerosArray[i]) {
                temp = numerosArray[i];
            }

        }

        return temp;

    }

    public static int arraySuperaValor(double[] numerosArray, double valorSuperar) {

        int contador = 0;

        for (int i = 0; i < numerosArray.length; i++) {

            if (numerosArray[i] > valorSuperar) {
                contador++;
            }

        }

        return contador;

    }

}
