package Actividad12;

import java.util.Scanner;

public class Actividad12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero hasta al que quiera contar");
        int numero = sc.nextInt();
        int inicial = 1;
     
        System.out.println("Comenzamos a contar");
        while (inicial <= numero) {System.out.println(inicial);
        ++inicial;
        }
    }
}
