package Actividad22;

public class Actividad22 {

    public static void main(String[] args) {
        int numero = 1;
        int suma = 0;
        while (numero <= 100) {
            suma = suma + numero;
            ++numero;
        }
        System.out.println("La suma es " + suma);
    }
}
