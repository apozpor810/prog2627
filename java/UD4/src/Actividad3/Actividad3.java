
package Actividad3;

import java.util.Scanner;


public class Actividad3 {
        public static void main(String[] args) {
        
        // Variable
        double[] precios = new double[5];
        
        int indiceModificar;
        
        // Pedir los datos al usuario
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<precios.length; i++) {
            
            System.out.println("Introduce el precio del producto:");
            
            precios[i] = sc.nextDouble();
            
        }
        
        for (int i=0; i<precios.length; i++) {
            
            System.out.println(precios[i]);
            
        }
        
        System.out.println("Introduce el valor que quieres modificar (0-4):");

        indiceModificar = sc.nextInt();
        
        if(indiceModificar > precios.length || indiceModificar < 0) {
            
            System.out.println("Esta fuera de rango\n");
            
        } else{
            
            System.out.println("Introduce el nuevo precio:");
        
            precios[indiceModificar] = sc.nextDouble();
            
        }
        
        
        for (int i=0; i<precios.length; i++) {
            
            System.out.println(precios[i]);
            
        }
        
   
        for (int i=0; i<precios.length; i++) {
            
            precios[i] = precios[i] * 1.21;
            
        }
        
        for (int i=0; i<precios.length; i++) {
            
            System.out.println(precios[i]);
            
        }
        
    }
    
}
