
package Actividad8;

import Actividad7.Actividad7;

public class Actividad8 {
    
    public static void main(String[] args) {
        
        // Variables
        double[] precios = {10.0, 15.5, 20.0, 8.5, 12.0};
        
        double incremento = 0.05;
        
        double media, contador;
        
        double valorASuperar = 15;
        
        // Mostrar el array
        Actividad7.mostrarArray(precios);
        
        // Incrementar los precios
        incrementarArray(precios, incremento);
        
        // Mostar el array
        Actividad7.mostrarArray(precios);
        
        // Calcular la media
        media = Actividad7.mediaArray(precios);
        
        System.out.println("\nLa media es: " + media);
        
        // Valores a superar 15 euros
        contador = Actividad7.arraySuperaValor(precios, valorASuperar);
        
        System.out.println("\nHay " + contador + " valores que superan " + valorASuperar);
    }
    
    public static double[] incrementarArray(double[] numerosArray, double valorIncrementar) {
        
        for (int i=0; i<numerosArray.length; i++) {
            
            numerosArray[i] = numerosArray[i] + (numerosArray[i] * valorIncrementar);
            
        }
        
        return numerosArray;
        
    }
    
}

