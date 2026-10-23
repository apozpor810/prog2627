package Actividad23;

public class Actividad23 {

    public static void main(String[] args) {
        int numero = 100;
        int suma = 0;
        while (numero >= 0) {
            suma = suma + numero;
            --numero;
        }
        System.out.println("La suma es " + suma);
    }
}
