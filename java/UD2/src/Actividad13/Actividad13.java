
package Actividad13;

import java.util.Scanner;

public class Actividad13 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero positivo:");
        
        
        //Pedimos el numero
        int numeroPedido = sc.nextInt();
        //hacemos una variable para el contador
        int contador = 1;
        
        
        //Si ponemos este if nos corrige el numero negativo a positivo

        if (numeroPedido < 0) numeroPedido = numeroPedido * -1;
        
        System.out.println("Iniciamos la cuenta:");
        
        while(contador <= numeroPedido) {

            System.out.println(contador);
            
            contador++;
            
        }
        
    }
    
}