/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad14;

/**
 *
 * @author Cristineya
 */
public class Actividad14 {
    
    public static void main(String[] args) {
        
        // Varible
        int[] numeros = {2, 5, 2, 8, 2, 9, 5, 2};
        
        //int numeroBuscado;
        
        int contador;
        
        // Mostar el array
        System.out.println("\nEl array es:");
        
        for (int i=0; i<numeros.length; i++) {
            
            System.out.print(numeros[i] + " ");
            
        }
        
        System.out.println("\n");
        
        for (int i=0; i<numeros.length; i++) {
            
            contador = 0;
            
            for (int j=0; j<numeros.length; j++) {
                
                if (numeros[j] == numeros[i]) {
                    
                    contador++;
                
                }
                
            }
            
            System.out.println("El numero " + numeros[i] + " aparece " + contador);
            
        }
    }
    
}
