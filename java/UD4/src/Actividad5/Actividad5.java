
package Actividad5;

import java.util.Scanner;


public class Actividad5 {
        public static void main(String[] args) {
        
        // Variables
        int tamanioArray;
        
        int indiceDado;
        
        // Pedir los datos al usuario
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño del array:");
        
        tamanioArray = sc.nextInt();
        
        String[] arrayTexto = new String[tamanioArray];
        
        
        Scanner sc2 = new Scanner(System.in);
        
        for(int i=0; i<arrayTexto.length; i++) {
            
            System.out.println("\nIntroduce el valor del array: (String)");
            
            arrayTexto[i] = sc2.nextLine();
            
        }
        
        
        System.out.println("\nIntroduce la posicion del array que quiere ver:");
        
        indiceDado = sc2.nextInt();
        
        if(indiceDado >= 0 && indiceDado < arrayTexto.length) {
            
            System.out.println("El valor consultado es: \"" + arrayTexto[indiceDado] + "\"");
            
        } else {
            
            System.out.println("No has introducido una posicion valida.");
            
        }
        
    }
    
}

