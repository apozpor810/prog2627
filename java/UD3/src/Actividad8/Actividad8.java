
package Actividad8;

public class Actividad8 {
    public static void main(String[] args) {
        //int para que salga un numero entero, math * 10 random para que 
        //escoja un numero del 0 al 9 y el + 1 para arreglarlo 
        //y salga del 1 al 10
        int num = (int) (Math.random() * 10) + 1;
        
        System.out.println("El numero aleatorio que ha salido es " + num);
    }
}
