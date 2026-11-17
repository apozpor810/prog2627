
package Actividad14;

public class Actividad14 {
    
    public static void main(String[] args) {

        int[] numeros = {2, 5, 2, 8, 2, 9, 5, 2};

        int contador;

        System.out.println("El array es:");
        
        for (int i=0; i<numeros.length; i++) {
            
            System.out.print(numeros[i] + " ");
            
        }
        
        System.out.println("");
        
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
