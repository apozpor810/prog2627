package Actividad17;

public class Actividad17N1 {
     public static void main(String args[]) {
     double price = 120;
     double money = 300;
     double descuento = 0.15;
     double descontado = price * descuento;
     double precioFinal = price - descontado;
     
     System.out.println("Tienda");
     System.out.println("----------------------------------");
     System.out.println("Armadura de Platino Coste: " + price + " Rebajado a " + precioFinal);
     System.out.println("Creditos Disponible " + money);
     System.out.println("----------------------------------");
     System.out.println("Comprado ");
     System.out.println("Creditos actuales " + (money - precioFinal));
     }
}
