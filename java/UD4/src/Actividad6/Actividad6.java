
package Actividad6;

public class Actividad6 {
        public static void main(String[] args) {
        
        int[] numeros = {5, 12, 33, 7, 9, 18};
              
        System.out.println("Usando un for");
        
        for(int i=0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
            
        }
        
        System.out.println("Usando un for-each");
        
        for(int num : numeros){
            
            System.out.println(num);
            
        }
        
        System.out.println("Mostrando solo los numeros mayores de 10");
        
        for(int i=0; i<numeros.length; i++) {
            
            if(numeros[i] > 10) System.out.println(numeros[i]);
            
        }
        
    }
    
}
