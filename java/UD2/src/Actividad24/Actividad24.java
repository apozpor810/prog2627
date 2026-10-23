package Actividad24;

public class Actividad24 {

    public static void main(String[] args) {
        int suma = 0;
        int i = 1;
        while (i <= 100) {
            ++i;
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        System.out.println("La suma da " + suma);
    }
}
