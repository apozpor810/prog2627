package Actividad17;

import java.util.Scanner;

public class Actividad17N2 {
    public static void main(String args[]) {
    
    int segundosTotales = 3725;
    int horas = segundosTotales / 3600;
    int sobrante = segundosTotales % 3600;
    int minutos = sobrante / 60;    
    int segundos = sobrante % 60;
        
     System.out.println(horas + " h " + minutos + " min " + segundos + " sec");
        
    }
}
