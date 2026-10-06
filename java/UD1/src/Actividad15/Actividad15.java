package Actividad15;

public class Actividad15 {
    public static void main(String args[]) {
    int pocion =  0;
    double cuesta = 1.50;
    int mochila = 5;
    double oro = 20.5; 
    int totalp = mochila - pocion;
    boolean mochilaLlena = false;
       
     System.out.println("Tienes " + pocion + " pociones");
      System.out.println("Vas a la tienda de pociones");
      System.out.println();
    System.out.println("Tienda de pociones");
     System.out.println("--------------------");
    System.out.println("Pociones de salud " + cuesta + " Oros");
    System.out.println("Tienes: " + oro + " de Oro");
     System.out.println("Compras " + totalp + " por " + totalp*cuesta + " de Oro");
      System.out.println("Oro restante " + (oro - totalp*cuesta));
     
      pocion = mochila;
      
      mochilaLlena = pocion >= 5;
     
       System.out.println("La Mochila llena " + mochilaLlena);
    }
}
