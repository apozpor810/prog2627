
package Actividad7;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                
       //Pedir año
 System.out.println("Ingrese el año ");
 int año = sc.nextInt();
 
 //Primero que sea divisible entre 4
 if (año % 4 == 0){
     //Si sale positivo se comprueba si se puede entre 100
     if (año % 100 == 0){
         //Si sale positivo se comprueba entre 400 y si sale positivo es bisiesto
        if (año % 400 == 0){System.out.println("Este año " + año + " es bisesto");}
        //Si sale negativo sale que no es bisiesto
        else {System.out.println("Este año " + año + " no es bisiesto");}
 ;}    //Si en el entre 100 sale negativo sale que es bisiesto
     else {System.out.println("Este año " + año + " es bisesto");}
 }  //Si el entre 4 sale negattivo no es bisiesto
 else {System.out.println("Este año " + año + " no es bisiesto");}
    }
}
