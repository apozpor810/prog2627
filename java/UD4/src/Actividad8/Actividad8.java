
package Actividad8;

import Actividad7.Actividad7;

public class Actividad8 {
    
    public static void main(String[] args) {
        
        double[] precios = {10.0, 15.5, 20.0, 8.5, 12.0};
        
        double incremento = 0.05;
        
        double valorASuperar = 15;
        

        Actividad7.mostrarArray(precios);
        

        incrementarArray(precios, incremento);
        

        Actividad7.mostrarArray(precios);
        
        double media = Actividad7.mediaArray(precios);
        
        System.out.println("La media es: " + media);
        
        double contador = Actividad7.arraySuperaValor(precios, valorASuperar);
        
        System.out.println("Hay " + contador + " valores que superan " + valorASuperar);
    }
    
    public static double[] incrementarArray(double[] numerosArray, double valorIncrementar) {
        
        for (int i=0; i<numerosArray.length; i++) {
            
            numerosArray[i] = numerosArray[i] + (numerosArray[i] * valorIncrementar);
            
        }
        
        return numerosArray;
        
    }
    
}

