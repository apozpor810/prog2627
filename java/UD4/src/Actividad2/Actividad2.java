/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

import java.util.Scanner;

/**
 *
 * @author Cristineya
 */
public class Actividad2 {
    
        public static void main(String[] args) {
        
        // Variables
        double[] temperaturas = new double[5];
        
        // Pedir datos al usuario
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<temperaturas.length; i++) {
            
            System.out.println("Introduce el valor de temperatura: ");
            
            temperaturas[i] = sc.nextDouble();
            
        }
        
        for(int i=0; i<temperaturas.length; i++) {
            
            System.out.println("Temperatura dia " + (i+1) + ": " + temperaturas[i]);
            
        }
        
        System.out.println("Se han almacenado " + temperaturas.length + " temperaturas");
        
        for (int i=0; i<temperaturas.length; i++) {
            
            if(temperaturas[i] != 0.0) System.out.println(temperaturas[i]);
            
        }
        
    }
    
    
}
