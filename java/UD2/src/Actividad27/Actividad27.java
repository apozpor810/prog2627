
package Actividad27;

import java.util.Scanner;

public class Actividad27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pedimos el numero a comprobar
        System.out.print("Introduce un numero entero positivo: ");
        int numero = sc.nextInt();
        //Creamos una variable booleano
        boolean esPrimo = true;
        
        //Si pones un numero negativo o 1 este if te manda al System que pone que no es primo
        if (numero <= 1) {
            esPrimo = false;
        //Si pones un numero mayor a 1 comienza esta parte que comienza declarando i
        } else {
            int i = 2;
            //Este es un bucle para comprobar si es primo, i tiene que ser menor al numero dado
            //pero tambien esPrimo debe estar en true para que continue
            while (i < numero && esPrimo) {
                //Si es divisible entre i y el resto da 0 significa que no es primo
                if (numero % i == 0) {
                    esPrimo = false; 
                }
                //Este +1 continuo es para que pruebe a dividir con todos los numeros
                i++;
            }
        }
        
        if (esPrimo) {
            System.out.println("El numero " + numero + " es primo.");
        } else {
            System.out.println("El numero " + numero + " no es primo.");
        }
    }
}