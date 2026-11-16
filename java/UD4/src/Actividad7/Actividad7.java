package Actividad7;

import java.util.Scanner;

public class Actividad7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperatura = new double[7];
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Ingrese la temperatura de hoy");
            temperatura[i] = sc.nextDouble();
            System.out.println("Dia: " + (i + 1) + " Temperatura " + temperatura[i]);
        }

        double suma = 0;
        for (double temperaturas : temperatura) {
            suma += temperaturas;
        }
        double media = suma / temperatura.length;

        System.out.println("La media de la temperatura es " + media);

        double maxima = temperatura[0];

        for (double tempMax : temperatura) {
            if (maxima < tempMax) {
                maxima = tempMax;
            }
        }

        System.out.println("La temperatura mas elevada es " + maxima);

        double minimo = temperatura[0];

        for (double tempMin : temperatura) {
            if (minimo > tempMin) {
                minimo = tempMin;
            }
        }

        System.out.println("La temperatura mas elevada es " + minimo);

        System.out.println("La temperatura mas elevada es " + maxima);

        int contador = 0;

        for (double temp : temperatura) {
            if (temp > 25) {
               ++contador;
            }
        }

        System.out.println("Dias que superaron los 25 grados " + contador);

    }
}
