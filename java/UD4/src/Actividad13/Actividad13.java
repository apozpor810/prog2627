/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad13;

import java.util.Scanner;

/**
 *
 * @author Cristineya
 */
public class Actividad13 {
    
    public static void main(String[] args) {
        
        // Varible
        int[] numeros = {12, 5, 8, 21, 5, 4, 16, 9, 5};
        
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
        for (int i=0; i<numeros.length; i++) {
            
            if(numeros[i] == numeroBuscado) System.out.println("El numero " + numeroBuscado + " se encuentra en la posicion " + i);
            
        }
        
    }
    
}
