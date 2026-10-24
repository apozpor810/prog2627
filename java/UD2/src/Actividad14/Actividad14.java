package Actividad14;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pedimos el numero hasta el cual quiere contar
        System.out.print("Introduce el numero hasta el que quieres contar: ");
        int limite = sc.nextInt();
        //Declaramos el primer numero por el cual empieza a contar
        int numero = 1; 
        
        do {
            System.out.println("Numero: " + numero);
            numero++;
        } while (numero <= limite);
    }
}