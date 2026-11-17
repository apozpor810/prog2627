
package Actividad12;

import java.util.Scanner;


public class Actividad12 {
        public static void main(String[] args) {
        
        // Varible
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};
        
        int numeroBuscado;
        
        // Mostar el array
        System.out.println("\nEl array es:");
        
        for (int i=0; i<numeros.length; i++) {
            
            System.out.print(numeros[i] + " ");
            
        }
        
        // Pedir el numero buscado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\nIntroduce el numero a buscar en el array:");
        
        numeroBuscado = sc.nextInt();
        
        // Recorrer el array y mostrar el si se ha encontrado
        for (int numero : numeros) {
            
            if(numero == numeroBuscado) System.out.println("El numero " + numeroBuscado + " esta presente en el array");
            
        }
        
    }
    

}
