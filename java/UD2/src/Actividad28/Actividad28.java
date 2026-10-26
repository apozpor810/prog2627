package Actividad28;

import java.util.Scanner;

public class Actividad28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double resultado = 0;
        int contador = 0;
     
        while (sc.hasNextDouble()){
        resultado += sc.nextDouble();
        ++contador;
        }
        System.out.println("La media de numeros es " + resultado/contador);
    }

}
