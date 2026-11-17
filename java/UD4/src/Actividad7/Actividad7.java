/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad7;

import java.util.Scanner;

/**
 *
 * @author Cristineya
 */
public class Actividad7 {
        public static void main(String[] args) {
        
        // Variables
        double[] temperaturas = new double[7];
        
        double media;
        
        double tempMaxima, tempMinima;
        
        int contador;
        
        double tempSuperar;
        
        
        // Pedir los datos al usuario
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<temperaturas.length; i++) {
            
            System.out.println("Introduce la temperatura:");
            
            temperaturas[i] = sc.nextDouble();
            
        }
        
        // Mostrar por pantalla las temperaturas
        mostrarArray(temperaturas);
        
        // Calcular la temperatura media      
        media = mediaArray(temperaturas);
        
        System.out.println("\nLa temperatura media es: " + media);
        
        // Temperatura maxima y minima
        tempMaxima = maximoArray(temperaturas);
        
        tempMinima = minimoArray(temperaturas);
        
        System.out.println("\nLa temperatura maxima es: " + tempMaxima);
        
        System.out.println("\nLa temperatura minima es: " + tempMinima);
        
        // Dias supera los 25 grados
        tempSuperar = 25;
        
        contador = arraySuperaValor(temperaturas, tempSuperar);
        
        System.out.println("\nHay " + contador + " dias que superan la temperatura de " + tempSuperar + " grados");
        
    }
    
    public static void mostrarArray(double[] numerosArray) {
        
        System.out.println("\nEl array es:");
        
        for (int i=0; i<numerosArray.length; i++) {
            
            System.out.println(numerosArray[i]);
            
        }
        
    }
    
    public static double mediaArray(double[] numerosArray) {
        
        double suma, media;
        
        suma = 0;
        
        for (int i=0; i<numerosArray.length; i++) {
            
            suma += numerosArray[i];
            
        }
        
        media = suma / numerosArray.length;
        
        return media;
        
    }
    
    public static double maximoArray(double[] numerosArray) {
        
        double temp = numerosArray[0];
        
        for (int i=0; i<numerosArray.length; i++) {
            
            if (temp < numerosArray[i]) temp=numerosArray[i];
            
        }
        
        return temp;
        
    }
    
    public static double minimoArray(double[] numerosArray) {
        
        double temp = numerosArray[0];
        
        for (int i=0; i<numerosArray.length; i++) {
            
            if (temp > numerosArray[i]) temp=numerosArray[i];
            
        }
        
        return temp;
        
    }
    
    public static int arraySuperaValor(double[] numerosArray, double valorSuperar) {
        
        int contador = 0;
        
        for (int i=0; i<numerosArray.length; i++) {
            
            if (numerosArray[i] > valorSuperar) contador++;
            
        }
        
        return contador;
        
    }
    
}

