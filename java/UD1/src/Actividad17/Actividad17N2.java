package Actividad17;

//import java.util.Scanner;

public class Actividad17N2 {
    public static void main(String args[]) {
    //Scanner sc = new Scanner(System.in);
    // int segundosTotales = sc.nextInt();
    
    int segundosTotales = 3725;
    //Como horas tiene 3600 segundos / 3600
    int horas = segundosTotales / 3600;
    //Sobrante son los segundos que sobran de la division de horas
    int sobrante = segundosTotales % 3600;
    //Lo sobrante /60 porque son los segundos que tiene un minuto y lo que sobra esta en segundos
    int minutos = sobrante / 60;
    //Y hacemos la misma opercaión que el sobrante para poner los segundos que sobran
    int segundos = sobrante % 60;
        
     System.out.println(horas + " h " + minutos + " min " + segundos + " sec");
        
    }
}
