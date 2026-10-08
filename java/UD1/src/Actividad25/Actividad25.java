
package Actividad25;

import java.util.Scanner;

public class Actividad25 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos lo vendido en Peras a Kilo
    System.out.println("¿Cuantos Kilos de pera has vendido? ");
    double ventaPera = sc.nextDouble();
    
    //Pedimos lo vendido en Manzanas a Kilo
     System.out.println("¿Cuantos Kilos de manzana has vendido? ");
    double ventaManzana = sc.nextDouble();
    
    //Precios al Kilo
    double precioPera = 1.95;
    double precioManzana = 2.35;
    
    //Multiplicamos el precio por el numero de kilos
    ventaPera *= precioPera;
    ventaManzana *= precioManzana;    

    //El calculo del dinero total
    double total = ventaPera += ventaManzana;
    
    System.out.println("El dinero total recaudado por las peras es " + ventaPera + "euros");
    System.out.println("El dinero total recaudado por las manzanas es " + ventaManzana + "euros");
    System.out.println("El dinero total recaudado es " + total + "euros");  
    }
}
