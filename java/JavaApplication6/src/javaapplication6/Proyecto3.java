/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import Proyecto.Proyecto;
/**
 *
 * @author 02_1DAW
 */


import Proyecto.*;
import static Proyecto.Proyecto.sumar;
import static Proyecto.Proyecto.restar;
import static Proyecto.Proyecto.multiplicar;
import static Proyecto.Proyecto.dividir;
import java.util.Scanner;

public class Proyecto3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double num2 = sc.nextDouble();
        
        System.out.println("Elige una opcion Matematica");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicacion");
        System.out.println("4 Division");
        int opcion = sc.nextInt();



        switch (opcion) {

            case 1:

                System.out.println("Has seleccionado la suma");

                double suma = sumar(num1, num2);

                System.out.println(num1 + " + " + num2 + " : " + suma);

                break;

            case 2:

                System.out.println("Has seleccionado la resta");

                double resta = restar(num1, num2);

                System.out.println(num1 + " - " + num2 + " : " + resta);

                break;
            case 3:

                System.out.println("Has seleccionado la resta");

                double multiplica = multiplicar(num1, num2);

                System.out.println(num1 + " * " + num2 + " : " + multiplica);

                break;
            case 4:

                System.out.println("Has seleccionado la resta");

                double divide = dividir(num1, num2);

                System.out.println(num1 + " / " + num2 + " : " + divide);

                break;
            default: 
                System.out.println("Opcion invalida");
                break;
        }
    }
}
