package Actividad28;

import java.util.Scanner;

public class Actividad28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Creamos las variables
        double resultado = 0;
        int contador = 0;
        int numero = 1;
        int finalizacion = 0;
        int controlador = 1;

        System.out.println("Ingresa los numeros que desees y sal con el numero 0");
        while (numero != finalizacion) {
            //Pedimos los numeros
            numero = sc.nextInt();
            
            //en este if si numero es distinto
            if (numero != 0) {
                resultado += numero;
                ++contador;
            }
        }
        System.out.println("La media de numeros es " + resultado / contador);

    }
}
