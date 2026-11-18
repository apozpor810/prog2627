
package Actividad4;

public class Actividad4 {
    public static void main(String[] args) {
        
        int[] numeros = {10, 8, 6, 4, 2, 0};
        
        int temporal;
        
        
        System.out.println("\nArray antes:");
        
        mostrarArray(numeros);
        
        for (int i=0; i<(numeros.length/2); i++) {
            
            temporal = numeros[i];
            
            numeros[i] = numeros[(numeros.length-1)-i];
            
            numeros[(numeros.length-1)-i] = temporal;
            
        }
        
        
        System.out.println("\nArray despues:");
        
        mostrarArray(numeros);
        
    }
    
    public static void mostrarArray(int[] numerosArray) {
        
        for (int i=0; i<numerosArray.length; i++) {
            
            System.out.println(numerosArray[i]);
            
        }
        
    }
    
} 

