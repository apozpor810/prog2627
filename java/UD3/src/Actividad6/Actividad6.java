package Actividad6;

import java.util.Scanner;

public class Actividad6 {

    public static void main(String[] args) {
        
    }

    // Introducir las notas
    public static void leerNota() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa sus 3 notas");
        System.out.println("Nota 1");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2");
        double nota2 = sc.nextDouble();
        System.out.println("Nota 3");
        double nota3 = sc.nextDouble();

    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public static double obtenerNotaMaxima(double nota1, double nota2, double nota3) {
        double notaMax;
        if (nota1 > nota2 && nota1 > nota3) {
            notaMax = nota1;
        } else if (nota2 > nota3) {
            notaMax = nota2;
        } else {
            notaMax = nota3;
        }
        return notaMax;

    }

    public static boolean estaAprobado(double media) {
        boolean aprobado = false;
        if (media >= 5) {
            aprobado = true;
        }
        return aprobado;
    }

    public static void mostrarResultados(double media, double notaMax, boolean aprobado) {
        System.out.println("La nota media es " + media);
        System.out.println("La nota mas alta es " + notaMax);
        System.out.println("¿Está aprobado? " + aprobado);

    }
}
