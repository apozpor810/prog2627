
package Actividad3;

import java.util.Scanner;



public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio de lo comprado");
        double precio = sc.nextDouble();
        System.out.println("Ingrese el descuento de lo comprado");
        double descuento = sc.nextDouble();
        System.out.println("Ingrese el % de los impuestos de lo comprado");
        double impuesto = sc.nextDouble();
        
        System.out.println("El precio total a pagar es " + calculoPrecio(precio, descuento, impuesto));
    }
    
    
 public static double calculoPrecio(double precio, double descuento, double impuesto){
     
     double resultado = precio * (1 - descuento / 100) * (1 + impuesto / 100);
     
     return resultado;
 }
}
