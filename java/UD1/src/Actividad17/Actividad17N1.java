package Actividad17;

public class Actividad17N1 {
     public static void main(String args[]) {
         
     //Precio sin descuento
     double price = 120;
     
    //Dinero que tenemos
     double money = 300;
     
     //Descuento
     double descuento = 0.15;
     
     //Lo que da es lo que hay que restarle al precio original
     double descontado = price * descuento;
     
     //Este es el precio final despues de restarle el descuento
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
